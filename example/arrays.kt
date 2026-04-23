package example


fun main() {
    val arr = intArrayOf(1, 2, 3, 4,6,8, 5)
    println(arr.reversed())
    println(arr.minOrNull())
    println(arr.maxOrNull())
    println(arr.count { it % 2  == 0 })


}