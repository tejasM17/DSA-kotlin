package leetcode

fun threeSum(nums: IntArray): List<List<Int>> {
    nums.sort()
    val result = mutableListOf<List<Int>>()

    for (i in nums.indices) {

        if (i > 0 && nums[i] == nums[i - 1]) continue

        var left = i + 1
        var right = nums.lastIndex

        while (left < right) {

            val sum = nums[i] + nums[left] + nums[right]

            when {
                sum < 0 -> left++
                sum > 0 -> right--
                else -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))

                    // skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--

                    left++
                    right--
                }
            }
        }
    }

    return result
}

fun main() {
    println(threeSum(intArrayOf(-1,0,1,2,-1,-4)))
}