package com.aptech.ProjectSem4.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aptech.ProjectSem4.entities.Notifications;

public interface NotificationRepository extends JpaRepository<Notifications, Integer> {
    // Các phương thức tùy chỉnh khác có thể được thêm vào đây nếu cần
}