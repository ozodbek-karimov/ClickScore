package pl.ozodbek.clickscore.data.network.models

import kotlinx.serialization.Serializable


@Serializable
class Match {
    var score: String? = null

    var psScore: String? = null

    var leagueId: Int? = null

    var h2h: String? = null

    var competitionId: Int? = null

    var events: String? = null

    var scheduled: String? = null

    var awayId: Int? = null

    var htScore: String? = null

    var homeName: String? = null

    var awayName: String? = null

    var id: Int? = null

    var location: String? = null

    var homeId: Int? = null

    var competitionName: String? = null

    var etScore: String? = null

    var leagueName: String? = null

    var added: String? = null

    var fixtureId: Int? = null

    var lastChanged: String? = null

    var hasLineups: Boolean? = null

    var ftScore: String? = null

    var odds: Odds? = null

    var time: String? = null

    var status: String? = null

    var outcomes: Outcomes? = null

    var info: String? = null
}