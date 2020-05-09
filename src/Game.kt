class Game {
    private lateinit var dice : Array<Dice>
    private var numOfDiceThrows = 0

    fun setDice() {
        dice = Array(6) { i -> Dice(1, i) }
    }
    fun getDice(): Array<Dice> {
        return dice
    }
    fun getNumOfDiceThrows(): Int {
        return numOfDiceThrows
    }
    fun incrementNumOfDiceThrows() {
        this.numOfDiceThrows++
    }
    fun printDice(){
        for (x in 0 until 6) {
            print("${dice[x].number}\t")
        }
        println()
    }
}