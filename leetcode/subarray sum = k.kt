package leetcode

class Solution1 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var preSum = 0
        var count = 0

        val map = HashMap<Int, Int>()
        map[0] = 1

        for (i in nums.indices) {
            preSum += nums[i]
            if (map.containsKey(preSum - k)) {
                count += map[preSum - k]!!
            }
            map[preSum] = map.getOrDefault(preSum, 0) + 1
        }
        println("preSum = ${nums.contentToString()}")
        return count
    }
}

fun main() {
    val ob1 = Solution1()

    println(ob1.subarraySum(intArrayOf(1,-1,0), 0))
}