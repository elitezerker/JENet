// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$253 {

    static final FunctionDescriptor CloseThreadpoolCleanupGroupMembers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolCleanupGroupMembers$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolCleanupGroupMembers",
        constants$253.CloseThreadpoolCleanupGroupMembers$FUNC
    );
    static final FunctionDescriptor CloseThreadpoolCleanupGroup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolCleanupGroup$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolCleanupGroup",
        constants$253.CloseThreadpoolCleanupGroup$FUNC
    );
    static final FunctionDescriptor SetEventWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEventWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "SetEventWhenCallbackReturns",
        constants$253.SetEventWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor ReleaseSemaphoreWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReleaseSemaphoreWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "ReleaseSemaphoreWhenCallbackReturns",
        constants$253.ReleaseSemaphoreWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor ReleaseMutexWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReleaseMutexWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "ReleaseMutexWhenCallbackReturns",
        constants$253.ReleaseMutexWhenCallbackReturns$FUNC
    );
    static final FunctionDescriptor LeaveCriticalSectionWhenCallbackReturns$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LeaveCriticalSectionWhenCallbackReturns$MH = RuntimeHelper.downcallHandle(
        "LeaveCriticalSectionWhenCallbackReturns",
        constants$253.LeaveCriticalSectionWhenCallbackReturns$FUNC
    );
}

