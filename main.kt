fun main() {
    val string = "AzZaM"
    challenge2(string)
    /*------------------------------------------------------------------------------*/
    val list = arrayListOf(1, 2, 3, null, 4, null, 5)
    challenge3(list)
}
    /*------------------------------------------------------------------------------*/
fun challenge2(string: String) {
    for (char in string) {
        if (char.isUpperCase()) print(char.lowercase())
        else if (char.isLowerCase()) print(char.uppercase())
    }
    print("\n")
}
    /*------------------------------------------------------------------------------*/
fun challenge3(list: ArrayList<Int?>) {
    for (element in list) {
        if (element == null) {
            continue
        }
        print(element)
    }
}

// Sorry I don't solve the other challenges, I have to prepare to the interviews tomorrow (^-^)
