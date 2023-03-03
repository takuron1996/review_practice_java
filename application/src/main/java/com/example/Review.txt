package com.example;

/**
 * エントリーポイント
 *
 */
public class Main {

    /**
     * 与えられた価格と割引率から割引後の価格を計算する関数。
     *
     * @param price
     *            価格
     * @param discount_rate
     *            割引率 (0.0~1.0)
     *
     * @return 割引後の価格
     */
    public static int calc(int price, double discount_rate) {
        int price2 = (int) (price * discount_rate);
        int d = price - price2;
        return d;
    }

    public static void main(String[] args) {
        System.out.println(Main.calc(10, 0.5));
    }

}
