package largelaunchpad;

import arc.util.*;
import largelaunchpad.content.block;
import largelaunchpad.content.techTree;
import mindustry.mod.*;


public class LargeLaunchPad extends Mod{

    public LargeLaunchPad(){
        Log.info("Loaded something from v5.");

    }

    @Override
    public void loadContent(){
        Log.info("Loading something from v5.");
        block.load();
        techTree.load();
    }

}
