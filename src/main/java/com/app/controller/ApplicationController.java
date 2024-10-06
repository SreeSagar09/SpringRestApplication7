package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {
	
	@GetMapping(path = "/getMethod")
	public ResponseEntity<Map<String, Object>> getMethod() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "getMethod");
			data.put("className", "ApplicationController");
			data.put("description", "This getMethod method annotated with @GetMapping");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PostMapping(path = "/postMethod")
	public ResponseEntity<Map<String, Object>> postMethod() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "postMethod");
			data.put("className", "ApplicationController");
			data.put("description", "This postMethod method annotated with @PostMapping");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@PutMapping(path = "/putMethod")
	public ResponseEntity<Map<String, Object>> putMethod() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "putMethod");
			data.put("className", "ApplicationController");
			data.put("description", "This putMethod method annotated with @PutMapping");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@PatchMapping(path = "/patchMethod")
	public ResponseEntity<Map<String, Object>> patchMethod() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "patchMethod");
			data.put("className", "ApplicationController");
			data.put("description", "This patchMethod method annotated with @PatchMapping");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@DeleteMapping(path = "/deleteMethod")
	public ResponseEntity<Map<String, Object>> deleteMethod() {
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> data = new LinkedHashMap<>();
			data.put("methodName", "deleteMethod");
			data.put("className", "ApplicationController");
			data.put("description", "This deleteMethod method annotated with @DeleteMapping");
			
			responseEntity = new ResponseEntity<Map<String,Object>>(data, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
