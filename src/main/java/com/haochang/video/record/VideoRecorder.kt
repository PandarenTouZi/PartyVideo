package com.haochang.video.record

/**
 * author:pandaren
 * createDate:2023/11/6 18:29
 */
class VideoRecorder {

    fun test(): String {
        return VideoRecorderNative().stringFromJNI()
    }
}