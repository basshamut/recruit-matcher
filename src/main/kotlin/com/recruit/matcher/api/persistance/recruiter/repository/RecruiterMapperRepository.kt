package com.recruit.matcher.api.persistance.recruiter.repository

import com.recruit.matcher.api.persistance.recruiter.entity.Recruiter
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface RecruiterMapperRepository {
    @Select("SELECT * FROM recruitment.recruiters")
    fun findAll(): List<com.recruit.matcher.api.persistance.recruiter.entity.Recruiter>

    @Insert("INSERT INTO recruitment.recruiters (first_name, last_name, email, phone, company) VALUES (#{firstName}, #{lastName}, #{email}, #{phone}, #{company})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    fun create(recruiterMapped: com.recruit.matcher.api.persistance.recruiter.entity.Recruiter)
}