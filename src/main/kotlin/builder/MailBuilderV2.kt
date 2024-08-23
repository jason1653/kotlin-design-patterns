package kr.co.unicore.offline.payment.builder

data class MailBuilderV2(
    val to: List<String>,
    private var message: String? = null
) {
    fun message(message: String) = apply { this.message = message }
}