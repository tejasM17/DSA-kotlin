package leetcode

fun twoSum(nums: IntArray , target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for (i in nums.indices){
        val y = target - nums[i]

        if (map.containsKey(y)){
            return intArrayOf(map[y]!!, i)
        }
        map[nums[i]] = i
        println(map)
    }
    println(intArrayOf())
    return intArrayOf()
}

fun main() {
    println(twoSum(intArrayOf(2,7,11,15), 9).contentToString())
}