package cn.unipus.state.exercise1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 16:23
 */
public class LargestState extends State {

  public LargestState(State state) {
    super(state);
  }

  @Override
  public void display() {
    System.out.println("四倍大小显示!");
    System.out.println("当前为四倍大小状态!");
    this.screen.setState(new NormalState(this));
  }
}
