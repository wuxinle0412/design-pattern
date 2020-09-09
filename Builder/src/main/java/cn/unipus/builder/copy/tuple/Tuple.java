package cn.unipus.builder.copy.tuple;

import java.io.Serializable;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/3/4 22:58
 * Description: 模拟flink tuple实现
 */
public abstract class Tuple implements Serializable {
  private static final long serialVersionUID = 1L;

  /*
  *    获取tuple中指定位置的元素
  * */
  public abstract <T> T getField(int position);

  /*
  *    设置tuple中指定位置元素的值
  * */
  public abstract <T> void setField(T value);
}
