package cn.unipus.composite.exercise;

//行政办公室，具体构件类
public class Worker extends AbstractStructure {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractStructure structure) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public void remove(AbstractStructure structure) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public AbstractStructure getChild(int i) {
        System.out.println("对不起，不支持该方法");
        return null;
    }

    @Override
    public void handlePost() {
        System.out.println("----'" + this.name + "'正在处理来自上级的通知。");
    }
}
