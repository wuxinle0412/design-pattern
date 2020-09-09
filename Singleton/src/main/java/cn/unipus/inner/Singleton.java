package cn.unipus.inner;


/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/26 21:59
 * Description: 使用静态内部类的方式创建单例模式
 *              使用静态内部类实现的单例模式可以实现延迟加载，保证线程安全，不影响系统性能。
 */
public class Singleton {
  private Singleton() {}

  // 静态内部类
  private static class SingletonHander {
    private final static Singleton instance = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHander.instance;
  }

  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2= Singleton.getInstance();

    System.out.println(s1 == s2);
  }
}
