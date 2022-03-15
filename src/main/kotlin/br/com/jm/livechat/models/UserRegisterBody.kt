package br.com.jm.livechat.models

import br.com.jm.livechat.entities.User
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

data class UserRegisterBody(
    @JsonProperty(required = true)
    val name: String,
    @JsonProperty(required = true)
    val phone: String,
    @JsonProperty(required = true)
    val password: String,
    @JsonProperty(required = true)
    val email: String
) : Serializable {
    fun toUser(): User { return User(name = name, phone = phone, password = password, email = email) }
}