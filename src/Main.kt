
fun main(){

    println("Enter first number :")
    val a = readln().toInt()

    println("Enter first number :")
    val b = readln().toInt()

        println("Enter Operator: + - * / :")
    val Operator = readln()

    when(Operator){
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> if (b == 0){
            println("Divided by 0 not possible")
        }
        else{
            println(a / b)
        }
        else -> println("Invalid")
    }
}



fun main(){
   println("Enter Number : ")
    val number = readln().toInt()

    for (i in 1  .. 10 ){
        println("$number * $i = ${number * i} ")
    }

}




fun main(){
    println("Enter number")
    var num = readln().toInt()

    for (i in 10 .. 20){
        println("$num * $i = ${num * i}")
    }
}




fun main(){

    var sum = 0
    for (i in 1..20){
        if (i%2 == 0){
            sum += i
        }
    }
    println(sum)
}


fun main(){
    var sum = 1

    for (i in 3..8){
        if (i % 3 == 0 ){
            sum *= i
        }
    }
    println(sum)
}



