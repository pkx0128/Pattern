package com.pankx.adapterpattern;

/**
 * @author pankx
 * @date 2020/12/20 10:42 上午
 */

/**
 * 默认适配器模式中的具体业务类
 */
public class DefaultAdapterImpl extends DefaultAdapter {
    @Override
    public void m3(){
        System.out.println("通过默认适配器可以有选择得实现接口ServiceInterface中的方法无需全部实现");
    }
}
