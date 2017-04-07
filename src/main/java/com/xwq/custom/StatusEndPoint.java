package com.xwq.custom;

import org.springframework.beans.BeansException;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.xwq.service.StatusService;

/**
 * 自定义端点
 * 通过http://localhost:8080/status查看status
 * @author WQXia
 * @date 2017-04-07 16:13:00
 * @version 1.0
 */
@ConfigurationProperties(prefix="endpoints.status",ignoreUnknownFields=false)
public class StatusEndPoint extends AbstractEndpoint<String> implements ApplicationContextAware{

	ApplicationContext ac;
	
	public StatusEndPoint() {
		super("status");
	}

	@Override
	public String invoke() {
		StatusService statusService = ac.getBean(StatusService.class);
		return "The current status is:" + statusService.getStatus();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ac = applicationContext;
	}

}
