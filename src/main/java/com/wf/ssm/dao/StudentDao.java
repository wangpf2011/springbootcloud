package com.wf.ssm.dao;

import org.apache.ibatis.annotations.Param;
import com.wf.ssm.annotation.MyBatisDao;
import com.wf.ssm.entity.Student;

/**
 * The class StudentMapper.
 *
 * Description:学生mapper，dao层
 */
//@MyBatisDao
public interface StudentDao {

	public Student get(@Param("id") int id);
}