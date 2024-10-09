package com.recruit.matcher.api

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(
    basePackages = ["com.recruit.matcher.api.persistance"],
    annotationClass = org.apache.ibatis.annotations.Mapper::class
)
class MainApplication

fun main(args: Array<String>) {
    runApplication<com.recruit.matcher.api.MainApplication>(*args)
}
