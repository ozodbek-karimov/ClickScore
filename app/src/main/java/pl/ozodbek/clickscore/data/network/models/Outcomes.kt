package pl.ozodbek.clickscore.data.network.models

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Outcomes {
    @SerialName("half_time")
    @Contextual
    var halfTime: Any? = null

    @SerialName("full_time")
    @Contextual
    var fullTime: Any? = null

    @SerialName("extra_time")
    @Contextual
    var extraTime: Any? = null
}