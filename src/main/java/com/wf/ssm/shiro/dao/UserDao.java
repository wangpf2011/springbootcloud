package com.wf.ssm.shiro.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wf.ssm.shiro.entity.User;

@Component
public interface UserDao {
	
	List<User> getByMap(Map<String, Object> map);
	
	User getById(Integer id);
	
	Integer create(User user);
	
	int update(User user);
	
	int delete(Integer id);
	
	User getByUserName(String userName);
}