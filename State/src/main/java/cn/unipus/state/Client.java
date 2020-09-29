package cn.unipus.state;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 15:48
 */
public class Client {
  public static void main(String[] args) {
    Account account = new Account("段誉", 0.0);
    account.deposit(1000);
    account.withdraw(2000);
    account.deposit(3000);
    account.withdraw(4500);
    account.withdraw(1000);
    account.computeInterest();
  }
}
