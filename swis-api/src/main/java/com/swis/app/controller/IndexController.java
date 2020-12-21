package com.swis.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	private final static Logger log =LoggerFactory.getLogger(IndexController.class);


    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public ResponseEntity<?> healthcheck() {
    	log.info("*****hello healthcheck");
    	
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
