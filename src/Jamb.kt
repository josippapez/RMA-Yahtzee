fun main() {
    var throwAgain = "n";
    println("Welcome to Yahtzee!")
    val game = Game()
    game.setDice()
    ThrowDice(game.getDice()).throwDice()
    do {
        if(game.checkForYahtzee() || game.checkForLargeScale() || game.checkForLargeScale()){
            game.printDice()
            break
        }
        game.incrementNumOfDiceThrows()
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
        if (game.getNumOfDiceThrows() <= 10){
            println("Do you want to throw again?(y/n)")
            throwAgain = readLine()!!.toLowerCase()
            if (throwAgain == "y"){
                println("Throwing...")
                ThrowDice(game.getDice()).throwDice()
            }

        }
    }while (game.getNumOfDiceThrows() <= 10)
}