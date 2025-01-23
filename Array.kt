fun main(){
//    println("Arin Yadav");
    val name = arrayOf("Arin", "Ankit", "Gunjan", "Prince", "Payal")
    println(name[1]);
    for(i in 0 .. name.size-1){
        println(name[i])
    }
    println()
    for(i in name){
        println(i)
    }
    println(name.size)

    if("Ajay" in name){
        println("Exist")
    }else{
        println("Not Exist")
    }

    for((i, v) in name.withIndex()){
        println("$i - $v")
    }
    println(name.get(3))
    name.set(2, "Pankaj")
    println(name.get(2))
    println(name.size)

    val arr = arrayOfNulls<Int>(5);
    arr[1] = 2
    arr[2] = 3
    for(j in arr.indices-1){
        println(arr[j])
    }



}