// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$463 {

    static final FunctionDescriptor SwapMouseButton$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SwapMouseButton$MH = RuntimeHelper.downcallHandle(
        "SwapMouseButton",
        constants$463.SwapMouseButton$FUNC
    );
    static final FunctionDescriptor GetMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetMessagePos",
        constants$463.GetMessagePos$FUNC
    );
    static final FunctionDescriptor GetMessageTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessageTime$MH = RuntimeHelper.downcallHandle(
        "GetMessageTime",
        constants$463.GetMessageTime$FUNC
    );
    static final FunctionDescriptor GetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "GetMessageExtraInfo",
        constants$463.GetMessageExtraInfo$FUNC
    );
    static final FunctionDescriptor GetUnpredictedMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetUnpredictedMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetUnpredictedMessagePos",
        constants$463.GetUnpredictedMessagePos$FUNC
    );
    static final FunctionDescriptor IsWow64Message$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsWow64Message$MH = RuntimeHelper.downcallHandle(
        "IsWow64Message",
        constants$463.IsWow64Message$FUNC
    );
}

