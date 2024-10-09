package com.recruit.matcher.api.service.recruiter.mapper

import com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson
import com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson
import com.recruit.matcher.api.persistance.recruiter.entity.Recruiter
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@Mapper(
    componentModel = "spring",
    uses = [com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson::class, com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson::class, com.recruit.matcher.api.persistance.recruiter.entity.Recruiter::class]
)
interface RecruiterMapper {

    companion object {
        val INSTANCE: com.recruit.matcher.api.service.recruiter.mapper.RecruiterMapper = Mappers.getMapper(com.recruit.matcher.api.service.recruiter.mapper.RecruiterMapper::class.java)
    }

    fun recruiterToRecruiterResponseJson(entity: com.recruit.matcher.api.persistance.recruiter.entity.Recruiter): com.recruit.matcher.api.controller.recruiter.dto.response.RecruiterResponseJson
    fun recruiterRequestJsonToRecruiter(json: com.recruit.matcher.api.controller.recruiter.dto.request.RecruiterRequestJson): com.recruit.matcher.api.persistance.recruiter.entity.Recruiter

}
