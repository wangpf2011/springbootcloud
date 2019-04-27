package com.wf.ssm.modules.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wf.ssm.modules.entity.Student;
import com.wf.ssm.modules.service.StudentService;

/**
 * The class UserInfoController.
 *
 * Description:controller接口层
 */
@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/get.json")
	public Student getUserInfo(@RequestParam int id) {
		return service.getStudent(id);
	}
	
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/rest")
    @ResponseBody
    public Map<String, Object> rest() {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("1", "A");
        data.put("2", 2);
        return data;
    }
}