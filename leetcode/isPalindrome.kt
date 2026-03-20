package leetcode

fun isPalindrome(s: String): Boolean {
    var lef = 0
    var rig = s.length - 1
    if (s.length == 1) return true

    while (lef < rig){
        while (lef < rig && !s[lef].isLetterOrDigit()) {
            lef++
        }
        while (lef < rig && !s[rig].isLetterOrDigit()) {
            rig++
        }

        if (s[lef].lowercase() != s[rig].lowercase()){
            return false
        }
        lef++
        rig--
    }
    return true
}

fun main() {
    println(isPalindrome("racecar"))
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("a"))

}