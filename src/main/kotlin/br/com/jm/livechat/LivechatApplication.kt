package br.com.jm.livechat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LivechatApplication

fun main(args: Array<String>) {
	runApplication<LivechatApplication>(*args)
}
