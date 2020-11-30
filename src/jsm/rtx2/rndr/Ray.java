package jsm.rtx2.rndr;

import jsm.rtx2.phys.Block;

public class Ray {
	public class Light {
		double blue;

		double green;

		double intesity;

		double red;

		public Light() { this(1); }

		public Light(double i) { this(1, 1, 1, i); }

		public Light(double r, double g, double b) { this(r, g, b, 1); }

		public Light(double r, double g, double b, double i) {
			blue = b;
			green = g;
			intesity = 1;
			red = r;
		}
	}

	Ray() {}

	int rayTrace(Camera c, double i, int index) {
		//System.out.println("e");
		Block block;
		double xPos = c.xPos;
		double xRot = c.xRot.doubleValue() + i;
		double yPos = c.yPos;
		double yRot = c.yRot.doubleValue() + i;
		double zPos = c.zPos;

		try {
			while(true) {
				if ((block = c.world.get(xPos, yPos, zPos)).equals(Block.AIR)) {
					xPos += Math.cos(Math.toRadians(xRot));
					yPos += Math.cos(Math.toRadians(yRot));
					zPos += Math.sin(Math.toRadians(xRot));
				} else break; 
			}
		} catch (Exception e) { return 16_744_319; }

		return block.getTexture().pixels[index];
	}
}
