package pl.ozodbek.clickscore.data.network

import okhttp3.Response
import pl.ozodbek.clickscore.data.network.models.Match
import pl.ozodbek.clickscore.data.network.models.Odds
import retrofit2.http.GET

interface ClickScoreAPI {

    @GET("scores/live.json&key=0i2zzTypJxElchjx&secret=VBIbMOPJ7ZhDbfJcxML6FkwpSbL4s4Bn")
    suspend fun getScores(): List<Response>

}