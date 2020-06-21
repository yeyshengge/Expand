package com.zps.Enum;

/**
 * Created by zps on 2020/5/23 16:42
 */
public class NumberEnumTest {

    public static void main(String[] args) {
        String name = NumberEnum.ONE.name();
        System.out.println(name);
        NumberEnum[] values = NumberEnum.values();
        for (NumberEnum value : values) {
            System.out.println(value);
        }
        String method = NumberEnum.ONE.method();
        System.out.println(method);
        NumberEnum fourEnum = NumberEnum.valueOf("ONE");
        System.out.println(fourEnum.name());

        NumberEnum one = NumberEnum.ONE;
        switch (one) {
            case ONE:
                System.out.println("one");
                break;
            case TWO:
            case THREE:
                System.out.println("not one");
                break;
            default:
                System.out.println("not num");
                break;
        }


    }
}
