package org.example.factorymethod;

import org.example.factorymethod.factory.LoggerFactory;
import org.example.factorymethod.factory.FileLoggerFactory;
import org.example.factorymethod.product.Logger;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/29 0:23
 * Description: 客户端测试类
 */
public class Client {
  public static void main(String[] args) {
    LoggerFactory factory;
    Logger logger;
    factory = new FileLoggerFactory();
    logger = factory.createLogger();
    logger.writeLog();
  }
}
