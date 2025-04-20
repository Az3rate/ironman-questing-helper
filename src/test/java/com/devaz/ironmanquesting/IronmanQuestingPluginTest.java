package com.devaz.ironmanquesting;

import net.runelite.api.Client;
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

        // Mock required dependencies
        Client mockClient = Mockito.mock(Client.class);
        OverlayManager mockOverlayManager = Mockito.mock(OverlayManager.class);
        IronmanQuestingOverlay mockOverlay = new IronmanQuestingOverlay(mockClient);

        // Inject mocks into private fields using reflection
        setPrivateField(plugin, "client", mockClient);
        setPrivateField(plugin, "overlayManager", mockOverlayManager);
        setPrivateField(plugin, "overlay", mockOverlay);

        // Run test logic
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
