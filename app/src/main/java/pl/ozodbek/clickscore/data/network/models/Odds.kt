package pl.ozodbek.clickscore.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Odds {
    @SerialName("pre")
    var pre: Pre? = null
}