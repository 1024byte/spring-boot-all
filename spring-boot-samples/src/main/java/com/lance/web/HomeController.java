package com.lance.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/home/")
public class HomeController {
	
	/**
	 * ����ͼƬ����
	 * @return
	 */
	@RequestMapping("holder")
	public String holder(){
		return "user/customer/img-hoder.jsp";
	}
	
	/**
	 * ����ģ�巽��
	 * @return
	 */
	@RequestMapping("tmpl")
	public String tmpl(){
		return "user/customer/template.jsp";
	}
}
