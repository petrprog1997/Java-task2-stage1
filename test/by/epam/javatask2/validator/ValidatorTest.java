package by.epam.javatask2.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidatorTest {

   private Validator validator = new Validator();

    @Test
    public void testValidateShouldReturnTrue() {
        String inputSting = "FreightTaxi  :  Scania ,   3242FS-2 ,  324422, 5  ";
        boolean isValid = validator.validate(inputSting);
        assertTrue(isValid);
    }

    @Test
    public void testValidateShouldReturnFalse() {
        String inputSting = "FreightTaxi  :  Scania ,   -3242FS-2 ,  /324422, 0.5  ";
        boolean isValid = validator.validate(inputSting);
        assertFalse(isValid);
    }
}