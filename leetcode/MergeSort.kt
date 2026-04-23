package leetcode

class MergeSort {
    fun merge(A: IntArray, m: Int, B: IntArray, n: Int): IntArray {
        var idx = m + n - 1
        var i = m - 1
        var j = n - 1
        while (i >= 0 && j >= 0){
            if (A[i] >= B[j]){
                A[idx--] = A[i--]
            } else {
                A[idx--] = B[j--]
            }
        }

        while (j >= 0){
            A[idx--] = B[j--]
        }

        return A
    }
}


fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3

    val nums2 = intArrayOf(2, 5, 6)
    val n = 3

    val obj = MergeSort()
    obj.merge(nums1, m, nums2, n)

    println(nums1.joinToString())
}