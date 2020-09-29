package cn.unipus.composite.exercise;

import java.util.ArrayList;
import java.util.List;

//组织部门，容器构件类
public class Department extends AbstractStructure {
    private List<AbstractStructure> list = new ArrayList<AbstractStructure>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractStructure structure) {
        list.add(structure);
    }

    @Override
    public void remove(AbstractStructure structure) {
        list.remove(structure);
    }

    @Override
    public AbstractStructure getChild(int i) {
        return list.get(i);
    }

    @Override
    public void handlePost() {
        System.out.println("****向下级机关'" + this.name + "'下达通知。");

        //处理通知消息
        for (AbstractStructure structure : list) {
            structure.handlePost();
        }
    }
}
