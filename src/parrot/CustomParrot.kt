package parrot

val amazonParrotCalculator = CustomParrotCalculator({baseSpeed + voltage})

class CustomParrotCalculator(val function : Parrot.() -> Double) : SpeedCalculator {

    override fun getSpeed(parrot: Parrot) : Double = parrot.function()
}