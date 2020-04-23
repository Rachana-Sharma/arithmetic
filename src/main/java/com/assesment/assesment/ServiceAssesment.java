package com.assesment.assesment;

import org.springframework.stereotype.Service;
import java.lang.Math;
import com.assesment.assesment.*;

@Service
public class ServiceAssesment {

	public int add(CalculateModel model){
        int number1 = model.getNumber1();
        int number2 =model.getNumber2();
		return number1 +number2;
    }
}
