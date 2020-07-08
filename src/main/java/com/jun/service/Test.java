package com.jun.service;

import com.jun.enumeration.RoomStatusEnum;

/**
 * @author：cj
 * @date：2020-7-8 20:51
 * @desc：枚举类的使用
 */
public class Test {
    public static void main(String[] args) {
        String code = RoomStatusEnum.ACTIVE.getCode();
        String message = RoomStatusEnum.ACTIVE.getMessage();
        System.out.println(code);
        System.out.println(message);
    }
}
