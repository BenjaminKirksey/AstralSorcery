package hellfirepvp.astralsorcery.common.registry.multiblock;

import hellfirepvp.astralsorcery.common.block.BlockMarble;
import hellfirepvp.astralsorcery.common.lib.BlocksAS;
import hellfirepvp.astralsorcery.common.util.struct.PatternBlockArray;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: MultiblockStarlightInfuser
 * Created by HellFirePvP
 * Date: 11.12.2016 / 16:35
 */
public class MultiblockStarlightInfuser extends PatternBlockArray {

    public MultiblockStarlightInfuser() {
        load();
    }

    //TODO add actual infuser into this
    private void load() {
        IBlockState mar = BlocksAS.blockMarble.getDefaultState().withProperty(BlockMarble.MARBLE_TYPE, BlockMarble.MarbleBlockType.ARCH);
        IBlockState mrw = BlocksAS.blockMarble.getDefaultState().withProperty(BlockMarble.MARBLE_TYPE, BlockMarble.MarbleBlockType.RAW);
        IBlockState mpl = BlocksAS.blockMarble.getDefaultState().withProperty(BlockMarble.MARBLE_TYPE, BlockMarble.MarbleBlockType.PILLAR);
        IBlockState mch = BlocksAS.blockMarble.getDefaultState().withProperty(BlockMarble.MARBLE_TYPE, BlockMarble.MarbleBlockType.CHISELED);

        IBlockState liquidStarlight = BlocksAS.blockLiquidStarlight.getDefaultState();

        addBlockCube(mar, -2, -1, -3, 2, -1, 3);
        addBlockCube(mar, -3, -1, -2, 3, -1, 2);

        addBlock(0, -1, 0, Blocks.LAPIS_BLOCK.getDefaultState());
        addBlock(-2, -1, -1, liquidStarlight);
        addBlock(-2, -1,  0, liquidStarlight);
        addBlock(-2, -1,  1, liquidStarlight);
        addBlock( 2, -1, -1, liquidStarlight);
        addBlock( 2, -1,  0, liquidStarlight);
        addBlock( 2, -1,  1, liquidStarlight);
        addBlock(-1, -1, -2, liquidStarlight);
        addBlock( 0, -1, -2, liquidStarlight);
        addBlock( 1, -1, -2, liquidStarlight);
        addBlock(-1, -1,  2, liquidStarlight);
        addBlock( 0, -1,  2, liquidStarlight);
        addBlock( 1, -1,  2, liquidStarlight);

        addBlock(-2, -2, -1, mrw);
        addBlock(-2, -2,  0, mrw);
        addBlock(-2, -2,  1, mrw);
        addBlock( 2, -2, -1, mrw);
        addBlock( 2, -2,  0, mrw);
        addBlock( 2, -2,  1, mrw);
        addBlock(-1, -2, -2, mrw);
        addBlock( 0, -2, -2, mrw);
        addBlock( 1, -2, -2, mrw);
        addBlock(-1, -2,  2, mrw);
        addBlock( 0, -2,  2, mrw);
        addBlock( 1, -2,  2, mrw);

        addBlock(-3,  0,  3, mpl);
        addBlock(-3,  1,  3, mpl);
        addBlock(-3,  2,  3, mch);
        addBlock(-3,  0, -3, mpl);
        addBlock(-3,  1, -3, mpl);
        addBlock(-3,  2, -3, mch);
        addBlock( 3,  0,  3, mpl);
        addBlock( 3,  1,  3, mpl);
        addBlock( 3,  2,  3, mch);
        addBlock( 3,  0, -3, mpl);
        addBlock( 3,  1, -3, mpl);
        addBlock( 3,  2, -3, mch);
    }

}
