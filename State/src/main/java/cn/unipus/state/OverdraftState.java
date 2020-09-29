package cn.unipus.state;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/11 14:10
 */
//透支状态: 具体状态类
public class OverdraftState extends AccountState {

  public OverdraftState(AccountState state) {
    this(state.account);
  }

  public OverdraftState(Account account) {
    this.account = account;
  }

  @Override
  public void deposit(double amount) {
    account.setBalance(account.getBalance() + amount);
    stateCheck();
  }

  @Override
  public void withdraw(double amount) {
    account.setBalance(account.getBalance() - amount);
    stateCheck();
  }

  @Override
  public void computeInterest() {
    System.out.println("计算利息!");
  }

  @Override
  public void stateCheck() {
    if (account.getBalance() > 0) {
      account.setState(new NormalState(this));
    } else if (account.getBalance() <= -2000) {
      account.setState(new RestrictedState(this));
    }
  }
}
