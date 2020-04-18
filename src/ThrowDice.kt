class ThrowDice(private var dice: Array<Dice>) {
    fun throwDice() {
        for (i in 0 until 6) {
            if (!dice[i].locked) {
                dice[i].setDieNumber((1..6).random());
                println("Die ${dice[i].id + 1} Number: ${dice[i].number}")
            }
        }
    }
}