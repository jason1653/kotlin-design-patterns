package kr.co.unicore.offline.payment.factory.method

fun main() {
    val notations = listOf("pa8", "qc3");
    val pieces = mutableListOf<ChessPiece>()

    for(n in notations) {
        val piece = pieces.add(createPiece(n))
    }

    println(pieces)
}