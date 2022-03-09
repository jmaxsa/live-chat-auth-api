package br.com.jm.livechat.controller

import br.com.jm.livechat.entities.User
import br.com.jm.livechat.models.UserRegisterBody
import br.com.jm.livechat.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.Optional

@RestController
@RequestMapping("/user")
class AuthController {

    @Autowired
    private lateinit var userRepository: UserRepository

    @PostMapping("/register")
    fun registerUser(@RequestBody userRegisterBody: UserRegisterBody): ResponseEntity<User> {
        return Optional.ofNullable(userRepository.save(userRegisterBody.toUser()))
            .map { user -> ResponseEntity.ok(user) }
            .orElseGet { ResponseEntity.notFound().build() }
    }

    @GetMapping("/{phone}")
    fun getUser(@PathVariable phone: String): ResponseEntity<User> {
        return Optional.ofNullable(userRepository.findByPhone(phone))
            .map { user -> ResponseEntity.ok(user) }
            .orElseGet { ResponseEntity.notFound().build() }
    }
}