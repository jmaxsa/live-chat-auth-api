package br.com.jm.livechat.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
    @Id
    @GeneratedValue
    val id: Int,
    val name: String,
    val phone: String,
    val password: String
)