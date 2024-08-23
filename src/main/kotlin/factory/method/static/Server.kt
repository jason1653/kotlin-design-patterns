package kr.co.unicore.offline.payment.factory.method.static

class Server(port: Long) {
    init {
        println("$port 포트에서 서버가 시작됐습니다")
    }

    companion object {
        fun withPort(port: Long) = Server(port)
    }
}