package kr.co.unicore.offline.payment.factory.method

import javax.management.RuntimeErrorException


fun createPiece(notation: String): ChessPiece {
    val (type, file, rank) = notation.toCharArray();

    return when(type) {
        'p' -> Pawn(file, rank)
        'q' -> Queen(file, rank)
        else -> throw RuntimeException("Unknown piece type ${type}")
    }
}