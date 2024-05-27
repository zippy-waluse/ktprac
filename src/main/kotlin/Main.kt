fun main(args: Array<String>) {
    ispalindrome("Waluse")
}

fun ispalindrome(str: String): Boolean {
    var start = 0
    var end = str.length - 1
    while (start < end) {
        if (str[start] != str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}