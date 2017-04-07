package com.xwq.service;

import org.springframework.stereotype.Service;

/**
 * 状态服务
 * @author WQXia
 * @date 2017-04-07 15:59:35
 * @version 1.0
 */
@Service
public class StatusService {

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
