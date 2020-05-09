class DiceChecker {
    fun checkScore(dice: Array<Dice>): Boolean {
        var result = ""
        val numbers = dice.map { it.number }
        val sumOfEach = listOf(
                numbers.count { it == 1 },
                numbers.count { it == 2 },
                numbers.count { it == 3 },
                numbers.count { it == 4 },
                numbers.count { it == 5 },
                numbers.count { it == 6 }
        )
        if (numbers.containsAll(setOf(1, 2, 3, 4, 5))) {
            result += ("\nLarge Straight (1-5) !!\n")
        }
        if (numbers.containsAll(setOf(2, 3, 4, 5, 6))) {
            result += ("\nLarge Straight (2-6) !!\n")
        }
        if (sumOfEach.contains(2)) {
            result += ("\nPair !\n")
        }
        if (sumOfEach.contains(3)) {
            result += ("\nThree of a kind !!\n")
        }
        if (sumOfEach.contains(4)) {
            result += ("\nSmall Straight !\n")
        }
        if (sumOfEach.contains(5)) {
            result += ("\nYahtzee !\n")
        }
        if (result != "") {
            println(result)
            return true
        }
        return false
    }
}