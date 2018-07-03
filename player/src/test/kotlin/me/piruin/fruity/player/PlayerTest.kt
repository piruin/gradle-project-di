package me.piruin.fruity.player

import me.piruin.fruity.merchant.Merchant
import org.junit.Test

class PlayerTest {

    @Test
    fun gotCranberry() {
        val merchant = Merchant()

        val berry = merchant.giveMeBerry()

        assert(berry.name == "Cranberry")
        assert(berry.taste() == "acidic taste that usually overwhelms its sweetness")
    }
}
