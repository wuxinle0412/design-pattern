package cn.unipus.singleton1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/26 21:07
 * Description: 通过类的静态方法保证单例模式
 */
public class Singleton {
  private static Singleton instance = null;

  // 私有构造器
  private Singleton() {}

  // 静态公有工厂方法，返回唯一实例
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
