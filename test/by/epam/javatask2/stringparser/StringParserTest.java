package by.epam.javatask2.stringparser;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class StringParserTest {

    private StringParser stringParser = new StringParser();

    @Test
    public void testStringParserShouldReturnTrue() {
        String inputString = "minibus  :  Mercedes , 3434FE-1     24344 ,   14  ,  LUX   ";
        List<String> expectedList = new ArrayList<>(List.of("minibus", "Mercedes", "3434FE-1", "24344", "14", "LUX"));
        List<String> outputList = stringParser.parse(inputString);
        assertEquals(expectedList,outputList);
    }
}