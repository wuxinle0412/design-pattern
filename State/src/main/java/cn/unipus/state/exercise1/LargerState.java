package cn.unipus.state.exercise1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 16:20
 */
public class LargerState extends State {

  public LargerState(State state) {
    super(state);
  }

  @Override
  public void display() {
    System.out.println("二倍大小显示!");
    System.out.println("当前为二倍大小状态！");
    this.screen.setState(new LargestState(this));
  }
}
