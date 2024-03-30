package dev.panwar.webrtcvideocalling.utils

import dev.panwar.webrtcvideocalling.models.MessageModel

interface NewMessageInterface {
    fun onNewMessage(message: MessageModel)
}