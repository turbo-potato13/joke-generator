package ru.kortunov.tg.joke_generator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JokeGeneratorApplication

fun main(args: Array<String>) {
	runApplication<JokeGeneratorApplication>(*args)
}
