package cn.unipus.lazy;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/26 21:53
 * Description: 懒汉式单例模式与双重锁定
 */
public class LazySingleton {
  private volatile static LazySingleton instance = null;

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) {
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }
    return instance;
  }

  public static void main(String[] args) {
    LazySingleton s1 = LazySingleton.getInstance();
    LazySingleton s2 = LazySingleton.getInstance();

    System.out.println(s1 == s2);
  }
}
