package com.haochang.video.record

/**
 * author:pandaren
 * createDate:2023/11/6 18:23
 */
internal class VideoRecorderNative {
    external fun stringFromJNI(): String

    init {
        System.loadLibrary("video")
    }
}