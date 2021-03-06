package com.luojia.singleton;

/**
 * @Author Romantic-Lei
 * @Date 2020/5/27
 * @description 饿汉式（静态代码块）
 */
public class singletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance1.hashCode());
    }
}

class Singleton02 {
    // 1. 构造器私有化
    private Singleton02() {

    }

    // 2. 本类内部创建对象实例
    private static Singleton02 instance;

    // 在静态代码块状中创建单例对象
    static {
        instance = new Singleton02();
    }

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton02 getInstance() {
        return instance;
    }
}
