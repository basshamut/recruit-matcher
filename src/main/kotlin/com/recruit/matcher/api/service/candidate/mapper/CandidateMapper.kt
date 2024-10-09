package com.recruit.matcher.api.service.candidate.mapper

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson
import com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson
import com.recruit.matcher.api.persistance.candidate.entity.Candidate
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper(
    componentModel = "spring",
    uses = [com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson::class, com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson::class, com.recruit.matcher.api.persistance.candidate.entity.Candidate::class]
)
interface CandidateMapper {

    companion object {
        val INSTANCE: com.recruit.matcher.api.service.candidate.mapper.CandidateMapper = Mappers.getMapper(com.recruit.matcher.api.service.candidate.mapper.CandidateMapper::class.java)
    }

    fun recruiterToRecruiterResponseJson(entity: com.recruit.matcher.api.persistance.candidate.entity.Candidate): com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson
    fun recruiterRequestJsonToRecruiter(json: com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson): com.recruit.matcher.api.persistance.candidate.entity.Candidate

}
