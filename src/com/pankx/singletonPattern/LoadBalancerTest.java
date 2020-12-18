package com.pankx.singletonPattern;

/**
 * @author pankx
 * @date 2020/12/18 11:34 上午
 */
public class LoadBalancerTest {
    public static void main(String[] args) {
        LoadBalancer loadBalancer = LoadBalancer.getLoadBalancer();
        loadBalancer.add("server1");
        loadBalancer.add("server2");
        loadBalancer.add("server3");
        for(int i = 0; i < 10; i++ ) {
            System.out.println(loadBalancer.getServer());
        }
    }
}
