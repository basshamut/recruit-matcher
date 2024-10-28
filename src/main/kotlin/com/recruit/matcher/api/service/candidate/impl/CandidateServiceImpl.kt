package com.recruit.matcher.api.service.candidate.impl

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson
import com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson
import com.recruit.matcher.api.persistance.candidate.repository.CandidateMapperRepository
import com.recruit.matcher.api.service.candidate.CandidateService
import com.recruit.matcher.api.service.candidate.mapper.CandidateMapper
import org.springframework.stereotype.Service

@Service
class CandidateServiceImpl(private var candidateMapperRepository: CandidateMapperRepository) :
    CandidateService {

    override fun create(candidate: CandidateRequestJson): CandidateResponseJson {
        val candidateToSave = CandidateMapper.INSTANCE.recruiterRequestJsonToRecruiter(candidate);
        val newCandidate = candidateMapperRepository.save(candidateToSave)

        return CandidateMapper.INSTANCE.recruiterToRecruiterResponseJson(newCandidate)
    }
}