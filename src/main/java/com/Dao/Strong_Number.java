package com.Dao;

/**
 * Created by Evgeny on 26.08.2017.
 */
public class Strong_Number {
    private static String number;

    public static String getNumber() {
        return number;
    }

    public static void setNumber(String number) {
        Strong_Number.number = number;
    }

    public static void method_null(){

        Strong_Number.number = null;
    }

}
