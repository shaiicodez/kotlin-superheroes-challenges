import java.util.*
import kotlin.collections.HashMap

//1st Challenge
fun UniqueNumber(){
    var array = intArrayOf(1,2,3,2,1)
    var ara = array.toMutableList()

    for (e in array.indices){
        for (n in e + 1 until array.size){
            if (array[n]==array[e]){

                ara.remove(array[e])
                ara.remove(array[n])
                println(ara)
            }
        }
    }
}
fun main(){
    var q =UniqueNumber()
    println(q)
}
/**************************************************/
//2st Challenge
fun switchletters(){
    val text = "Hello World"
    for (e in text) {
        when {
            e.isUpperCase() -> print(e.lowercase())
            e.isLowerCase() -> print(e.uppercase())
            else -> print(e)
        }
    }
}
fun main(){
    var q = switchletters()
}
/***********************************************/
//3st Challenge
fun RemoveNullValue(){
    val list = listOf(9,5,6,null,10)
    val l = mutableListOf<Int>()
    for (i in list){
        if (i != null){
            l.add(i)
        }
    }
    println(l)
}
fun main(){
    var q = RemoveNullValue()
}
/***************************************************/
//4st Challenge
fun IsPair(p: String): Boolean {
    val map: MutableMap<Char, Char> = HashMap()
    map['('] = ')'
    map['['] = ']'
    map['{'] = '}'
    val stk = Stack<Char>()
    for (e in p.toCharArray()) {
        if (map.containsKey(e)) {
            stk.push(e)
        } else if (!stk.empty() && map[stk.peek()] == e) {
            stk.pop()
        } else {
            return false
        }
    }
    return stk.empty()
}
