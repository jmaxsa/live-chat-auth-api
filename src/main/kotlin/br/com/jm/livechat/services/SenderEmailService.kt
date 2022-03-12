package br.com.jm.livechat.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service


@Service
class SenderEmailService {

    @Autowired
    private lateinit var mailSender: JavaMailSender

    fun sendEmail(username: String, emailToSend: String){
        val message = SimpleMailMessage()
        message.apply {
            setText("Hello from Spring Boot Application")
            setTo(emailToSend)
            setFrom("noreplaylivechat@gmail.com")
        }

        try {
            mailSender.send(message)
        } catch (e: Exception) {
            e.message
        }
    }
}