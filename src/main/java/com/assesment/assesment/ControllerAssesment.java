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
	 
	/* @RequestMapping("/calculator")
	    public String getCalculatorPage(Model model){
	        model.addAttribute("calculatemodel",model);
	        return "calculator";
	    }
	 
	 @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
	    public String add(@ModelAttribute("calculatemodel")  CalculateModel calculatemodel, Model model ){
	        model.addAttribute("result", serviceAssesment.add(calculatemodel));
	        return "calculator";
	    }*/
	 @RequestMapping(value="/add", method=RequestMethod.POST)
		public int calculateSum(@RequestBody CalculateModel calculatemodel) {
			
	return  serviceAssesment.add(calculatemodel);
}
}
