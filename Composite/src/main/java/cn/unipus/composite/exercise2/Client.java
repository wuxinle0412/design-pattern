package cn.unipus.composite.exercise2;

//客户端测试类
public class Client {
    public static void main(String[] args) {
        AbstractControl window, panel, button, textbox;

        window = new Window("窗体1");
        panel = new Panel("中间面板1");
        button = new Button("按钮1");
        textbox = new TextBox("文本框1");

        panel.add(button);
        panel.add(textbox);
        window.add(panel);

        window.view();
    }
}
