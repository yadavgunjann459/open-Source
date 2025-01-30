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
    
}