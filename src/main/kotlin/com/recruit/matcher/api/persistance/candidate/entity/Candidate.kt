package com.recruit.matcher.api.persistance.candidate.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Timestamp

@Document(collection = "candidates")
data class Candidate(
    @Id
    var id: String? = null,
    var firstName: String = "",
    var lastName: String = "",
    var email: String = "",
    var phone: String = "",
    var address: String = "",
    var city: String = "",
    var state: String = "",
    var country: String = "",
    var postalCode: String = "",
    var university: String = "",
    var academicDegree: String = "",
    var workExperience: String = "",
    var skills: String = "",
    var creationDate: Timestamp? = null
)