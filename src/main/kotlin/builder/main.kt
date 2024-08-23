package kr.co.unicore.offline.payment.builder

fun main() {
    val test = MailBuilder().to(listOf("test", "1111")).build()

    println(test)

    val test2 = MailBuilderV2(listOf("test", "1111")).message("메세지")


    println(test2)

}