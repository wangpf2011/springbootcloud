package com.wf.ssm.shiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wf.ssm.shiro.bean.Event;
import com.wf.ssm.shiro.service.EventService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping(value = "/events")
@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	
	@RequestMapping(method = RequestMethod.GET)
    public List<Event> list(HttpServletRequest request) {
		return eventService.getByMap(null);
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Event detail(@PathVariable Integer id) {
		return eventService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Event create(@RequestBody Event event) {
		return eventService.create(event);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Event update(@RequestBody Event event) {
		return eventService.update(event);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public int delete(@PathVariable Integer id) {
		return eventService.delete(id);
    }
    
}