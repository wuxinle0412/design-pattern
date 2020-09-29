package cn.unipus.state.exercise1;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/29 16:24
 */
public class Client {
  public static void main(String[] args) {
    Screen screen = new Screen();
    screen.setState(new NormalState(screen));
    screen.display();
    screen.display();
    screen.display();
  }
}
