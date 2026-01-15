class Solution {
    fun twoSum(nums:IntArray, target:Int):IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val comp = target - nums[i]
            
            if(map.containsKey(comp)) {
                return intArrayOf(map[comp]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}




fun main() {
    val solution = Solution()

    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val result = solution.twoSum(nums, target)
    println(result.joinToString())
}
