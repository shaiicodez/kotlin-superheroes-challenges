fun UnqNumber(arr: Array<Int>): MutableList<Int> {

    var arrTest = arr.toMutableList()
    for (i in arr.indices) // 0 until arr.size
    {
        for (j in i + 1 until arr.size)
        {
            if (arr[i] == arr[j]) {
                arrTest.remove(arr[i])
                arrTest.remove(arr[j])
            }
        }
    }
    return arrTest

}

fun receivesString(name: String) {

    for (char in name.reversed()) {
        when{
            char.isUpperCase() -> print(char.lowercase())
            char.isLowerCase() -> print(char.uppercase())
        }
    }

}

fun arrayWithoutNull(arr: List<Int?>): MutableList<Int?> {

    var arrTest = arr.toMutableList()
    var count = 0
    for (item in arr) {
        if (arr.elementAt(count) == null ) {
            arrTest.removeAt(count)
        }
        count++
    }

    return arrTest
}