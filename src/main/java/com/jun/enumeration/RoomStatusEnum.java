package com.jun.enumeration;

/**
 * @author：cj
 * @date：2020-7-8 20:47
 * @desc：
 */
public enum  RoomStatusEnum {
    ACTIVE("ACTIVE","可订"),//注意是逗号
    DISABLED("DISABLED","不可订");

    private String code;
    private String message;

    RoomStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
