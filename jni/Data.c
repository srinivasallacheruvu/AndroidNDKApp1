
#include <com_example_androidndkapp1_Data.h>
#include <android/log.h>
#include <stdio.h>
// GetStringUTFChars(env,data,NULL) ReleaseStringUTFChars();
JNIEXPORT void JNICALL Java_com_example_androidndkapp1_Data_stringtojni(JNIEnv *env, jobject thiz, jstring data){

 //const jbyte *str;
 char outbuf[128];

//str=(*env)->GetStringUTFChars(env,data,NULL);
 int len=(*env)->GetStringLength(env,data);
 (*env)->GetStringUTFRegion(env,data,0,len,outbuf);
 __android_log_print(ANDROID_LOG_DEBUG, "Stringtojni", outbuf);



//(*env)->ReleaseStringUTFChars(env,data,str);
}


JNIEXPORT jstring JNICALL Java_com_example_androidndkapp1_Data_stringfromjni(JNIEnv *env, jobject thiz){

char buf[]="hellofriend";
__android_log_print(ANDROID_LOG_DEBUG, "stringfromjni", buf);
return (*env)->NewStringUTF(env,buf);
}
