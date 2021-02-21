package org.example.builder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 8:09
 * Description: 游戏角色建造者，充当抽象建造者
 */
public abstract class ActorBuilder {
  protected Actor actor = new Actor();

  public abstract void buildType();
  public abstract void buildSex();
  public abstract void buildFace();
  public abstract void buildCostume();
  public abstract void buildHairstyle();

  //工厂方法，返回一个完整的游戏角色对象
  public Actor createActor() {
    return actor;
  }
}
