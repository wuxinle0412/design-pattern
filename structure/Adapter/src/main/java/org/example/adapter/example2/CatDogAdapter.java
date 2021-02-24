package org.example.adapter.example2;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/2/24 22:33
 */
public class CatDogAdapter implements Cry, CatchMouse {

    private Cry cry;
    private CatchMouse catchMouse;

    public CatDogAdapter(Cry cry) {
        this.cry = cry;
    }

    public CatDogAdapter(CatchMouse catchMouse) {
        this.catchMouse = catchMouse;
    }

    @Override
    public void catchMouse() {
        System.out.println("狗学抓老鼠");
    }

    @Override
    public void cry() {
        System.out.println("猫学狗叫");
    }
}
