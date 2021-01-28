package parrot

class BabyParrot(
    speedPcalculator: SpeedCalculator,
    numberOfCoconuts: Int,
    voltage: Double,
    isNailed: Boolean
) : Parrot(speedPcalculator,numberOfCoconuts,voltage, isNailed) {

    override val speed: Double
        get() = super.speed/2

    override val loadFactor: Double
        get() = super.loadFactor*1.5

}