package org.example.email_sender;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {

    @Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(EmailSenderApplication.class, args);


    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendEmail() {
        emailService.sendEmail("thefirsttryinvestor@gmail.com",
                                "This is Subject",
                                    "This is the Body");
    }

}
