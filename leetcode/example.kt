package leetcode

fun main() {
    val intarr = intArrayOf(2,7,11,15)
    val trget = 9

    var l = 0
    var r = intarr.size - 1
    var res = IntArray(2)

    do {
        if (intarr[l] + intarr[r] == trget){
            res[0] = l + 1
            res[1] = r + 1
            println(res)
        }
        if (intarr[l] + intarr[r] > trget) r--
        else l++
    }while (l < r)
}