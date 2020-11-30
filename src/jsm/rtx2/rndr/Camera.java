package jsm.rtx2.rndr;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jsm.rtx2.phys.Block;
import jsm.rtx2.phys.World;
import jsm.rtx2.util.CappedNumber;
import jsm.rtx2.util.LimittedNumber;

public class Camera implements KeyListener {
	public enum CameraXRotations { EAST, NORTH, SOUTH, WEST }

	boolean backward;

	boolean forward;

	double fov;

	boolean leftward;

	boolean rightward;

	World world;

	double xPos;

	LimittedNumber xRot;

	double yPos;

	CappedNumber yRot;

	double zPos;

	public Camera(World w) { this(CameraXRotations.NORTH, w); }

	public Camera(CameraXRotations rot, World w) {
		xRot = new LimittedNumber(-180, 180);
		yRot = new CappedNumber(-90, 90);
		world = w;

		switch (rot) {
		case EAST:
			xRot.set(-90);
			break;
		case NORTH:
			xRot.set(0);
			break;
		case SOUTH:
			xRot.set(90);
			break;
		case WEST:
			xRot.set(1800);
			break;
		}
	}

	public Camera(CameraXRotations rot, World w, double fov) { this(rot, w); this.fov = fov; }

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A) leftward = true;
		if (e.getKeyCode() == KeyEvent.VK_D) backward = true;
		if (e.getKeyCode() == KeyEvent.VK_S) rightward = true;
		if (e.getKeyCode() == KeyEvent.VK_W) forward = true;
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A) leftward = false;
		if (e.getKeyCode() == KeyEvent.VK_D) backward = false;
		if (e.getKeyCode() == KeyEvent.VK_S) rightward = false;
		if (e.getKeyCode() == KeyEvent.VK_W) forward = false;
	}

	public void keyTyped(KeyEvent e) {}

	public void update() {
		//backward = !world.get(xPos, yPos, zPos).equals(Block.AIR);

		if (backward) {
			xPos -= LimittedNumber.cos(LimittedNumber.toRadians(xRot)).doubleValue();
			zPos -= LimittedNumber.sin(LimittedNumber.toRadians(xRot)).doubleValue();
		} if (forward) {
			xPos += LimittedNumber.cos(LimittedNumber.toRadians(xRot)).doubleValue();
			zPos += LimittedNumber.sin(LimittedNumber.toRadians(xRot)).doubleValue();
		} if (leftward) {
			xPos += LimittedNumber.cos(LimittedNumber.toRadians(xRot)).doubleValue();
			zPos -= LimittedNumber.sin(LimittedNumber.toRadians(xRot)).doubleValue();
		} if (rightward) {
			xPos -= LimittedNumber.cos(LimittedNumber.toRadians(xRot)).doubleValue();
			zPos += LimittedNumber.sin(LimittedNumber.toRadians(xRot)).doubleValue();
		}
	}
}
