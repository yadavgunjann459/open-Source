fun main(){
    val lion = Lion2()
    val cat = Cat2()

    val arr : Array<Animalfood2> = arrayOf(lion, cat)
    for(obj in arr){
        if(obj is Lion2){
            obj.eat()
        } else {
            (obj as Cat2).catName()
        }
    }
}

interface Animalfood2{
    fun foodType()
}

abstract class Animal2 : Animalfood2{
    abstract fun eat()
    abstract fun walk()
}

class Lion2 : Animal2(){
    override fun eat(){
        println("Lion Eat zebra and wildebeest")
    }
    override fun walk(){
        println("Lion walk on four leg")
    }

    override fun foodType() {
        println("Lion is Carnivores")
    }
}

class Penguin2 : Animal1(){
    override fun eat(){
        println("Penguin Eat krill, squids, and fishes")
    }
    override fun walk(){
        println("Penguin walk on Two leg")
    }
    override fun foodType() {
        println("Penguin is Carnivores")
    }
}
class Cow2 : Animal1(){
    override fun eat(){
        println("Cow Eat Grass")
    }
    override fun walk(){
        println("Cow walk on Four leg")
    }
    override fun foodType() {
        println("Cow is Herbivores")
    }
}

class Cat2 : Animalfood2{
    override fun foodType() {
        println("Cat is Omnivores")
    }

    fun catName(){
        println("Kitty")
    }

}
