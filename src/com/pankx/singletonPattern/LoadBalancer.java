package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/18 11:06 上午
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 模拟简单负载均衡器
 */
public class LoadBalancer {
    private static LoadBalancer loadBalancer;
    private List serverList = null;//服务器集合

    private LoadBalancer(){
        serverList = new ArrayList();
    }

    /**
     * 单例中获取实例对象静态方法
     * @return LoadBalancer的实例对象
     */
    public static LoadBalancer getLoadBalancer() {
        if(loadBalancer == null) {
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    /**
     * 添加服务器
     * @param serverName 要添加的服务器名称
     */
    public void add(String serverName){
        serverList.add(serverName);
    }

    /**
     * 删除服务器
     * @param obj 服务器名称
     */
    public void remote(String obj){
        serverList.remove(obj);
    }

    /**
     * 获取服务器
     * @return 返回集合中的服务器名
     */
    public String getServer(){
        Random random =  new Random();
        String server = null;
        int i = random.nextInt(serverList.size());
        server = (String)serverList.get(i);
        return server;
    }

}
