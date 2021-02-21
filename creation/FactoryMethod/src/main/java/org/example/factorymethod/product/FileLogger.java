package org.example.factorymethod.product;

import org.example.factorymethod.product.Logger;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:52
 */
public class FileLogger implements Logger {
  public void writeLog() {
    System.out.println("文件日志记录");
  }
}
