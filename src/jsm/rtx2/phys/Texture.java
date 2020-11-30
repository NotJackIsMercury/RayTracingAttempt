package jsm.rtx2.phys;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Texture {
	public static final int SIZE = 64;

	public static final Texture WALL2 = new Texture("res/wall2.png", SIZE);

	public int[] pixels;

	private String loc;

	public final int size;

	public Texture(String location, int s) {
		loc = location;
		size = s;
		pixels = new int[size * size];
		load();
	}

	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			//image = (BufferedImage) image.getScaledInstance(SIZE, SIZE, Image.SCALE_SMOOTH);
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
