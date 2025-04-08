package co.edu.uptc.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import co.edu.uptc.Main;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SystemSettingsTest {

    private SystemSettings mockSettings;

    @BeforeEach
    void setUp() {
        mockSettings = mock(SystemSettings.class);
    }

    @Test
    void testValidateEthicsWithExplicitContent() {
        // Arrange
        String explicitDream = "Soñé con algo explícito y violento.";

        // Act
        mockSettings.validateEthics(explicitDream);

        // Assert
        verify(mockSettings).validateEthics(explicitDream);
    }

    @Test
    void testValidateLanguageWithSpecialCharacters() {
        // Arrange
        String specialCharDream = "Soñé con símbolos extraños: @#$%^&*.";

        // Act
        mockSettings.validateLanguage(specialCharDream);

        // Assert
        verify(mockSettings).validateLanguage(specialCharDream);
    }

    @Test
    void testSingletonInstance() {
        // Arrange & Act
        SystemSettings instance1 = SystemSettings.getInstance();
        SystemSettings instance2 = SystemSettings.getInstance();

        // Assert
        assertSame(instance1, instance2, "SystemSettings should return the same instance");
    }

    @Test
    void testMainMethod() {
        // Arrange
        String dream1 = "Sueño 1";
        String dream2 = "Sueño 2";
        String dream3 = "Sueño 3";

        // Act
        Main.main(new String[]{});

        // Assert
        verify(mockSettings).configureSystem(false);
        verify(mockSettings).validateEthics(dream1);
        verify(mockSettings).validateLanguage(dream1);
        verify(mockSettings).validateEthics(dream2);
        verify(mockSettings).validateLanguage(dream2);
        verify(mockSettings).validateEthics(dream3);
        verify(mockSettings).validateLanguage(dream3);
    }
}