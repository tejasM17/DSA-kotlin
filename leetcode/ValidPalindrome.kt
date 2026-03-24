package leetcode

class ValidPalindrome {
    fun validPalindrome(str: String): Boolean {
        var left = 0
        var right = str.length - 1

        while (left < right) {


            while (left < right && !str[left].isLetterOrDigit()) left++
            while (left < right && !str[right].isLetterOrDigit()) right++

            if (str[left].lowercase() != str[right].lowercase()){
                return false
            }
            left++
            right--
        }
        return true
    }
}

fun main() {
    val pal = ValidPalindrome()
    val ans = pal.validPalindrome("A man, a plan, a canal: Panama")
    println(ans)
}