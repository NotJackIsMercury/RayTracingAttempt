package jsm.rtx2.rndr;

public final class RayTracer {
	Camera camera;

	Ray ray;

	int xRes;

	int yRes;

	public RayTracer(Camera c) { this(c, 1, 1); }
		
	public RayTracer(Camera c, int x, int y) {
		camera = c;
		ray = new Ray();
		xRes = x;
		yRes = y;
	}

	public int[] rayTrace() { return rayTrace(new int[xRes + yRes * xRes]); }

	public int[] rayTrace(int[] args) {
			final int[] pixels = new int[args.length];
//			pixels[4480] = ;
			System.out.println(pixels.length);

			double fovHlf = camera.fov / 2;
			int index;
			int dy = pixels.length / xRes;

			for (int i = 0; i < xRes; i++) {
				for (int j = 0; j < dy; j++) {
					index = (i + j * xRes);

					//System.out.println(args.length);
					pixels[index] = ray.rayTrace(camera, camera.fov * i / xRes - fovHlf, index);
				}
			}


		return pixels;
	}

	public RayTracer changeResolution(int w, int h) { xRes = w; yRes = h; return this; }
}
