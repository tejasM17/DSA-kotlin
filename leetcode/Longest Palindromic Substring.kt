package leetcode

class Solution {
    fun longestPalindrome(s: String): String {
        var result = ""

        for (i in s.indices) {
            var l = i
            var r = i

            while (l >= 0 && r < s.length && s[l] == s[r]) {
                if ((r - l + 1) > result.length) {
                    result = s.substring(l, r + 1)
                }
                r++
                l--
            }
            l = i
            r = i + 1
            while (l >= 0 && r < s.length && s[l] == s[r]) {
                if ((r - l + 1) > result.length) {
                    result = s.substring(l, r + 1)
                }
                r++
                l--
            }
        }
        return  result
    }

    fun isPalindrome(s: String): String {
        var left = 0
        var right = s.length - 1

        if (s.length == 1) {
            return s
        }

        while (left < right) {
            if (s[left] != s[right]){
                break
            }
            left++
            right--
        }
        return s
    }
}

fun main() {
    val s = "babad"
    val d = "cbbd"
    val solution = Solution()
    println(solution.longestPalindrome(s))
    println(solution.longestPalindrome(d))
}