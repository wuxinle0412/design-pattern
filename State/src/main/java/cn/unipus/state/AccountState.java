package cn.unipus.state;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/11 14:05
 */
public abstract class AccountState {
  protected Account account;
  public abstract void deposit(double amount);
  public abstract void withdraw(double amount);
  public abstract void computeInterest();
  public abstract void stateCheck();
}
