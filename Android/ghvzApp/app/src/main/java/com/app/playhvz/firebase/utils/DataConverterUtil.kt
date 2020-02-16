/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.app.playhvz.firebase.utils

import com.app.playhvz.firebase.classmodels.*
import com.google.firebase.firestore.DocumentSnapshot

class DataConverterUtil {
    companion object {
        fun convertSnapshotToGame(document: DocumentSnapshot): Game {
            val game = document.toObject(Game::class.java)!!
            game.id = document.id
            return game
        }

        fun convertSnapshotToPlayer(document: DocumentSnapshot): Player {
            val player = document.toObject(Player::class.java)!!
            player.id = document.id
            return player
        }

        fun convertSnapshotToChatRoom(document: DocumentSnapshot): ChatRoom {
            val chatRoom = document.toObject(ChatRoom::class.java)!!
            chatRoom.id = document.id
            return chatRoom
        }

        fun convertSnapshotToMessage(document: DocumentSnapshot): Message {
            val message = document.toObject(Message::class.java)!!
            message.id = document.id
            return message
        }

        fun convertSnapshotToGroup(document: DocumentSnapshot): Group {
            val group = document.toObject(Group::class.java)!!
            group.id = document.id
            return group
        }
    }
}