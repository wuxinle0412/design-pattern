package cn.unipus.composite.exercise2;

/*
*    某公司要开发一个界面控件库，界面控件分为两大类，一类是单元控件，例如按钮、文本框，一类是容器控件，例如窗体、中间面板等
* 试用组合模式设计界面控件库
*
* AbstractControl(抽象控件类)
*
* Window(容器控件类)
* Panel(容器控件类)
*
* Button(具体控件类)
* TextBox(具体控件类)
*
* */
public abstract class AbstractControl {
    public abstract void add(AbstractControl control);
    public abstract void remove(AbstractControl control);
    public abstract AbstractControl getChild(int i);
    public abstract void view();
}
