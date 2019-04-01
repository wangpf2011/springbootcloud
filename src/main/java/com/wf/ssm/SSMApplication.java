package com.wf.ssm;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SSMApplication {

	public static void main(String[] args) {
		SpringApplication.run(SSMApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
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
