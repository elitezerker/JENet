// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$198 {

    static final FunctionDescriptor SetNamedPipeHandleState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetNamedPipeHandleState$MH = RuntimeHelper.downcallHandle(
        "SetNamedPipeHandleState",
        constants$198.SetNamedPipeHandleState$FUNC
    );
    static final FunctionDescriptor PeekNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PeekNamedPipe$MH = RuntimeHelper.downcallHandle(
        "PeekNamedPipe",
        constants$198.PeekNamedPipe$FUNC
    );
    static final FunctionDescriptor TransactNamedPipe$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TransactNamedPipe$MH = RuntimeHelper.downcallHandle(
        "TransactNamedPipe",
        constants$198.TransactNamedPipe$FUNC
    );
    static final FunctionDescriptor CreateNamedPipeW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateNamedPipeW$MH = RuntimeHelper.downcallHandle(
        "CreateNamedPipeW",
        constants$198.CreateNamedPipeW$FUNC
    );
    static final FunctionDescriptor WaitNamedPipeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitNamedPipeW$MH = RuntimeHelper.downcallHandle(
        "WaitNamedPipeW",
        constants$198.WaitNamedPipeW$FUNC
    );
    static final FunctionDescriptor GetNamedPipeClientComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNamedPipeClientComputerNameW$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeClientComputerNameW",
        constants$198.GetNamedPipeClientComputerNameW$FUNC
    );
}


