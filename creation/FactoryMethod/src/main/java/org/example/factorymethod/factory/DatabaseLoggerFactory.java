package org.example.factorymethod.factory;

import org.example.factorymethod.product.Logger;
import org.example.factorymethod.product.DatabaseLogger;

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
