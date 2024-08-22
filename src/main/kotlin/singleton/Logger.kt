package kr.co.unicore.offline.payment.singleton

object Logger {
    init {
        println("싱글톤 객체")
    }

    fun log(message: String) {
        println(message)
    }
}