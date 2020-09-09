package cn.unipus.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/26 22:07
 */
public class DatabasePool {

  private List<Connection> list = null;

  private DatabasePool() {
    list = new ArrayList<Connection>();
  }

  private static class DatabasePoolHanlder {
    private static final DatabasePool instance = new DatabasePool();
  }

  public static DatabasePool getInstance() {
    return DatabasePoolHanlder.instance;
  }

  // 添加数据库连接对象
  public void addConnection(Connection connection) {
    list.add(connection);
  }

  //获取数据库连接对象
  public Connection getConnection() {
    Random random = new Random();
    int i = random.nextInt(list.size());
    return list.get(i);
  }
}
