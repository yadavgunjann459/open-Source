fun main(){
    val Creta = Car("Creta", "Desial", "XUV", "Base Modal", "12 Lakh")
    val Verna = Car("Verna", "Petrol", "Sidan", "TOP Modal", "15 Lakh")
    println( "Creta Price " +Creta.price)
    println( "Verna Price " +Verna.price)
    Creta.allDetails();
    Verna.allDetails();
    val p1 = Person("Ankit", 21)
    val p2 = Person("Rohan", 8)
    println(p1.canVote())
    println(p2.canVote())
}

// Arin Yadav - Arin Yadav - Arin Yadav

class Car(val CarName : String, val engine : String, val design : String, val modal : String, var price : String){
    fun allDetails(){
        println(CarName +", " +engine +", " +design +", " +modal +", " +price);
    }
}
class Person(val name : String, val age : Int){
    fun canVote() : Boolean{
        return age > 18
    }
}