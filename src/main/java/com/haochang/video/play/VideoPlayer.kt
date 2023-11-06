package com.haochang.video.play

/**
 * author:pandaren
 * createDate:2023/11/6 18:29
 */
class VideoPlayer {

    fun test(): String {
        return VideoPlayerNative().stringFromJNI()
    }
}