// ===== FILE: src/test/java/com/devaz/ironmanquesting/IronmanQuestingPluginTest.java =====
// File: src/test/java/com/devaz/ironmanquesting/IronmanQuestingPluginTest.java
// Description: Unit test for IronmanQuestingPlugin startup sequence.
// ⚠️ Mocks Client, ConfigManager, and OverlayManager to validate plugin behavior without RuneLite context.

package com.devaz.ironmanquesting;

import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.ui.overlay.OverlayManager;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class IronmanQuestingPluginTest
{
    @Test
    public void testPluginStartup() throws Exception
    {
        IronmanQuestingPlugin plugin = new IronmanQuestingPlugin();

        // ✅ Mock required dependencies
        Client mockClient = Mockito.mock(Client.class);
        ConfigManager mockConfigManager = Mockito.mock(ConfigManager.class);
        OverlayManager mockOverlayManager = Mockito.mock(OverlayManager.class);
        IronmanQuestingOverlay mockOverlay = new IronmanQuestingOverlay(mockClient, mockConfigManager);

        // 🔧 Inject mocks using reflection
        setPrivateField(plugin, "client", mockClient);
        setPrivateField(plugin, "overlayManager", mockOverlayManager);
        setPrivateField(plugin, "overlay", mockOverlay);

        // 🚀 Run startup test
        plugin.startUp();

        System.out.println("✅ Plugin startup completed successfully");
    }

    private void setPrivateField(Object target, String fieldName, Object value) throws Exception
    {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }
}
