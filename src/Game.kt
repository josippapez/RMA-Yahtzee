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
    fun checkForYahtzee(): Boolean {
        var tempScore  = Array(6) { 0 }
        for (dice in dice){
            if (dice.number == 6){
                tempScore[5] += 6
            }
            else if (dice.number == 5){
                tempScore[4] += 5
            }
            else if (dice.number == 4){
                tempScore[3] += 4
            }
            else if (dice.number == 3){
                tempScore[2] += 3
            }
            else if (dice.number == 2){
                tempScore[1] += 2
            }
            else if (dice.number == 1){
                tempScore[0] += 1
            }
        }
        if (tempScore[0] == 5 || tempScore[1] == 10 || tempScore[2] == 15 || tempScore[3] == 20 || tempScore[4] == 25 || tempScore[5] == 30){
            println("YAHTZEE!")
            return true
        }
        return false
    }
    fun checkForLargeScale(): Boolean {
        var tempScore  = Array(6) { 0 }
        for (dice in dice){
            if (dice.number == 6){
                tempScore[5] = 6
            }
            else if (dice.number == 5){
                tempScore[4] = 5
            }
            else if (dice.number == 4){
                tempScore[3] = 4
            }
            else if (dice.number == 3){
                tempScore[2] = 3
            }
            else if (dice.number == 2){
                tempScore[1] = 2
            }
            else if (dice.number == 1){
                tempScore[0] = 1
            }
        }
        if ((tempScore[0] == 1 && tempScore[1] == 2 && tempScore[2] == 3 && tempScore[3] == 4 && tempScore[4] == 5)
                || (tempScore[1] == 2 && tempScore[2] == 3 && tempScore[3] == 4 && tempScore[4] == 5 && tempScore[5] == 6)){
            println("LARGE SCALE!")
            return true
        }
        return false
    }
    fun checkForSmallScale(): Boolean {
        var tempScore  = Array(6) { 0 }
        for (dice in dice){
            if (dice.number == 6){
                tempScore[5] = 6
            }
            else if (dice.number == 5){
                tempScore[4] = 5
            }
            else if (dice.number == 4){
                tempScore[3] = 4
            }
            else if (dice.number == 3){
                tempScore[2] = 3
            }
            else if (dice.number == 2){
                tempScore[1] = 2
            }
            else if (dice.number == 1){
                tempScore[0] = 1
            }
        }
        if ((tempScore[0] == 1 && tempScore[1] == 2 && tempScore[2] == 3 && tempScore[3] == 4)
                || (tempScore[1] == 2 && tempScore[2] == 3 && tempScore[3] == 4 && tempScore[4] == 5)
                || (tempScore[2] == 3 && tempScore[3] == 4 && tempScore[4] == 5 && tempScore[5] == 6)){
            println("Small Scale!")
            return true;
        }
        return false;
    }
    fun printDice(){
        for (x in 0 until 6) {
            print("${dice[x].number}\t")
        }
    }
}