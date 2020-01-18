package cn.unipus.design.strategy;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:19
 * Description: 折扣类，充当抽象策略类
 */
public interface Discount {
  double calculate(double price);
}
