package com.picpaysimplificado.Services;


import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.dtos.NotificationDTO;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public void sendNotification(User user,String message) throws Exception{
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email,message);
    }
}
