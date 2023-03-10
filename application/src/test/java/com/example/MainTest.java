package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * サンプルテスト
 *
 */
public class MainTest {
    /**
     * 正常系のテスト
     */
    @Test
    public void calcTest1() {
        assertEquals(Main.calc(10, 0.5), 5);
    }

    /**
     * 割引率が整数のテスト
     */
    @Test
    public void calcTest2() {
        assertEquals(Main.calc(10, 5), -40);
    }

    /**
     * 割引率が1より大きい場合のテスト
     */
    @Test
    public void calcTest3() {
        assertEquals(Main.calc(10, 1.5), -5);
    }

    /**
     * 割引率が0の場合のテスト
     */
    @Test
    public void calcTest4() {
        assertEquals(Main.calc(10, 0), 10);
    }

    /**
     * 割引率が1の場合のテスト
     */
    @Test
    public void calcTest5() {
        assertEquals(Main.calc(10, 1), 0);
    }

    /**
     * 価格がマイナスの場合のテスト
     */
    @Test
    public void calcTest6() {
        assertEquals(Main.calc(-5, 0.5), -3);
    }

    /**
     * 割引率がマイナスの場合のテスト
     */
    @Test
    public void calcTest7() {
        assertEquals(Main.calc(10, -1), 20);
    }
}