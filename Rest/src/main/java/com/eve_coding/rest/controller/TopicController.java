package com.eve_coding.rest.controller;


import com.eve_coding.rest.model.Topic;
import com.eve_coding.rest.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id){ return topicService.getTopic(id); }
}
