package com.ljm.cn;

import static org.junit.Assert.assertTrue;

import com.ljm.cn.util.SingleTonMode;
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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        System.out.println("来了，来了");
        SingleTonMode single = SingleTonMode.getSingle();
        System.out.println(single);

        SingleTonMode single1 = SingleTonMode.getSingle();
        System.out.println(single1);

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
