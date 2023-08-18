package com.example.springcf7.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class Mycontroller {
	 @GetMapping(path = "")
	   public ResponseEntity<String> getDroneMedications() {
	      return new ResponseEntity<String>("Hello World jenkin cf sucess!", HttpStatus.OK);
	   }

}
