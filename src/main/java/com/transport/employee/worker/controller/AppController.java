package com.transport.employee.worker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transport.employee.worker.dto.AppResponseMessageDto;
import com.transport.employee.worker.utility.AppMessageConstants;

@RestController
@RequestMapping("/api/v1/worker")
public class AppController {

	@GetMapping("/info")
	@ResponseStatus(HttpStatus.OK)
	public AppResponseMessageDto<String> appInfo(){
		return new AppResponseMessageDto<String>(HttpStatus.OK.value(), "Worker Service is up and running", AppMessageConstants.APPLICATION_DESC);
	}
	
	
}
