package org.example.factorymethod.factory;

import org.example.factorymethod.product.Logger;
import org.example.factorymethod.product.FileLogger;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:56
 */
public class FileLoggerFactory implements LoggerFactory {
  public Logger createLogger() {
    Logger logger = new FileLogger();
    return logger;
  }
}
