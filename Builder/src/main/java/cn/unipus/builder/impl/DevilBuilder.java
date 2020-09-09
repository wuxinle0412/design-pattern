package cn.unipus.builder.impl;

import cn.unipus.builder.ActorBuilder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 8:19
 * Description: 恶魔角色建造者，充当具体建造者。
 */
public class DevilBuilder extends ActorBuilder {
  public void buildType() {
    actor.setType("恶魔");
  }

  public void buildSex() {
    actor.setSex("妖");
  }

  public void buildFace() {
    actor.setFace("丑陋");
  }

  public void buildCostume() {
    actor.setCostume("黑衣");
  }

  public void buildHairstyle() {
    actor.setFace("光头");
  }
}
