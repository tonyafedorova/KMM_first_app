package ktor

import io.ktor.client.*
import io.ktor.client.request.*
import ktor.models.KtorSearchGame
import ktor.models.KtorSearchRequest
import models.Game

class KtorGamesDataSource(private val httpClient: HttpClient) {
    suspend fun fetchAllGames(): List<KtorSearchGame> {
        return httpClient.post {
            url {
                header("Bearer-Authorization", "2574072e-e42e-472b-b1b3-25418f86eee4")
                body = KtorSearchRequest(searchQuery = "")
                url("http://10.0.2.2:8080/games/search")
            }
        }
    }

    suspend fun searchGame(query: String): List<KtorSearchGame> {
        return httpClient.post {
            url {
                header("Bearer-Authorization", "token")
                body = KtorSearchRequest(searchQuery = query)
                url("http://10.0.2.2:8080/games/search")
            }
        }
    }
}