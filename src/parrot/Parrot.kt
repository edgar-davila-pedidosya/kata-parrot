package parrot

import kotlin.math.min

open class Parrot(
    val speedCalculator: SpeedCalculator,
    val numberOfCoconuts: Int,
    val voltage: Double,
    val isNailed: Boolean
) {
    open val speed: Double
        get() = speedCalculator.getSpeed(this)

    open val loadFactor: Double
        get() = 9.0

    open val baseSpeed: Double
        get() = 12.0

    fun getBaseSpeed(voltage: Double): Double = min(24.0, voltage * baseSpeed)
}