package com.wf.ssm.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wf.ssm.modules.entity.Student;
import com.wf.ssm.modules.service.StudentService;

/**
 * The class UserInfoController.
 *
 * Description:controller接口层
 */
@RestController
public class UserInfoController {

	@Autowired
	private StudentService service;

	@RequestMapping(value = "/get.json")
	public Student getUserInfo(@RequestParam int id) {
		return service.getStudent(id);
	}
}
