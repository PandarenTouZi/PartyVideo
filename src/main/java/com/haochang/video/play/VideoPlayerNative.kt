package com.haochang.video.play

/**
 * author:pandaren
 * createDate:2023/11/6 18:22
 */
internal class VideoPlayerNative {
    external fun stringFromJNI(): String

    init {
        System.loadLibrary("video")
    }
}