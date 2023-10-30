package pl.ozodbek.clickscore.data.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class Pre {
    @SerialName("1")
    private var _1: Double? = null

    @SerialName("X")
    private var x: Double? = null

    @SerialName("2")
    private var _2: Double? = null

    fun get1(): Double? {
        return _1
    }

    fun set1(_1: Double?) {
        this._1 = _1
    }

    fun getX(): Double? {
        return x
    }

    fun setX(x: Double?) {
        this.x = x
    }

    fun get2(): Double? {
        return _2
    }

    fun set2(_2: Double?) {
        this._2 = _2
    }

}