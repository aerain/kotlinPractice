package one

// 기본적인 스트링
fun main() {
    for(i in 1..9) {
        for(j in 1..9) {
            val mul: Int = i * j
            val result: String = "$i * $j = $mul"
            println(result);
        }
    }
}