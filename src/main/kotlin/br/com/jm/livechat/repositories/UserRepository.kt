package br.com.jm.livechat.repositories

import br.com.jm.livechat.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
    fun findByPhone(phone: String): User
    fun findByEmail(email: String): User?
}