package cn.unipus.composite.exercise2;

import java.util.ArrayList;
import java.util.List;

//容器控件类，充当单元控件类的容器
public class Panel extends AbstractControl {
    private List<AbstractControl> list = new ArrayList<AbstractControl>();
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractControl control) {
        list.add(control);
    }

    @Override
    public void remove(AbstractControl control) {
        list.add(control);
    }

    @Override
    public AbstractControl getChild(int i) {
        return list.get(i);
    }

    @Override
    public void view() {
        System.out.println("***正在展示'" + this.name + "'面板容器的子控件.***");
        for (AbstractControl control : list) {
            control.view();
        }
    }
}
