package jsm.rtx2.phys;

public class World {
	public final Block[][][] cells;

	public World(int x, int y, int z) {
		cells = new Block[x][y][z];
	}

	public World delete(Number x, Number y, Number z) { return set(x, y, z, null); }

	public Block get(Number x, Number y, Number z) {
		try {
			return cells[x.intValue()][y.intValue()][z.intValue()];
		} catch (Exception e) {
			return Block.AIR;
		}
	}

	public World set(Number x, Number y, Number z, Block b) {
		try {
			if (b == null)
				b = Block.AIR;

			cells[x.intValue()][y.intValue()][z.intValue()] = b;
		} catch (ArrayIndexOutOfBoundsException e) {}

		return this;
	}
}
