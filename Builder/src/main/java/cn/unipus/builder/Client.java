package cn.unipus.builder;

import cn.unipus.builder.impl.ActorController;
import cn.unipus.builder.impl.HeroBuilder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 8:24
 * Description: 客户端测试类
 */
public class Client {
  public static void main(String[] args) {
    ActorBuilder actorBuilder = new HeroBuilder();
    ActorController controller = new ActorController();
    Actor actor;
    actor = controller.construct(actorBuilder);

    System.out.println(actor.getType() + "的外观: ");
    System.out.println("性别: " + actor.getSex());
    System.out.println("面容: " + actor.getFace());
    System.out.println("服装: " + actor.getCostume());
    System.out.println("发型: " + actor.getHairstyle());
  }
}
