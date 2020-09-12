package cn.unipus.composite.exercise2;

import java.util.ArrayList;
import java.util.List;

//容器控件类，充当单元控件、中间面板的容器
public class Window extends AbstractControl {
    private List<AbstractControl> list = new ArrayList<AbstractControl>();
    private String name;

    public Window(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractControl control) {
        list.add(control);
    }

    @Override
    public void remove(AbstractControl control) {
        list.remove(control);
    }

    @Override
    public AbstractControl getChild(int i) {
        return list.get(1);
    }

    @Override
    public void view() {
        System.out.println("****准备展示'" + this.name + "'窗体的子控件.***");
        for (AbstractControl control : list) {
            control.view();
        }
    }
}
