// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1179 {

    static final FunctionDescriptor SafeArrayReleaseDescriptor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayReleaseDescriptor$MH = RuntimeHelper.downcallHandle(
        "SafeArrayReleaseDescriptor",
        constants$1179.SafeArrayReleaseDescriptor$FUNC
    );
    static final FunctionDescriptor SafeArrayDestroyDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayDestroyDescriptor$MH = RuntimeHelper.downcallHandle(
        "SafeArrayDestroyDescriptor",
        constants$1179.SafeArrayDestroyDescriptor$FUNC
    );
    static final FunctionDescriptor SafeArrayReleaseData$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayReleaseData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayReleaseData",
        constants$1179.SafeArrayReleaseData$FUNC
    );
    static final FunctionDescriptor SafeArrayDestroyData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayDestroyData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayDestroyData",
        constants$1179.SafeArrayDestroyData$FUNC
    );
    static final FunctionDescriptor SafeArrayAddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayAddRef$MH = RuntimeHelper.downcallHandle(
        "SafeArrayAddRef",
        constants$1179.SafeArrayAddRef$FUNC
    );
    static final FunctionDescriptor SafeArrayDestroy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayDestroy$MH = RuntimeHelper.downcallHandle(
        "SafeArrayDestroy",
        constants$1179.SafeArrayDestroy$FUNC
    );
}


