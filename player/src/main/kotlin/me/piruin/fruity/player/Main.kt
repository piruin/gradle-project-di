package me.piruin.fruity.player

import me.piruin.fruity.merchant.Merchant

fun main(args: Array<String>) {

    val berry = Merchant().giveMeBerry()

    println("${berry.name} - ${berry.taste()}")
}


