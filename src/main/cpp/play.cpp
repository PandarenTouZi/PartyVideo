#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_haochang_video_play_VideoPlayerNative_stringFromJNI(JNIEnv *env, jobject thiz) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}