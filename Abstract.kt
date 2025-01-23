fun main(){
    var rectangle = Rectangle(4.0,5.0)
    rectangle.display()
    println(rectangle.area())


}

abstract class Form{
    abstract fun area() : Double
    abstract fun display()
}

class Rectangle(val length : Double, val width : Double) : Form(){
    override fun area(): Double {
        return length * width
    }

    override fun display() {
        println("Area of Circle")
    }
}