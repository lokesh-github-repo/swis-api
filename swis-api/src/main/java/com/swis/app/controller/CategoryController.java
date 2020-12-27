package com.swis.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swis.app.data.bean.Category;
import com.swis.app.data.bean.repository.CategoryRepository;
import com.swis.app.utils.Constants;
import com.swis.app.utils.Utils;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	private final static Logger log = LoggerFactory.getLogger(CategoryController.class);

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ResponseEntity<?> addCategory(@RequestBody Category request) {
		try {
			categoryRepository.save(request);

		} catch (Exception ex) {
			log.error("category insertion fails, ex :" + ex);

			return new ResponseEntity<>(new Utils.StringResponse(Constants.INSERTION_FAILS),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(new Utils.StringResponse(Constants.SUCCESS), HttpStatus.OK);
	}

	
	
	@RequestMapping(value = "/getDetails", method = RequestMethod.GET)
	public ResponseEntity<?> getCategory(   @RequestParam(value = "id", required = false) String id) {
		Category response=null;
		
		try {
			Long cateGoryIdLong=Long.getLong(id);
			
			response=categoryRepository.findByCategoryId(cateGoryIdLong);

		} catch (Exception ex) {
			log.error("get category  fails, ex :" + ex);

			return new ResponseEntity<>(new Utils.StringResponse(Constants.DB_CALL_FAILS),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ResponseEntity<?> updateCategory(@RequestBody Category request) {
		try {
			categoryRepository.save(request);

		} catch (Exception ex) {
			log.error("category update fails, ex :" + ex);

			return new ResponseEntity<>(new Utils.StringResponse(Constants.UPDATE_FAILS),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(new Utils.StringResponse(Constants.SUCCESS), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAllCategory( ) {
		List<Category> response=null;
		
		try {
			response=categoryRepository.findAll();

		} catch (Exception ex) {
			log.error("get categorys  fails, ex :" + ex);

			return new ResponseEntity<>(new Utils.StringResponse(Constants.DB_CALL_FAILS),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}




