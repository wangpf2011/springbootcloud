package com.wf.ssm.shiro.dao;

import java.util.List;
import java.util.Map;

import com.wf.ssm.shiro.bean.Event;

public interface EventDao {

	List<Event> getByMap(Map<String, Object> map);
	Event getById(Integer id);
	Integer create(Event event);
	int update(Event event);
	int delete(Integer id);
}