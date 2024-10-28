package com.recruit.matcher.api.controller.candidate

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson
import com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson
import com.recruit.matcher.api.service.candidate.CandidateService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/api/v1"])
class CandidateController {
    @Autowired
    private lateinit var candidateService: CandidateService

    @PostMapping("/candidates")
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody candidate: CandidateRequestJson): ResponseEntity<CandidateResponseJson> {
        val dto = candidateService.create(candidate)
        return ResponseEntity.ok().body(dto)
    }
}