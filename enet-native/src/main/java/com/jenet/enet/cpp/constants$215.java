// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$215 {

    static final FunctionDescriptor CreateWaitableTimerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerW$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerW",
        constants$215.CreateWaitableTimerW$FUNC
    );
    static final FunctionDescriptor InitializeSListHead$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeSListHead$MH = RuntimeHelper.downcallHandle(
        "InitializeSListHead",
        constants$215.InitializeSListHead$FUNC
    );
    static final FunctionDescriptor InterlockedPopEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPopEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPopEntrySList",
        constants$215.InterlockedPopEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPushEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushEntrySList",
        constants$215.InterlockedPushEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushListSListEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InterlockedPushListSListEx$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushListSListEx",
        constants$215.InterlockedPushListSListEx$FUNC
    );
    static final FunctionDescriptor InterlockedFlushSList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedFlushSList$MH = RuntimeHelper.downcallHandle(
        "InterlockedFlushSList",
        constants$215.InterlockedFlushSList$FUNC
    );
}


