package com.jwp.skaia_vh.init;

import com.jwp.skaia_vh.config.UnhingedScavengerConfig;

public class ModConfigs {

    public static UnhingedScavengerConfig UNHINGED_SCAVENGER;

    public static void register() {
        UNHINGED_SCAVENGER = (UnhingedScavengerConfig) (new UnhingedScavengerConfig().readConfig());
    }
}
