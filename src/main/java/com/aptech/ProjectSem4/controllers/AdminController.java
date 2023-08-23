package com.aptech.ProjectSem4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aptech.ProjectSem4.entities.Notifications;
import com.aptech.ProjectSem4.reponsitory.NotificationRepository;


@Controller
@RequestMapping("/admin")
public class AdminController {

    private NotificationRepository notificationRepository ;
	
    public AdminController(NotificationRepository notificationRepository) {
    	this.notificationRepository = notificationRepository;
    }
	  @GetMapping("/noti") 
	  public String showNotifications(Model model) {
	  Iterable<Notifications> notifications = notificationRepository.findAll();
	  model.addAttribute("noti", notifications);
	  return "notification"; }
	 
	  @GetMapping("/create")
	    public String showCourse() {
	        return "adminCourses"; 
	    }

    @GetMapping("/create")
    public String showCreateForm() {
        return "create"; 
    }

  
   
}
