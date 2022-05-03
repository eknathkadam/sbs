package com.alphonso.sbs.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring framework","Spring Framework Description"),
			new Topic("java","java framework","java Framework Description"),
			new Topic("javascript","javascript framework","javascript Framework Description")
			));
	
	public List<Topic>getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
