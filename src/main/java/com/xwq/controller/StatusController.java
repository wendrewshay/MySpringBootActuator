package com.xwq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xwq.service.StatusService;

@RestController
public class StatusController {

	@Autowired
	StatusService statusService;
	
	/**
	 * 定义控制器方法来改变status
	 * @param status
	 * @return
	 */
	@RequestMapping("/change")
	public String changeStatus(String status) {
		statusService.setStatus(status);
		return "OK";
	}
}
