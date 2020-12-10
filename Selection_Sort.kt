fun main() {
    println("Before Sort")
    var A = intArrayOf(1, 7, 3, 9, 4)
    for (i in A) print(i )
    var n=A.size
    var temp:Int
    for(i in 0..n-1){
        var min_index = i
        for(j in n-1 downTo  i){
            if(A[j]< A[min_index])
            min_index=j
        }
        if(i!=min_index)
        {
            temp = A[i]
            A[i]= A[min_index]
            A[min_index]=temp
        }
    }
    println()
    println("Sorted array is : ")
    for (i in A) print(i )
    println();
}