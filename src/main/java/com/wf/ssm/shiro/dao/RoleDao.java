package com.wf.ssm.shiro.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wf.ssm.shiro.entity.Role;

@Component
public interface RoleDao {
	
	List<Role> getByMap(Map<String, Object> map);
	
	Role getById(Integer id);
	
	Integer create(Role role);
	
	int update(Role role);
	
	int delete(Integer id);
}