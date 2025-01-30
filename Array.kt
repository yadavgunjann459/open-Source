fun main(){
//    println("Arin Yadav");
    val name = arrayOf("Arin", "Ankit", "Gunjan", "Prince", "Payal")
    
    for(i in 0 .. name.size-1){
        println(name[i])
    }

    for(i in name){
        println(i)
    }

    for((index, value) in name.withIndex()){
        println("Index: $index Value: $value")
    }

    val number = intArrayOf(1, 2, 3, 4, 5)

    for(i in number){
        println(i)
    }

    val number2 = Array(5, {i -> i*2})


    for(i in number2){
        println(i)
    }
}