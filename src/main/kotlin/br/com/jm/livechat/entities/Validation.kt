package br.com.jm.livechat.entities

import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Column
import javax.persistence.OneToOne
import javax.persistence.Entity

@Entity
data class Validation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @Column(nullable = false, unique = true)
    val code: String,
    @OneToOne
    val user: User
)