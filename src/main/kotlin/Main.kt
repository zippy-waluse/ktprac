fun main(args: Array<String>) {
//    ispalindrome("Waluse")
//    var product = Product("Pen",20.0,1)
    var calculator = Calculator()
    var add = calculator.add(5,4)
    println(add)

    var subtract = calculator.subtract(3,1)
    println(subtract)

    var multiply = calculator.multiply(2,2)
    println(multiply)

    var divide = calculator.divide(4,2)
}

//fun ispalindrome(str: String): Boolean {
//    var start = 0
//    var end = str.length - 1
//    while (start < end) {
//        if (str[start] != str[end]) {
//            return false
//        }
//        start++
//        end--
//    }
//    return true
//}


class Product(val name: String, val price: Double, var quantity: Int) {
    fun calculateTotalCost(): Double {
        return price * quantity
    }
}


//Create a class Calculator with functions add(), subtract(), multiply(), and divide().
class Calculator{
    fun add(number:Int,secondNumber: Int):Int{
        return number + secondNumber

    }

    fun subtract(number: Int,secondNumber: Int):Int{
        return number-secondNumber
    }

    fun multiply(number: Int,secondNumber:Int):Int{
        return number- secondNumber
    }

    fun divide(number: Int,secondNumber: Int):Int{
         return number / secondNumber
    }
}







