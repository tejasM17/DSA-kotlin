package leetcode

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    val hashmp = HashMap<Int, Int>()

    for (i in numbers.indices) {
        val a = target - numbers[i]

        if (hashmp.containsKey(a)) {
            return intArrayOf(hashmp[a]!! + 1, i + 1)
        }
        hashmp[numbers[i]] = i
    }
    return intArrayOf()
}


fun main() {
    println(twoSum2(intArrayOf(2,3,4), 6).contentToString())
}