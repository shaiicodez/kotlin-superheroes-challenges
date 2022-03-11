# Coding Challenges

## 1st Challenge
Create a function that receives an integers array and returns the number that appeared only once.

| Input           | Output   |
| --------------- | -------- |
| (2,4,6,4,9,6,2) | 9        |
| (1,1,2)         | 2        |
| (2,2,1)         | 1        |

//--------------------------Answer 1st Challenge-----------------------------//
Note : The function will only return an integer not an array or mutable list that means it will handle a single non-recurring number
//------------------------------- code start -------------------------------//

fun main() {
println(firstChallenge(arrayOf(2, 4, 6, 4, 9, 6, 2)))
println(firstChallenge(arrayOf(1, 1, 2)))
println(firstChallenge(arrayOf(2, 2, 1)))
println(firstChallenge(arrayOf(2, 2, 1, 1)))
println(firstChallenge(arrayOf(0,0,0)))
println(firstChallenge(arrayOf()))
}

fun firstChallenge(theInput: Array<Int>): Int? {
val array = theInput.toMutableList()

    if (array.isEmpty()) {
        print("The array is empty - The value is: ")
        return null
    } else {
        for (i in array.indices) {
            for (element in i + 1 until theInput.size) {
                if (theInput[i] == theInput[element]) {
                    array.remove(theInput[i])
                    array.remove(theInput[element])
                }
            }
        }
    }
    if (array.isEmpty()) {
        print("No number appeared once - The value is: ")
        return null
    }
    return array[0].toInt()
}
//---------------------------- code end -----------------------------//



## 2nd Challenge
Create a function that receives a string then it converts uppercase letters into lowercase and vice versa. The function then should print the converted value.

| Input          | Output         |
| -------------- | -------------- |
| Hello          | hELLO          |
| Hi             | hI             |
| Hello World    | hELLO wORLD    |
| My name is Ali | mY NAME IS aLI |
| sHroog         | ShROOG         |

//--------------------------Answer 2nd Challenge-----------------------------//
//------------------------------ code start --------------------------------//

fun main() {
secondChallenge("Hello")
secondChallenge("Hi")
secondChallenge("Hello World")
secondChallenge("My name is Ali")
secondChallenge("sHroog")
}

fun secondChallenge(theInput: String) {

    for (char in theInput) {
        when {
            char.isWhitespace() -> print(" ")
            char.isLowerCase() -> print(char.uppercase())
            char.isUpperCase() -> print(char.lowercase())
        }
    }
    print("\n")
}
//---------------------------- code end -----------------------------//


## 3rd Challenge
Create a function that receives an array of items & arrays and returns one flattened array with all items exluding null values.

| N | Input                                 | Output                |
| - | ------------------------------------- | --------------------- |
| 1 | [1,[2,3,null,4],[null],5]             | [1,2,3,4,5]           |
| 2 | [7, 0,[null],[null, null, 9]]         | [7, 0, 9]             |
| 3 | [[null, 3], [2, 4, 5, null], 0, 8, 3] | [3, 2, 4, 5, 0, 8, 3] |
| 4 | [3, 5, [5, 9, 0]]                     | [3, 5, 5, 9, 0]       |
//--------------------------Answer 3rd Challenge-----------------------------//
Note:I searched for a solution for two days and could not solve the problem of having an array inside an array I apologize for the delay in submitting my assignment

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

//--------------------------Answer 4th Challenge-----------------------------//
//------------------------------ code start --------------------------------//

fun main() {
println(fourthChallenge("()"))
println(fourthChallenge("({ }})"))
println(fourthChallenge("({ })"))
println(fourthChallenge("{{()}}"))
println(fourthChallenge("{{()}"))
println(fourthChallenge("[{}]"))
println(fourthChallenge("{[(}])"))
println(fourthChallenge("{[}])"))
}

fun fourthChallenge(brackets: String): Boolean {
if (brackets[0] == '{') {
return false
}
val stack = Stack<Char>()
var c: Char
for (element in brackets) {
c = element
when (c) {
'(' -> stack.push(c)
'{' -> stack.push(c)
')' -> when {
stack.empty() -> return false
stack.peek() == '(' -> stack.pop()
else -> return false
}
'}' -> when {
stack.empty() -> return false
stack.peek() == '{' -> stack.pop()
else -> return false
}
}
}
return stack.empty()
}
//---------------------------- code end -----------------------------//

