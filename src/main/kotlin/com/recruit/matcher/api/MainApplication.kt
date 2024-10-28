package com.recruit.matcher.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
@EnableMongoRepositories(basePackages = [
    "com.recruit.matcher.api.persistance.recruiter.repository",
    "com.recruit.matcher.api.persistance.candidate.repository",
    "com.recruit.matcher.api.persistance.project.repository"
])
class MainApplication

fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
}
