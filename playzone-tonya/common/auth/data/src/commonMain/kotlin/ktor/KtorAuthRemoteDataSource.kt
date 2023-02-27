package ktor

import io.ktor.client.*
import io.ktor.client.request.*
import models.Token

class KtorAuthRemoteDataSource(
    private val httpClient: HttpClient
) {
    suspend fun performLogin(request: KtorLoginRequest): Token {
        return httpClient.post {
            url {
                body = request
                url("http://10.0.2.2:8080/login")
            }
        }
    }
}