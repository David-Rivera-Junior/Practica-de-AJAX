package com.ajax.controller;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("prueba")
public class ejemplo3Controller {
	
	@GetMapping(value="index3")
	public String index2() {
		return new String("Operaciones");
	}

	
	 @GetMapping(value="operaciones",produces = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody
	    public HashMap<String, Double> operaciones(@RequestParam Double num1, @RequestParam Double num2) {
	    	
	    	HashMap<String, Double> hm=new HashMap<String, Double>();
	    	hm.put("Suma", num1+num2);
	    	hm.put("Resta", num1-num2);
	    	hm.put("Multiplicacion", num1*num2);
	    	hm.put("Division", num1/num2);
	    	return hm;
	    }
}
