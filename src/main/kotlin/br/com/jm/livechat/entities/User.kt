package br.com.jm.livechat.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
    @Id
    @GeneratedValue
    val id: Int = 0,
    @Column(nullable = false, unique = false)
    val name: String,
    @Column(nullable = false, unique = true)
    val phone: String,
    @Column(nullable = false, unique = true)
    val password: String
)