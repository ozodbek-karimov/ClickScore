package pl.ozodbek.clickscore.data.network

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val api: ClickScoreAPI,

) : SafeApiCall{
    suspend fun getScores() = safeApiCall { api.getScores() }
}