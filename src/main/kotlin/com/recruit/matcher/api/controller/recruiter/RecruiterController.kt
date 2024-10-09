package com.recruit.matcher.api.controller.recruiter

import com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson
import com.recruit.matcher.api.service.recruiter.RecruiterService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(value = ["/api/v1"])
class RecruiterController {

    @Autowired
    private lateinit var recruiterService: com.recruit.matcher.api.service.recruiter.RecruiterService

    @GetMapping("/recruiters")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun retrieveAll(): ResponseEntity<List<com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson>> {
        val dtoList: List<com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson> = recruiterService.findAll()
        return ResponseEntity.ok().body(dtoList)
    }

    @PostMapping("/recruiters")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody recruiter: com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson): ResponseEntity<com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson> {
        val dto: com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson = recruiterService.create(recruiter)
        return ResponseEntity.ok().body(dto)
    }
}