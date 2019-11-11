package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IRandomProvider
import java.util.*

class RandomProvider : IRandomProvider {

    override fun getRandomIndexes(count: Int): List<Int> {
        val indexes = mutableListOf<Int>()

        val random = Random()

        while (indexes.size < count) {
            val index = random.nextInt(12) + 1

            if (!indexes.contains(index)) {
                indexes.add(index)
            }
        }

        return indexes
    }

}
