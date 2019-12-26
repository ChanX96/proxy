package com.chanx.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 模拟一个消费者
 */
public class Client {

    public static void main(String[] args) {

        final Producer producer = new Producer();

        /**
         * 动态代理
         *  特点：字节码随用随创建，随用随加载
         *  作用：不修改源码的基础上对方法增强
         *  分类：基于接口的动态代理和基于子类的动态代理
         *      基于接口的动态代理：Proxy
         *          提供者：JDK官方
         *          如何创建代理对象：
         *              使用Proxy类中的newProxyInstance方法
         *          创建代理对象的要求：
         *              被代理类嘴上实现一个接口，如果没有不能使用
         *          newProxyInstance方法的参数
         *              Classloader：类加载器，用于加载代理对象字节码。写的是被代理对象的类加载器，和被代理对象使用相同的类加载器。固定写法。
         *              class[]：字节码数组。代理对象和被代理对象有相同的方法。
         *              InvocationHandler：用于提供增强的代码。让我们写如何代理，我们一般都是一些该接口的实现，通常情况下都是匿名内部类。
         *      基于子类的动态代理：
         *          涉及的类：Enhancer
         *          提供者：第三方cglib库
         *          如何创建代理对象
         *              使用Enhancer类中的create方法
         *          创建代理对象的要求：
         *              被代理类不能是最终类
         *          create方法参数：
         *              Class
         */
        Enhancer.create();
    }
}
