fun main() {

    val arr = arrayOf(2, 4, 6, 4, 9, 6)
    challenge1(arr)
    challenge2("My name is Ali")
    val num = arrayOf(1, 2, 3, null, 34, null, 456)
    challenge3(num)
    challenge4(")({}")


}

fun challenge1(arr: Array<Int>) {


}

fun challenge2(s: String) {

    val chars = s.toCharArray()
    var newWord = ""
    for (i in chars) {
        newWord += if (i.isLowerCase()) {
            i.uppercaseChar().toString()
        } else {
            i.lowercaseChar().toString()
        }
    }
    println(newWord)
}

fun challenge3(arr2: Array<Int?>) {
    println(arr2.filterIsInstance<Number>())
}

fun challenge4(s: String) {


}






