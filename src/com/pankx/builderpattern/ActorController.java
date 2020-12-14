package com.pankx.builderpattern;

/**
 * @author pankx
 * @date 2020/12/14 12:44 上午
 */

/**
 * 建造者模式中的指挥类
 */
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder) {
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        if(!actorBuilder.isBareheaded()){
            actorBuilder.buildHairstyle();
        }

        Actor actor = actorBuilder.createActor();

        return actor;
    }
}
