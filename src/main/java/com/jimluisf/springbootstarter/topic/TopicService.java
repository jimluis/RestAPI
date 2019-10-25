package com.jimluisf.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	@Autowired
	private TopicRepository topicRepository;
	
//	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("spring", "Spring framwork", "Spring Framework Description"),
//			new Topic("Java", "core java", "core java Description"),
//			new Topic("javascript", "javascript", "javascript Description")));
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public Topic getTopic(String id)
	{
//		Topic topic = new Topic();
//		
//		for (int i = 0; i < topics.size(); i++) 
//		{
//			if(topics.get(i).getId().equals(id))
//			{
//				topic = topics.get(i);
//				break;
//			}
//		}
		
		Optional<Topic> topicOpt = topicRepository.findById(id);
		Topic topic = topicOpt.get();
		return topic;
	}
	
	public void addATopic(Topic topic)
	{
//		System.out.println("topics: "+topics.size()+ " - topic.getName(): "+topic.getName());
//		topics.add(topic);
		
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic2Up) 
	{
//		Topic topic = new Topic();
		
//		for (int i = 0; i < topics.size(); i++) 
//		{
//			if(topics.get(i).getId().equals(id))
//			{
//				topics.set(i, topic2Up);// = topics.get(i);
//				
//			}
//		}
		
		topicRepository.save(topic2Up);
		return;
		
	}
	
	public void deleteTopic(String id)
	{
//		Topic topic = new Topic();
		
//		for (int i = 0; i < topics.size(); i++) 
//		{
//			if(topics.get(i).getId().equals(id))
//			{
//				topics.remove(i);
//				break;
//			}
//		}
		
		topicRepository.deleteById(id);
//		return;
	}
}
