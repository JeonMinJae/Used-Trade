package minjae.project.tradeapplication.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {

    constructor(): this("", "")
}