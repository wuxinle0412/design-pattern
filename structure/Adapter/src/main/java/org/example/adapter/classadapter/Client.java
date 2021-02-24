package org.example.adapter.classadapter;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/2/24 22:19
 */
public class Client {
    public static void main(String[] args) {
        CarController car = new PoliceCarAdapter();
        car.move();
        car.phonate();
        car.twinkle();
    }
}
