package com.recruit.matcher.api.service.candidate.impl

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson
import com.recruit.matcher.api.persistance.candidate.repository.CandidateMapperRepository
import com.recruit.matcher.api.service.candidate.CandidateService
import com.recruit.matcher.api.service.candidate.mapper.CandidateMapper
import org.springframework.stereotype.Service

@Service
class CandidateServiceImpl(private var candidateMapperRepository: com.recruit.matcher.api.persistance.candidate.repository.CandidateMapperRepository) :
    com.recruit.matcher.api.service.candidate.CandidateService {

    override fun create(candidate: com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson) {
        val candidateToSave = com.recruit.matcher.api.service.candidate.mapper.CandidateMapper.INSTANCE.recruiterRequestJsonToRecruiter(candidate);
        candidateMapperRepository.create(candidateToSave)

    }
}