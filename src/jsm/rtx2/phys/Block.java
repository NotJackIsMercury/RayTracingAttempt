package jsm.rtx2.phys;

public class Block {
	public static final Block AIR = new Block();

	public static final Block BLOCK2 = new Block().setHardness(1).setTexture(Texture.WALL2);

	double hardness;

	Texture texture;

	public Block() {}

	public final Block copyHardness(Block args) { return setHardness(args.hardness); }

	public final Block copyTexture(Block args) { return setTexture(args.texture); }

	public final Block setHardness(double args) { hardness = args; return this; }

	public final Block setTexture(Texture args) { texture = args; return this; }

	public final double getHardness() { return hardness; }

	public final Texture getTexture() { return texture; }
}
