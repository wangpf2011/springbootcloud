package com.wf.ssm.modules.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.ssm.modules.dao.StudentDao;
import com.wf.ssm.modules.entity.Student;

/**
 * The class StudentService.
 *
 * Description:service层
 */
@Service
public class StudentService {

	/**
	 * 针对接口编程，直接自动注入
	 */
	@Autowired
	private StudentDao dao;

	public Student getStudent(int id) {
		return dao.get(id);
	}
}
