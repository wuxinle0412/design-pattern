package cn.unipus.design.strategy;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/1/18 21:18
 * Description: 电影票类，充当环境类
 */
public class MovieTicket {
  private double price;
  private final Discount discount;

  public MovieTicket(Discount discount) {
    this.discount = discount;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return discount.calculate(price);
  }
}
