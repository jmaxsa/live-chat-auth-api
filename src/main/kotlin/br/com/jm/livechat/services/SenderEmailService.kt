package br.com.jm.livechat.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service


@Service
class SenderEmailService {

    @Autowired
    private lateinit var mailSender: JavaMailSender

    fun sendEmail(username: String, emailToSend: String): String? {
        val message = SimpleMailMessage()
        message.apply {
            setText("Hello from Spring Boot Application")
            setTo("wolmirgarbin@gmail.com")
            setFrom("wolmirgarbin@gmail.com")
        }

        return try {
            mailSender.send(message)
            "E-mail enviado com sucesso!"
        } catch (e: Exception) {
            null
        }
    }
}