// File: src/main/java/com/devaz/ironmanquesting/IronmanQuestingPlugin.java
// Description: Main plugin class. Registers overlay on start and removes on shutdown.
// ⚠️ Depends on IronmanQuestingOverlay and IronmanQuestingConfig.

package com.devaz.ironmanquesting;

import com.google.inject.Provides;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@PluginDescriptor(
    name = "Ironman Questing Helper by Az"
)
public class IronmanQuestingPlugin extends Plugin
{
    @Inject
    private OverlayManager overlayManager;

    @Inject
    private IronmanQuestingOverlay overlay;

    @Inject
    private Client client;

    @Override
    protected void startUp()
    {
        System.out.println("[IronmanQuestingPlugin] 🔧 Ironman Questing Helper started");
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown()
    {
        overlayManager.remove(overlay);
        System.out.println("[IronmanQuestingPlugin] ❌ Ironman Questing Helper stopped");
    }

    @Provides
    IronmanQuestingConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(IronmanQuestingConfig.class);
    }
}
