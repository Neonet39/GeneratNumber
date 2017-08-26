package com.Service.GenerateNumberService;

import com.Dao.NumberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evgeny on 26.08.2017.
 */
@Service
public class GenerateNumberServiceImpl implements GenerateNumberService {

    @Autowired
    NumberDao numberDao;

    @Override
    public String getNumber(String OneNumber,String ToNumber) {
        String number = numberDao.getNumber();
        try {
            if (number == null && OneNumber != null && ToNumber != null) {
                number = String.valueOf(generate(
                        Integer.valueOf(OneNumber),
                        Integer.valueOf(ToNumber)));

            } else if (number == null && (OneNumber != null || ToNumber != null)) {
                number = generateNumber();
            }
        }catch (Exception e){
            number = generateNumber();
        }
        return number;
    }

    @Override
    public String generateNumber() {
        String number = String.valueOf(generate(1,100));

        return number;
    }


    private int generate(int min,int max){
      int result =  min + (int)(Math.random() * ((max - min) + 1));
      return result;
    }
}
