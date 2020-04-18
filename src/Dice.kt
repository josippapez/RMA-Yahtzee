class Dice(number: Int, id: Int){
    val id = id;
    var number= number;
    var locked = false;
    fun setDieNumber(rolled: Int) {
        number = rolled;
    }
    fun lockDie(){
        locked = !locked
    }
}