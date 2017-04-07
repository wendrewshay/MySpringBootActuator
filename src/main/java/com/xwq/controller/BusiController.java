package com.xwq.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/busi
 * @author WQXia
 * @date 2017-04-07 15:42:15
 * @version 1.0
 */
@RestController
public class BusiController {

	@RequestMapping(value="/busi",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String test() {
		return "OK";
	}
}
