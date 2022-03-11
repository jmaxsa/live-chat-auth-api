package br.com.jm.livechat.models

import br.com.jm.livechat.entities.User
import java.io.Serializable

data class UserRegisterBody(
    val name: String,
    val phone: String,
    val password: String,
    val email: String
) : Serializable {
    fun toUser(): User { return User(name = name, phone = phone, password = password, email = email) }
}