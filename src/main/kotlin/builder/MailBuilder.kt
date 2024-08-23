package kr.co.unicore.offline.payment.builder

class MailBuilder {
    private var to: List<String> = listOf()
    private var cc: List<String> = listOf()
    private var title: String = ""
    private var message: String = ""
    private var important: Boolean = false

    class Mail internal constructor(
        val to: List<String>,
        val cc: List<String>?,
        val title: String?,
        val message: String?,
        val important: Boolean
    )

    fun to(to: List<String>): MailBuilder {
        this.to = to
        return this
    }

    fun build(): Mail {
        return Mail(to, cc, title, message, important)
    }
}