package be.odisee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @Test
    void getName() {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    void isHappy_AtStart_ReturnsFalse(){
        // Given
        PetRock rocky = new PetRock("Rocky");

        // Assert
        assertFalse(rocky.IsHappy());
    }

    @Test
    void isHappy_AfterPlay_ReturnsTrue(){
        // Given
        PetRock rocky = new PetRock("Rocky");

        // Act
        rocky.play();

        // Assert
        assertTrue(rocky.IsHappy());
    }
}