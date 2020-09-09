package cn.unipus.command;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/9/9 11:17
 */
public class FunctionButton {
  private String name;  //功能键名称
  private Command command;  //维持一个抽象命令对象的引用

  public FunctionButton(String name) {
    this.name = name;
  }

  //为功能键注入命令
  public void setCommand(Command command) {
    this.command = command;
  }

  //发送请求方法
  public void onClick() {
    System.out.println("点击功能键: ");
    command.execute();
  }
}
