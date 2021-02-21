package org.example.builder;

import org.example.builder.ActorBuilder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 8:13
 * Description: 英雄角色建造者，充当具体建造者。
 */
public class HeroBuilder extends ActorBuilder {
  public void buildType() {
    actor.setType("英雄");
  }

  public void buildSex() {
    actor.setSex("男");
  }

  public void buildFace() {
    actor.setFace("英俊");
  }

  public void buildCostume() {
    actor.setCostume("盔甲");
  }

  public void buildHairstyle() {
    actor.setHairstyle("飘逸");
  }
}
