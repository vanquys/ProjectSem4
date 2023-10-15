package com.aptech.ProjectSem4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.ProjectSem4.entities.Notifications;
import com.aptech.ProjectSem4.reponsitory.NotificationRepository;


@Controller

@RequestMapping("/admin/noti")
public class AdNotifications {

	@Autowired
	private NotificationRepository notificationRepository;

	@GetMapping("/ViewAdNotifi")
	public String ViewAdNotifi(Model model) {
		model.addAttribute("ListNoti", notificationRepository.findAll());
		return "adNotification";
	}

	@GetMapping("/editModel")
	@ResponseBody
	public ResponseEntity<Notifications> getNotiById(@RequestParam int id) {
		Notifications noti = notificationRepository.findById(id).orElse(null);
		if (noti != null) {
			return ResponseEntity.ok(noti);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/edit")
	@ResponseBody
	public String processEditForm(Notifications updatednoti) {
		notificationRepository.save(updatednoti);
		return "Success";
	}

	@GetMapping("/add")
	@ResponseBody
	public String saveAddForm(Notifications newNoti) {
		notificationRepository.save(newNoti);
		return "Success";
	}

	@PostMapping("/delete/{id}")
	@ResponseBody
	public String deleteNotication(int id) {
		notificationRepository.deleteById(id);
		return "Success";
	}

}
