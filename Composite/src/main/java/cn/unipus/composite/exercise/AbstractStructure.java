package cn.unipus.composite.exercise;

public abstract class AbstractStructure {
    public abstract void add(AbstractStructure structure);
    public abstract void remove(AbstractStructure structure);
    public abstract AbstractStructure getChild(int i);
    public abstract void handlePost();
}
