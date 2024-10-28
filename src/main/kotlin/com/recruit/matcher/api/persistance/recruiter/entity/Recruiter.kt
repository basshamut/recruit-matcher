package com.recruit.matcher.api.persistance.recruiter.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Timestamp

@Document(collection = "recruiters")
data class Recruiter(
    @Id
    var id: String? = null,
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var phone: String = "",
    var company: String = "",
    var creationDate: Timestamp? = null,
    var projects: List<String> = emptyList()
)
