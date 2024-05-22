package centrale;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerkeerslichtenCentraleTest {

    private VerkeerslichtenCentrale centrale;
    @BeforeEach
    void setUp() {
        centrale = new VerkeerslichtenCentrale();
    }
    @Test
    void schakelLichtUit_alsLichtAan_danUit() {
        //Arrange
        //Act
        centrale.schakelLichtUit(1);
        //Assert
        assertFalse(centrale.verkeerslichtenActief.get(0));
    }
}