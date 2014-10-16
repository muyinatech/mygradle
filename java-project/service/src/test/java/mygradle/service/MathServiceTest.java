package mygradle.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class MathServiceTest {

    private MathService mathService = new MathService();

    public void shouldAddNumbers() {

        int result = mathService.add(23,4,39);
        assertEquals(result, 66);
    }

}