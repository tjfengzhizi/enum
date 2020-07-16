package com.jun.service;

import com.jun.enumeration.RoomStatusEnum;

/**
 * @author：cj
 * @date：2020-7-8 20:51
 * @desc：枚举类的使用
 * 错误码也可以用
 * int常量用枚举类
 * 枚举本质上就是一个类，里面定义的枚举类型就是这个枚举类的实例
 * 待办：枚举的高级玩法
 */
public class Test {
    public static void main(String[] args) {
        String code = RoomStatusEnum.ACTIVE.getCode();
        String message = RoomStatusEnum.ACTIVE.getMessage();
        System.out.println(code);
        System.out.println(message);
    }
}
