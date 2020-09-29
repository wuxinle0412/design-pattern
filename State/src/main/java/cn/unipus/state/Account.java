package cn.unipus.state;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/11 14:05
 */
//银行账户:环境类
public class Account {
  private AccountState state;  //维持一个对抽象状态对象的引用
  private String owner;  //开户名
  private double balance = 0;  //账户余额

  public Account(String owner, double init) {
    this.owner = owner;
    this.balance = init;
    this.state = new NormalState(this);

    System.out.println(this.owner + "开户，初始金额为 " + init);
    System.out.println("--------------------------------------");
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setState(AccountState state) {
    this.state = state;
  }

  public void deposit(double amount) {
    System.out.println(this.owner + " 存款 " + amount);
    state.deposit(amount);
    System.out.println("现在余额为 " + this.balance);
    System.out.println("现在账户的状态为 " + this.state.getClass().getName());
    System.out.println("--------------------------");
  }

  public void withdraw(double amount) {
    System.out.println(this.owner + " 取款 " + amount);
    state.withdraw(amount);  //调用状态对象的withdraw()方法
    System.out.println("现在余额为 " + this.balance);
    System.out.println("现在账户状态为 " + this.state.getClass().getName());
    System.out.println("--------------------------");
  }

  public void computeInterest() {
    state.computeInterest();
  }
}
