package com.wf.ssm.rocketmq.controller;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.ssm.rocketmq.producer.RocketMQProducer;

import java.io.UnsupportedEncodingException;

@RestController
public class RocketMQController {
    @Autowired
    private RocketMQProducer rocketMQProducer;

    @RequestMapping("/rocketmq/push")
    public String pushMsg(String msg){
        try {
            return rocketMQProducer.send("PushTopic","push",msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "ERROR";
    }
}
