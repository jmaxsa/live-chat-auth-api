package br.com.jm.livechat.services

import br.com.jm.livechat.entities.User
import br.com.jm.livechat.models.UserRegisterBody
import br.com.jm.livechat.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    fun registerUser(userRegisterBody: UserRegisterBody): Optional<User> {
        return if(userRepository.findByEmail(userRegisterBody.email) == null) {
            Optional.of(userRepository.save(userRegisterBody.toUser()))
        } else {
            Optional.empty()
        }
    }

    fun getUserByPhone(phone: String): User {
        return userRepository.findByPhone(phone)
    }
}