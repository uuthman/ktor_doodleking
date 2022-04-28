package com.example.data.models

import com.example.other.Constants.TYPE_JOINED_ROOM_HANDSHAKE

data class JoinedRoomHandshake(
    val username: String,
    val roomName: String,
    val clientId: String
): BaseModel(TYPE_JOINED_ROOM_HANDSHAKE)
