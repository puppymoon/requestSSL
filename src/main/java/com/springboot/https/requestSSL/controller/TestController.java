package com.springboot.https.requestSSL.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String secured() {
		System.out.println("成功進入controller");
		return "Hello!! : " + new Date();
	}

}
