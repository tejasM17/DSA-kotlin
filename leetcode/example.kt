package leetcode

fun sortedSquares(nums: IntArray): IntArray {
    val sort = nums.map { it * it }.sorted().toIntArray()
    return sort
}

fun main() {
    println(sortedSquares(intArrayOf(-4,-1,0,3,10)))
}
