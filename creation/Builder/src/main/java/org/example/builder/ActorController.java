package org.example.builder;

import org.example.builder.Actor;
import org.example.builder.ActorBuilder;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2020/2/11 8:21
 * Description: 角色控制器，充当指挥者。
 */
public class ActorController {
  //逐步构建复杂产品对象
  public Actor construct(ActorBuilder ab) {
    Actor actor;
    ab.buildType();
    ab.buildSex();
    ab.buildFace();
    ab.buildCostume();
    ab.buildHairstyle();
    actor = ab.createActor();
    return actor;
  }

}
