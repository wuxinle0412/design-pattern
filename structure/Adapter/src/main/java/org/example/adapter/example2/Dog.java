package org.example.adapter.example2;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/2/24 22:30
 */
public class Dog implements Cry {
    @Override
    public void cry() {
        System.out.println("狗叫，汪汪汪");
    }
}
