package cn.unipus;

import cn.unipus.factory.LoggerFactory;
import cn.unipus.factory.impl.FileLoggerFactory;
import cn.unipus.product.Logger;

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
