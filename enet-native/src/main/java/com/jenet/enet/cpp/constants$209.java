// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$209 {

    static final FunctionDescriptor ReleaseSemaphore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseSemaphore$MH = RuntimeHelper.downcallHandle(
        "ReleaseSemaphore",
        constants$209.ReleaseSemaphore$FUNC
    );
    static final FunctionDescriptor ReleaseMutex$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMutex$MH = RuntimeHelper.downcallHandle(
        "ReleaseMutex",
        constants$209.ReleaseMutex$FUNC
    );
    static final FunctionDescriptor WaitForSingleObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForSingleObject$MH = RuntimeHelper.downcallHandle(
        "WaitForSingleObject",
        constants$209.WaitForSingleObject$FUNC
    );
    static final FunctionDescriptor SleepEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SleepEx$MH = RuntimeHelper.downcallHandle(
        "SleepEx",
        constants$209.SleepEx$FUNC
    );
    static final FunctionDescriptor WaitForSingleObjectEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForSingleObjectEx$MH = RuntimeHelper.downcallHandle(
        "WaitForSingleObjectEx",
        constants$209.WaitForSingleObjectEx$FUNC
    );
    static final FunctionDescriptor WaitForMultipleObjectsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForMultipleObjectsEx$MH = RuntimeHelper.downcallHandle(
        "WaitForMultipleObjectsEx",
        constants$209.WaitForMultipleObjectsEx$FUNC
    );
}


