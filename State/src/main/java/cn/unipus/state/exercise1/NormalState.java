package cn.unipus.state.exercise1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 16:17
 */
public class NormalState extends State {

  public NormalState(Screen screen) {
    super(screen);
  }

  public NormalState(State state) {
    super(state);
  }

  @Override
  public void display() {
    System.out.println("正常大小显示!");
    System.out.println("当前为正常状态!");
    this.screen.setState(new LargerState(this));
  }

}
