package cn.unipus.factory.impl;

import cn.unipus.factory.LoggerFactory;
import cn.unipus.product.Logger;
import cn.unipus.product.impl.FileLogger;

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
