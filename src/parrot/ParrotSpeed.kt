package parrot

import kotlin.math.max

class LegacyParrotSpeed(val type: ParrotTypeEnum) : SpeedCalculator {

    override fun getSpeed(parrot: Parrot) : Double = when (type) {
        ParrotTypeEnum.EUROPEAN -> parrot.baseSpeed
        ParrotTypeEnum.AFRICAN -> max(0.0, parrot.baseSpeed - parrot.loadFactor * parrot.numberOfCoconuts)
        ParrotTypeEnum.NORWEGIAN_BLUE -> if (parrot.isNailed) 0.0 else parrot.getBaseSpeed(parrot.voltage)
    }
}