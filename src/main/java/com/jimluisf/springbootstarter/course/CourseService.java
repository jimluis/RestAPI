package com.jimluisf.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
//	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("spring", "Spring framwork", "Spring Framework Description"),
//			new Topic("Java", "core java", "core java Description"),
//			new Topic("javascript", "javascript", "javascript Description")));
	
	public List<Course> getAllCourses(String id)
	{
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourse(String id)
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
		
		Optional<Course> topicOpt = courseRepository.findById(id);
		Course topic = topicOpt.get();
		return topic;
	}
	
	public void addACourse(Course course)
	{
//		System.out.println("topics: "+topics.size()+ " - topic.getName(): "+topic.getName());
//		topics.add(topic);
		
		courseRepository.save(course);
	}

	public void updateCourse(Course course2Up) 
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
		
		courseRepository.save(course2Up);
		return;
		
	}
	
	public void deleteCourse(String id)
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
		
		courseRepository.deleteById(id);
//		return;
	}
}
