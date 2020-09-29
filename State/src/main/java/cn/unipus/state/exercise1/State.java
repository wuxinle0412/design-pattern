package cn.unipus.state.exercise1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 16:10
 */
public abstract class State {
  protected Screen screen;

  public State(Screen screen) {
    this.screen = screen;
  }

  public State(State state) {
    this.screen = state.screen;
  }

  public abstract void display();
}
