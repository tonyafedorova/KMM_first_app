package ktor

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import ktor.models.KtorSearchGame
import ktor.models.KtorSearchRequest
import models.Game

class KtorGamesDataSource(private val httpClient: HttpClient) {
    suspend fun fetchAllGames(): List<KtorSearchGame> {
        return httpClient.post {
            header("Bearer-Authorization", "")
            url {
                path("/games/search")
                body = KtorSearchRequest(searchQuery = "")
            }
        }
    }

    suspend fun searchGame(query: String): Game {
        return Game(gameId = "", title = "Sims4")
    }
}