package com.example.headfirst.command.directive;

/**
 * <p>project: headFirst
 * <p>ClassName: CeilingFan
 * <p>Description:Receiver角色：风扇。需要为风扇的每个转速都创建一个类，这样实在太麻烦了，能不能用动态代理来做呢？
 * <p>Date: 11/23/2021 22:48
 *
 * @author : Zhao Li
 */
public class CeilingFan {
    /**
     * 风扇转速枚举类
     */
    public enum FanSpeedEnum {
        HIGH(3) //高速
        ,
        LOW(1) //低速
        ,
        MEDIUM(2) //中速
        ,
        OFF(0) //关闭
        ;

        int speed;

        FanSpeedEnum(int speed) {
            this.speed = speed;
        }

        public static FanSpeedEnum getByValue(Integer value) {
            for (FanSpeedEnum fanSpeedEnum : values()) {
                if (fanSpeedEnum.speed == value) {
                    return fanSpeedEnum;
                }
            }
            return null;
        }
    }

    String location;

    private int speed;

    public CeilingFan(String location, int speed) {
        this.location = location;
        this.speed = speed;
    }

    public void high() {
        System.out.println("fan speed set to high");
        speed = FanSpeedEnum.HIGH.speed;
    }

    public void medium() {
        System.out.println("fan speed set to medium");
        speed = FanSpeedEnum.MEDIUM.speed;
    }

    public void low() {
        System.out.println("fan speed set to low");
        speed = FanSpeedEnum.LOW.speed;
    }

    public void off() {
        System.out.println("fan speed set to off");
        speed = FanSpeedEnum.OFF.speed;
    }

    public int getSpeed() {
        return speed;
    }

}
