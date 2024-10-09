package com.recruit.matcher.api.config

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType
import io.swagger.v3.oas.annotations.security.SecurityScheme
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.security.SecurityRequirement
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", scheme = "bearer")
class OpenApi30Config {
    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
                .components(Components().addSecuritySchemes("bearerAuth",
                        io.swagger.v3.oas.models.security.SecurityScheme().type(io.swagger.v3.oas.models.security.SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
                .info(Info().title("Recruit Matcher API").version("v1"))
                .addSecurityItem(SecurityRequirement().addList("bearerAuth", mutableListOf("read", "write")))
    }

}