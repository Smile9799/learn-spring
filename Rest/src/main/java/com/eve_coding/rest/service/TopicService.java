package com.eve_coding.rest.service;


import com.eve_coding.rest.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(new Topic("Java","Core java","java is good"),new Topic("C#","Asp.net core","C# is awesome"));

    public List<Topic> getTopics(){
        return  topics;
    }
    public Topic getTopic(String id){
       return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
}
