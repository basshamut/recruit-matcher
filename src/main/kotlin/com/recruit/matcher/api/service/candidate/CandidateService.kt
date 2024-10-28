package com.recruit.matcher.api.service.candidate

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson
import com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson

interface CandidateService {
    fun create(candidate: CandidateRequestJson) : CandidateResponseJson
}