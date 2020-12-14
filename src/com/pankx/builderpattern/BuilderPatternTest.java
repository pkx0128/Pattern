package com.pankx.builderpattern;

/**
 * @author pankx
 * @date 2020/12/14 12:49 上午
 */

/**
 * 测试建造者模式
 */
public class BuilderPatternTest {
    public static void main(String[] args){
        ActorBuilder actorBuilder = BuilderForXml.getBean(); //new HeroBuilder();

        ActorController actorController = new ActorController();

        Actor actor = actorController.construct(actorBuilder);

        System.out.println(actor.getType() + "外观:");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        String tmp = actor.getHairstyle();
        System.out.println("发型：" + (tmp == null ? "角色为光头" : tmp));




    }
}
