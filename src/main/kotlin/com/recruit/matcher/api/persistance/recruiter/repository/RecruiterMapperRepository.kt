package com.recruit.matcher.api.persistance.recruiter.repository

import com.recruit.matcher.api.persistance.recruiter.entity.Recruiter
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RecruiterMapperRepository: MongoRepository<Recruiter, String> {
}