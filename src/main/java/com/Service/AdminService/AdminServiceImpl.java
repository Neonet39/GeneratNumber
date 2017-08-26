package com.Service.AdminService;

import com.Dao.NumberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evgeny on 26.08.2017.
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    NumberDao numberDao;

    @Override
    public String getNumber() {
        return numberDao.getNumber();
    }

    @Override
    public void setNumber(String number) {
        numberDao.setNumber(number);
    }

    @Override
    public void method_null() {
        numberDao.method_null();
    }
}
