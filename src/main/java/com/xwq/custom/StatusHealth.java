package com.xwq.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import com.xwq.service.StatusService;

/**
 * 定制HealthIndicator，只有status为running时服务为健康
 * 通过访问http://localhost:8080/health查看
 * @author WQXia
 * @date 2017-04-07 16:42:17
 * @version 1.0
 */
@Component
public class StatusHealth implements HealthIndicator{

	@Autowired
	private StatusService statusService;
	
	@Override
	public Health health() {
		String status = statusService.getStatus();
		//status为非running时构造失败
		if(status == null || !status.equals("running")) {
			return Health.down().withDetail("Error", "Not Running").build();
		}
		return Health.up().build();
	}

}
