package com.recruit.matcher.api.persistance.candidate.repository

import com.recruit.matcher.api.persistance.candidate.entity.Candidate
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CandidateMapperRepository : MongoRepository<Candidate, String> {
}