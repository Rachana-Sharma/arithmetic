package com.assesment.assesment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.assesment.assesment.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControllerAssesment {

	 CalculateModel calculatemodel = new CalculateModel();
	 
	 @Autowired
	    private ServiceAssesment serviceAssesment;
	 
	
	 @PostMapping(value="/add")
         public int calculateSum(@RequestBody CalculateModel calculatemodel) {			
	 return  serviceAssesment.add(calculatemodel);
	}
}
