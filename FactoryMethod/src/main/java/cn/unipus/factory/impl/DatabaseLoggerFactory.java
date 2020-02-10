package cn.unipus.factory.impl;

import cn.unipus.factory.LoggerFactory;
import cn.unipus.product.Logger;
import cn.unipus.product.impl.DatabaseLogger;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:54
 * Description: 数据库日志记录器工厂类，充当具体工厂角色。
 */
public class DatabaseLoggerFactory implements LoggerFactory {
  public Logger createLogger() {
    Logger logger = new DatabaseLogger();
    return logger;
  }
}
