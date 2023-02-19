package ktor.models

import com.squareup.sqldelight.Query
import kotlinx.serialization.Serializable

@Serializable
data class KtorSearchRequest(
    val searchQuery: String
)