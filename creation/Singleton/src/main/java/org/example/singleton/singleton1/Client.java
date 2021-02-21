package org.example.singleton.singleton1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/26 21:10
 */
public class Client {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    if (s1 == s2) {
      System.out.println("两个对象实例相等。");
    } else {
      System.out.println("两个对象实例是不同对象实例。");
    }
  }
}
