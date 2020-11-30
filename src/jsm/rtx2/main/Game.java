package jsm.rtx2.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Arrays;

import javax.swing.JFrame;

import jsm.rtx2.WorldGeneration;
import jsm.rtx2.phys.Block;
import jsm.rtx2.phys.World;
import jsm.rtx2.rndr.Camera;
import jsm.rtx2.rndr.RayTracer;

@SuppressWarnings("serial")
public final class Game extends JFrame implements Runnable, ComponentListener {
	Camera camera;

	BufferedImage image;

	int[] pixels;

	RayTracer tracer;

	Thread thread;

	World world;

	public Game() {
		world = new World(16, 16, 16);
		WorldGeneration.generateFlat(world, Block.BLOCK2);

		camera = new Camera(world);
		thread = new Thread(this);
		tracer = new RayTracer(camera);

		setTitle("3D Engine");
		setBackground(Color.black);
		setSize(640, 480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentListener(this);
		addKeyListener(camera);
	}

	public void render() {
		BufferStrategy bs = getBufferStrategy();

		if (bs == null) {
			createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

//		if (Math.random() > 0.999)
//			System.out.println(Arrays.toString(((DataBufferInt) image.getRaster().getDataBuffer()).getData()));
		g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);

		bs.show();
	}

	public void run() {
		long delta = 1_000_000_000 / 60;
		long lstUpdt = System.nanoTime();

		while (thread.isAlive()) {
			if (System.nanoTime() - lstUpdt > delta) {
				camera.update();
				tracer.rayTrace(pixels);
			}

			render();
		}

		stop();
	}

	public synchronized void start() {
		setVisible(true);
		if (!thread.isAlive())
			thread.start();
	}

	public synchronized void stop() {
		setVisible(false);
		if (thread.isAlive()) {
			try {
				thread.join();
			} catch (InterruptedException e) {}
		}
	}

	public void componentHidden(ComponentEvent e) {}

	public void componentMoved(ComponentEvent e) {}

	public void componentResized(ComponentEvent e) {
		image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
		tracer.changeResolution(getWidth(), getHeight());
	}

	public void componentShown(ComponentEvent e) {}
}
