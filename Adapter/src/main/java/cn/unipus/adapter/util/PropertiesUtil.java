package cn.unipus.adapter.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:32
 * Description: 从XML文件中返回实例
 */
public class PropertiesUtil {
  //从XML文件中提取具体类的类名，并返回一个实例对象。
  public static Object getBean() throws Exception {
    InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
    Properties properties = new Properties();
    properties.load(in);
    String className = properties.getProperty("className");
    Class c = Class.forName(className);
    in.close();
    return c.newInstance();
  }
}
