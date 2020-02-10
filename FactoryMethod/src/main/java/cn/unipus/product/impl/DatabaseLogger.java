package cn.unipus.product.impl;

import cn.unipus.product.Logger;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:50
 * Description: 数据库日志记录器，充当具体产品角色
 */
public class DatabaseLogger implements Logger {
  public void writeLog() {
    System.out.println("数据库日志记录");
  }
}
