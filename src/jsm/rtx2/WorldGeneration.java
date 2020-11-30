package jsm.rtx2;

import jsm.rtx2.phys.Block;
import jsm.rtx2.phys.World;

public class WorldGeneration {
	static class FlatPresetLayer {
		Block block;

		int iterations;
	}

	public static FlatPresetLayer createFlatLayer(Block b, int i) {
		FlatPresetLayer layer = new FlatPresetLayer();
		layer.block = b == null ? Block.AIR : b;
		layer.iterations = i;

		return layer;
	}

	public static World generateFlat(World w, Block... b) {
		for (int y = 0; y < b.length; y++) {
			for (int x = 0; x < w.cells.length; x++) {
				for (int z = 0; z < w.cells[0][0].length; z++) {
					w.set(x, y, z, (b[y] == null ? Block.AIR : b[y]));
				}
			}
		}

		return w;
	}

	public static World generateFlat(World w, FlatPresetLayer... f) {
		int d = 0;
		int y = 0;

		for (int i = 0; i < f.length; i++) {
			d = Math.min(d + f[i].iterations, w.cells[0].length);

			for (; y < d; y++) {
				for (int x = 0; x < w.cells.length; x++) {
					for (int z = 0; z < w.cells[0][0].length; z++) {
						w.set(x, y, z, f[y].block);
					}
				}
			}
		}

		return w;
	}
}
