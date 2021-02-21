package org.example.singleton.eager;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/26 21:39
 * Description: 饿汉式单例模式
 *              当类被加载时，静态变量instance会被初始化，此时类的私有构造器会被调用，单例类的唯一实例将被创建。
 *              但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class EagerSingleton {
  private static final EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {}

  public static EagerSingleton getInstance() {
    return instance;
  }

  public static void main(String[] args) {
    EagerSingleton s1 = EagerSingleton.getInstance();
    EagerSingleton s2 = EagerSingleton.getInstance();
    System.out.println(s1 == s2);
  }

}
