package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Automovil;

@RestController
@RequestMapping("test")
public class TestController {
	
	 @RequestMapping(value = "getTest", method = RequestMethod.GET)
	    public Automovil getValue() throws Exception {
	        try {
	        	
	        	Automovil auto = new Automovil();
	        	auto.setColor("red");
	        	auto.setMarca("Audi");
	        	auto.setModelo("a3");
	        	
	            return auto;
	        } catch (Error ex) {
	            throw new Error(ex.getMessage());
	        }  
	    }

}
