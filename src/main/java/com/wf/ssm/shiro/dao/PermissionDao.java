package com.wf.ssm.shiro.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wf.ssm.shiro.entity.Permission;

@Component
public interface PermissionDao {

    List<Permission> getByMap(Map<String, Object> map);

    Permission getById(Integer id);

    Integer create(Permission permission);

    int update(Permission permission);

    int delete(Integer id);

    List<Permission> getList();

    List<Permission> getByUserId(Integer userId);

}