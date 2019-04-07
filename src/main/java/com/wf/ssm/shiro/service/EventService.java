package com.wf.ssm.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.ssm.shiro.bean.Event;
import com.wf.ssm.shiro.dao.EventDao;

import java.util.List;
import java.util.Map;

@Service
public class EventService {
    @Autowired
	private EventDao eventDao;
	
	public List<Event> getByMap(Map<String,Object> map) {
	    return eventDao.getByMap(map);
	}
	
	public Event getById(Integer id) {
		return eventDao.getById(id);
	}
	
	public Event create(Event event) {
		eventDao.create(event);
		return event;
	}
	
	public Event update(Event event) {
		eventDao.update(event);
		return event;
	}
	
	public int delete(Integer id) {
		return eventDao.delete(id);
	}
    
}