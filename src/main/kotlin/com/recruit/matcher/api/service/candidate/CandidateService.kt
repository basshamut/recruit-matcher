package com.recruit.matcher.api.service.candidate

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson

interface CandidateService {
    fun create(candidate: com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson)
}