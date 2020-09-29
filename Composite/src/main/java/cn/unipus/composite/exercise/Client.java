package cn.unipus.composite.exercise;

//客户端测试类
public class Client {
    public static void main(String[] args) {
        AbstractStructure department1, department2, department3, department4, worker1,
                worker2, worker3, worker4, worker5, worker6, worker7, worker8;
        department1 = new Department("北京总部");
        department2 = new Department("湖南分校");
        department3 = new Department("长沙教学点");
        department4 = new Department("湘潭教学点");

        worker1 = new Worker("北京总部教务办公室");
        worker2 = new Worker("北京总部行政办公室");
        worker3 = new Worker("湖南分校教务办公室");
        worker4 = new Worker("湖南分校行政办公室");
        worker5 = new Worker("长沙教学点教务办公室");
        worker6 = new Worker("长沙教学点行政办公室");
        worker7 = new Worker("湘潭教学点教务办公室");
        worker8 = new Worker("湘潭教学点行政办公室");

        department4.add(worker7);
        department4.add(worker8);

        department3.add(worker5);
        department3.add(worker6);

        department2.add(worker3);
        department2.add(worker4);
        department2.add(department3);
        department2.add(department4);

        department1.add(worker1);
        department1.add(worker2);
        department1.add(department2);

        department1.handlePost();
    }
}
