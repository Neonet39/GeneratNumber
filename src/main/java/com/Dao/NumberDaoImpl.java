package com.Dao;

import org.springframework.stereotype.Repository;

import java.io.*;

/**
 * Created by Evgeny on 26.08.2017.
 */
@Repository
public class NumberDaoImpl implements NumberDao {
    @Override
    public String getNumber() {

        return Strong_Number.getNumber();
    }

    @Override
    public void setNumber(String number) {
        Strong_Number.setNumber(number);
    }
    @Override
    public void method_null(){

        Strong_Number.method_null();
    }
}
