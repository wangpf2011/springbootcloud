package com.wf.ssm.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.ssm.shiro.entity.Permission;
import com.wf.ssm.shiro.dao.PermissionDao;

import java.util.List;
import java.util.Map;

@Service
public class PermissionService {
    @Autowired
	private PermissionDao permissionDao;
	
	public List<Permission> getByMap(Map<String,Object> map) {
	    return permissionDao.getByMap(map);
	}
	
	public Permission getById(Integer id) {
		return permissionDao.getById(id);
	}
	
	public Permission create(Permission permission) {
		permissionDao.create(permission);
		return permission;
	}
	
	public Permission update(Permission permission) {
		permissionDao.update(permission);
		return permission;
	}
	
	public int delete(Integer id) {
		return permissionDao.delete(id);
	}
    
}