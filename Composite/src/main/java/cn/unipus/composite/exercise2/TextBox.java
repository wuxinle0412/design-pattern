package cn.unipus.composite.exercise2;

public class TextBox extends AbstractControl {
    private String name;

    public TextBox(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractControl control) {
        System.out.println("对不起，不支持该方法!");
    }

    @Override
    public void remove(AbstractControl control) {
        System.out.println("对不起，不支持该方法!");
    }

    @Override
    public AbstractControl getChild(int i) {
        System.out.println("对不起，不支持该方法!");
        return null;
    }

    @Override
    public void view() {
        System.out.println("---正在展示文本框子控件'" + this.name + "'");
    }
}
