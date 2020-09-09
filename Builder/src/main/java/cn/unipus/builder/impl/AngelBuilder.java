package cn.unipus.builder.impl;

import cn.unipus.builder.ActorBuilder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 8:16
 * Description: 天使角色建造者，充当具体建造者。
 */
public class AngelBuilder extends ActorBuilder {
  public void buildType() {
    actor.setType("天使");
  }

  public void buildSex() {
    actor.setSex("女");
  }

  public void buildFace() {
    actor.setFace("漂亮");
  }

  public void buildCostume() {
    actor.setCostume("白裙");
  }

  public void buildHairstyle() {
    actor.setHairstyle("披肩长发");
  }
}
