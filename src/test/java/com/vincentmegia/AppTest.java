package com.vincentmegia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        var text = App.process("abcabc");
        assertTrue("2".equals(String.valueOf(text.length())));
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test2() {
        var text = App.process("cccc");
        assertTrue("4".equals(String.valueOf(text.length())));
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test3() {
        var text = App.process("ac");
        assertTrue("1".equals(String.valueOf(text.length())));
    }
}
