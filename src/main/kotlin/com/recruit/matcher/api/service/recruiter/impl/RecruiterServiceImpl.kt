package com.recruit.matcher.api.service.recruiter.impl

import com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson
import com.recruit.matcher.api.persistance.recruiter.entity.Recruiter
import com.recruit.matcher.api.persistance.recruiter.repository.RecruiterMapperRepository
import com.recruit.matcher.api.service.recruiter.RecruiterService
import com.recruit.matcher.api.service.recruiter.mapper.RecruiterMapper
import org.springframework.stereotype.Service

@Service
class RecruiterServiceImpl : com.recruit.matcher.api.service.recruiter.RecruiterService {

    private lateinit var recruiterMapperRepository: com.recruit.matcher.api.persistance.recruiter.repository.RecruiterMapperRepository

    constructor(recruiterMapperRepository: com.recruit.matcher.api.persistance.recruiter.repository.RecruiterMapperRepository) {
        this.recruiterMapperRepository = recruiterMapperRepository
    }

    override fun findAll(): List<com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson> {
        val recruiterList = recruiterMapperRepository.findAll()
        val recruiterMapped = recruiterList.map { recruiter: com.recruit.matcher.api.persistance.recruiter.entity.Recruiter -> com.recruit.matcher.api.service.recruiter.mapper.RecruiterMapper.INSTANCE.recruiterToRecruiterResponseJson(recruiter) }
        return recruiterMapped
    }

    override fun create(recruiter: com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson): com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson {
        val recruiterMapped = com.recruit.matcher.api.service.recruiter.mapper.RecruiterMapper.INSTANCE.recruiterRequestJsonToRecruiter(recruiter)
        recruiterMapperRepository.create(recruiterMapped)
        return com.recruit.matcher.api.service.recruiter.mapper.RecruiterMapper.INSTANCE.recruiterToRecruiterResponseJson(recruiterMapped)
    }
}