package com.testing.override;

/**
 * @Classname son
 * @Description 类型说明
 * @Date 2021/4/6 17:43
 * @Created by 测试园
 */
public class son extends father {
    public void name(){
        System.out.println("我是子类");
        super.name();
    }

    public static void main(String[] args) {
        son son=new son();
        son.name();
    }
}
