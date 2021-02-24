package org.example.adapter.example2;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/2/24 22:30
 */
public class Cat implements CatchMouse {
    @Override
    public void catchMouse() {
        System.out.println("猫能够抓老鼠");
    }
}
