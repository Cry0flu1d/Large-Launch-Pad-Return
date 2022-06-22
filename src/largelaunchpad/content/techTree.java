package largelaunchpad.content;

import mindustry.content.*;
import mindustry.content.TechTree.*;
import mindustry.game.Objectives;

public class techTree{
    public static void load() {

        TechNode node = new TechNode(TechTree.get(Blocks.launchPad), block.largeLaunchPad, block.largeLaunchPad.researchRequirements());
        node.objectives.addAll(new Objectives.SectorComplete(SectorPresets.overgrowth),new Objectives.Research(Blocks.multiplicativeReconstructor));
    }
    
}
