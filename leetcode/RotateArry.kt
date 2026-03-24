package leetcode

// revers whole array 2nd revers 1st k elements 3rd revers remaining elements

class RotateArry {
    private fun reverse(nums: IntArray, start: Int, end: Int) {
        var left = start
        var right = end

        while (left < right) {
            val tmp = nums[left]
            nums[left] = nums[right]
            nums[right] = tmp
            left++
            right--
        }
    }

    fun rotate(nums: IntArray, k: Int) {
        val length = nums.size
        val kk = k % length

        if (kk == 0) return

        val mid = length - kk
        reverse(nums, 0, mid - 1)
        reverse(nums, mid, length - 1)
        reverse(nums, 0, length - 1)
    }
}


fun main() {
    val arr = RotateArry()
    val cont = intArrayOf(1,2,3,4,5,6,7)
    val ans = arr.rotate(cont, 3)
    println(ans)
}