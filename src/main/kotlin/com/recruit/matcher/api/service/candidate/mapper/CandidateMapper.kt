package com.recruit.matcher.api.service.candidate.mapper

import com.recruit.matcher.api.controller.candidate.dto.request.CandidateRequestJson
import com.recruit.matcher.api.controller.candidate.dto.response.CandidateResponseJson
import com.recruit.matcher.api.persistance.candidate.entity.Candidate
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper(
    componentModel = "spring",
    uses = [CandidateRequestJson::class, CandidateResponseJson::class, Candidate::class]
)
interface CandidateMapper {

    companion object {
        val INSTANCE: CandidateMapper = Mappers.getMapper(CandidateMapper::class.java)
    }

    fun recruiterToRecruiterResponseJson(entity: Candidate): CandidateResponseJson
    fun recruiterRequestJsonToRecruiter(json: CandidateRequestJson): Candidate

}
