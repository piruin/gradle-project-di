package me.piruin.fruity.berry

class Cranberry : Berry {
    override val name: String get() = javaClass.simpleName

    override fun taste(): String = "acidic taste that usually overwhelms its sweetness"
}
