// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$228 {

    static final FunctionDescriptor GetSystemTimes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimes$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimes",
        constants$228.GetSystemTimes$FUNC
    );
    static final FunctionDescriptor GetThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetThreadInformation$MH = RuntimeHelper.downcallHandle(
        "GetThreadInformation",
        constants$228.GetThreadInformation$FUNC
    );
    static final FunctionDescriptor SetThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadInformation$MH = RuntimeHelper.downcallHandle(
        "SetThreadInformation",
        constants$228.SetThreadInformation$FUNC
    );
    static final FunctionDescriptor IsProcessCritical$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsProcessCritical$MH = RuntimeHelper.downcallHandle(
        "IsProcessCritical",
        constants$228.IsProcessCritical$FUNC
    );
    static final FunctionDescriptor SetProtectedPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProtectedPolicy$MH = RuntimeHelper.downcallHandle(
        "SetProtectedPolicy",
        constants$228.SetProtectedPolicy$FUNC
    );
    static final FunctionDescriptor QueryProtectedPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProtectedPolicy$MH = RuntimeHelper.downcallHandle(
        "QueryProtectedPolicy",
        constants$228.QueryProtectedPolicy$FUNC
    );
}

