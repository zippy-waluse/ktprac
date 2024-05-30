fun main(args: Array<String>) {
//    ispalindrome("Waluse")
    var product = Product("Pen",20.0,1)

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








