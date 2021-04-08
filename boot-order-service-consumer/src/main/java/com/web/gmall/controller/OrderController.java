package com.web.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.gmall.bean.UserAddress;
import com.web.gmall.service.OrderService;


@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	@ResponseBody
	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
		System.out.println("消费者实现：controller：initOrder:响应");
		List<UserAddress> list = orderService.initOrder(userId);
		System.out.println("消费者实现：controller：initOrder:调用完毕");
		return list;
	}

}
