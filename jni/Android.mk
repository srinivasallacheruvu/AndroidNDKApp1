LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := Data
LOCAL_SRC_FILES := Data.c
LOCAL_LDLIBS += -llog
include $(BUILD_SHARED_LIBRARY)