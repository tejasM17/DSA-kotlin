package leetcode

// revers whole array 2nd revers 1st k elements 3rd revers remaining elements

fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val res = IntArray(n)

        for (i in nums.indices) {
            res[(i + k) % n] = nums[i]
        }

        for (i in nums.indices) {
            nums[i] = res[i]
        }
}


fun main() {
    println(rotate(intArrayOf(1,2,3,4,5,6,7), 3))
}