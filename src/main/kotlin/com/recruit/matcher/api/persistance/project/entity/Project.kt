package com.recruit.matcher.api.persistance.project.entity

import com.recruit.matcher.api.utils.enums.ProjectState
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Date
import java.sql.Timestamp

@Document(collection = "projects")
data class Project(
        @Id
        var id: String? = null,
        var name: String = "",
        var description: String = "",
        var startDate: Date? = null,
        var endDate: Date? = null,
        var recruiterId: Int = 0,
        var creationDate: Timestamp? = null,
        var applicants: List<String> = emptyList(),
        var applicantsAccepted: List<String> = emptyList(),
        var state: Enum<ProjectState> = ProjectState.OPEN
)
