fun main() {
    var throwAgain = "n";
    println("Welcome to Yahtzee!")
    val game = Game()
    val diceChecker = DiceChecker()
    game.setDice()
    game.getDice().forEach { Dice -> Dice.throwDice() }
    game.incrementNumOfDiceThrows()
    do {
        if(diceChecker.checkScore(game.getDice())) {
            game.printDice()
            println("Do you want to continue playing?(y/n)")
            var continuePlaying = readLine()!!.toLowerCase()
            if (continuePlaying == "n") {
                break
            }
        }
        println("Do you want to lock dies?(y/n)")
        var lockAnswer = readLine()!!.toLowerCase()
        if (lockAnswer.equals("y")){
            println("How many?")
            var numOfDiceToLock = readLine()!!.toInt()
            for(x in 0 until numOfDiceToLock) {
                println("Which one?")
                var numberAnswer = readLine()!!.toInt()
                game.getDice()[numberAnswer - 1].lockDie()
            }
        }
        if (game.getNumOfDiceThrows() <= 3){
            println("Do you want to throw again?(y/n)")
            throwAgain = readLine()!!.toLowerCase()
            if (throwAgain == "y"){
                println("Throwing...")
                game.getDice().forEach { Dice -> Dice.throwDice() }
                game.incrementNumOfDiceThrows()
            }

        }
    }while (game.getNumOfDiceThrows() <= 3)
}