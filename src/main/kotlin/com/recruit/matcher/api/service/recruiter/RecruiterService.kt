package com.recruit.matcher.api.service.recruiter

import com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson

interface RecruiterService {
    fun findAll(): List<com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson>
    fun create(recruiter: com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson): com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson
}