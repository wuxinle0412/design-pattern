package cn.unipus.composite.exercise2;

//按钮控件类，充当具体控件类
public class Button extends AbstractControl {
    private String name;

    public Button(String name) {
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
        System.out.println("----正在展示按钮控件'" + this.name + "'");
    }
}
