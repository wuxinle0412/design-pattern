package cn.unipus.factory;

import cn.unipus.product.Logger;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/28 22:44
 * Description: 日志记录器工厂接口，充当抽象工厂角色
 */
public interface LoggerFactory {
  Logger createLogger();
}
