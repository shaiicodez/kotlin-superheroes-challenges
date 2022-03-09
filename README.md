# Coding Challenges

## 1st Challenge
Create a function that receives an integers array and returns the number that appeared only once.

| Input           | Output   |
| --------------- | -------- |
| (2,4,6,4,9,6,2) | 9        |
| (1,1,2)         | 2        |
| (2,2,1)         | 1        |

fun findDiffNum() {
val arry = intArrayOf(2, 6, 6, 4, 9, 4, 2)
var y = arry.toMutableList()
for (i in arry.indices) {
for (z in i + 1 until arry.size) {
if (arry[i] == arry[z]) {
y.remove(arry[i])
y.remove(arry[z])
}
}
}

}
## 2nd Challenge
Create a function that receives a string then it converts uppercase letters into lowercase and vice versa. The function then should print the converted value.

| Input          | Output         |
| -------------- | -------------- |
| Hello          | hELLO          |
| Hi             | hI             |
| Hello World    | hELLO wORLD    |
| My name is Ali | mY NAME IS aLI |
| sHroog         | ShROOG         |

fun lowerCase(){
val hello = "heLLO"
for (i in hello){
when{
i.isUpperCase() -> print(i.lowercase())
i.isLowerCase() -> print(i.uppercase())
else -> print(i)
}

    }}
## 3rd Challenge
Create a function that receives an array of items & arrays and returns one flattened array with all items exluding null values.

| N | Input                                 | Output                |
| - | ------------------------------------- | --------------------- |
| 1 | [1,[2,3,null,4],[null],5]             | [1,2,3,4,5]           |
| 2 | [7, 0,[null],[null, null, 9]]         | [7, 0, 9]             |
| 3 | [[null, 3], [2, 4, 5, null], 0, 8, 3] | [3, 2, 4, 5, 0, 8, 3] |
| 4 | [3, 5, [5, 9, 0]]                     | [3, 5, 5, 9, 0]       |

fun deletenull(){
val list = listOf(1,2,3,4,5,null,7,null)
val list2 = mutableListOf<Int>()
for (i in list){
if (i != null){
list2.add(i)
}
}
println(list2)
}
## 4th Challenge
Create a function that receives a string that contains combination of parentheses, square brackets, and curly braces. Then, it returns true if every opening bracket has a closing pair.

| Input    | Output |
| -------- | -------- |
| }{       | false    |
| ()       | true     |
| )({}     | false    |
| ({ }})   | false    |
| ({ })    | true     |
| {{()}}   | true     |
| {{()}    | false    |
| [{}]     | true     |
| {[(}])   | true     |
| {[}])    | false    |

fun isValid(s: String): Boolean {
val map: MutableMap<Char, Char> = HashMap()
map['('] = ')'
map['['] = ']'
map['{'] = '}'
val stack = Stack<Char>()
for (c in s.toCharArray()) {
if (map.containsKey(c)) {
stack.push(c)
} else if (!stack.empty() && map[stack.peek()] == c) {
stack.pop()
} else {
return false
}
}
return stack.empty()
}

