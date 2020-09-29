package cn.unipus.state.exercise1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 16:09
 */
public class Screen {
  private State state;

  public void setState(State state) {
    this.state = state;
  }

  public void display() {
    state.display();
  }
}
