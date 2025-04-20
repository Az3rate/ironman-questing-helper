// File: src/main/java/com/devaz/ironmanquesting/IronmanQuestingConfig.java
// Description: Config interface for RuneLite integration, with a sample toggle.
// ⚠️ Required by provideConfig() in IronmanQuestingPlugin. Expandable for future settings.

package com.devaz.ironmanquesting;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("ironmanquesting")
public interface IronmanQuestingConfig extends Config
{
    @ConfigItem(
        keyName = "showSteps",
        name = "Show Quest Steps",
        description = "Toggle the Ironman questing steps overlay"
    )
    default boolean showSteps()
    {
        return true;
    }
}
