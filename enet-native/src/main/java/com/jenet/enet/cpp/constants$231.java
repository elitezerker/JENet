// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$231 {

    static final FunctionDescriptor GlobalMemoryStatusEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalMemoryStatusEx$MH = RuntimeHelper.downcallHandle(
        "GlobalMemoryStatusEx",
        constants$231.GlobalMemoryStatusEx$FUNC
    );
    static final FunctionDescriptor GetSystemInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemInfo$MH = RuntimeHelper.downcallHandle(
        "GetSystemInfo",
        constants$231.GetSystemInfo$FUNC
    );
    static final FunctionDescriptor GetSystemTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTime$MH = RuntimeHelper.downcallHandle(
        "GetSystemTime",
        constants$231.GetSystemTime$FUNC
    );
    static final FunctionDescriptor GetSystemTimeAsFileTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimeAsFileTime$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimeAsFileTime",
        constants$231.GetSystemTimeAsFileTime$FUNC
    );
    static final FunctionDescriptor GetLocalTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLocalTime$MH = RuntimeHelper.downcallHandle(
        "GetLocalTime",
        constants$231.GetLocalTime$FUNC
    );
    static final FunctionDescriptor IsUserCetAvailableInEnvironment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsUserCetAvailableInEnvironment$MH = RuntimeHelper.downcallHandle(
        "IsUserCetAvailableInEnvironment",
        constants$231.IsUserCetAvailableInEnvironment$FUNC
    );
}

