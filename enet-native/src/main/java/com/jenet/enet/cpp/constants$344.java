// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$344 {

    static final FunctionDescriptor CallNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "CallNamedPipeA",
        constants$344.CallNamedPipeA$FUNC
    );
    static final FunctionDescriptor WaitNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "WaitNamedPipeA",
        constants$344.WaitNamedPipeA$FUNC
    );
    static final FunctionDescriptor GetNamedPipeClientComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNamedPipeClientComputerNameA$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeClientComputerNameA",
        constants$344.GetNamedPipeClientComputerNameA$FUNC
    );
    static final FunctionDescriptor GetNamedPipeClientProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNamedPipeClientProcessId$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeClientProcessId",
        constants$344.GetNamedPipeClientProcessId$FUNC
    );
    static final FunctionDescriptor GetNamedPipeClientSessionId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNamedPipeClientSessionId$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeClientSessionId",
        constants$344.GetNamedPipeClientSessionId$FUNC
    );
    static final FunctionDescriptor GetNamedPipeServerProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNamedPipeServerProcessId$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeServerProcessId",
        constants$344.GetNamedPipeServerProcessId$FUNC
    );
}


