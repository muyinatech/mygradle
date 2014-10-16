package util;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class CommonUtilTest {

    public void shouldAddNumbers() {
        int result = CommonUtil.add(23,4,39);
        assertEquals(result, 66);
    }

}