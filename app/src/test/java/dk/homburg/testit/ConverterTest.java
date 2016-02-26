package dk.homburg.testit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void testInvoke() throws Exception {
        String input = "new string";
        Converter c = new Converter();

        assertEquals("New string", c.invoke(input));

        input = "⚡omething";
        assertEquals("⚡omething", c.invoke(input));

        assertEquals("⚡", c.firstLetter(input));
    }
}