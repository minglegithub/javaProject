fun main() {
    val res = Hello1()
    println(res)
    var e = "Hello"
    println(e)
}

fun Hello1() : Int {
    var num = 0
    for(i in 1..100) {
        num += i
    }
    return num

}
