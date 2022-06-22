package largelaunchpad.content;

import mindustry.world.Block;
import mindustry.world.blocks.campaign.LaunchPad;
import mindustry.world.meta.*;
import mindustry.content.*;
import mindustry.type.*;

public class block {
    public static Block largeLaunchPad;
    public static void load(){
        largeLaunchPad = new LaunchPad("large-launch-pad"){{
        requirements(Category.effect, BuildVisibility.campaignOnly, ItemStack.with(Items.titanium, 220, Items.silicon, 180, Items.lead, 300, Items.plastanium, 75));
        size = 4;
        itemCapacity = 250;
        launchTime = 60f * 16;
        hasPower = true;
        consumes.power(4f);
    }};
}
}