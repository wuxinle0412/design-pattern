package org.example.adapter.example2;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/2/24 23:16
 */
public class Client {
    public static void main(String[] args) {
        Cry dog = new Dog();
        CatchMouse cat = new Cat();
        CatchMouse dogCatchMouse = new CatDogAdapter(dog);
        Cry catCry = new CatDogAdapter(cat);
        dogCatchMouse.catchMouse();
        catCry.cry();
    }
}
