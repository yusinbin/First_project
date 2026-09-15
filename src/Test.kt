


fun binyusin(num :Boolean, bin:(Boolean) -> Boolean ):Boolean {
    return bin(num)
}

fun anythings(num1: Int, num2: Int, name1: String, name2: String, yusin:(Int, Int, String, String)->Boolean): Boolean {
    return yusin(num1,num2,name1,name2)
}

fun main() {

    val result = binyusin(num = false){input -> input}
    print(result)
}