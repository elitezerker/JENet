// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$190 {

    static final FunctionDescriptor OutputDebugStringW$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OutputDebugStringW$MH = RuntimeHelper.downcallHandle(
        "OutputDebugStringW",
        constants$190.OutputDebugStringW$FUNC
    );
    static final FunctionDescriptor ContinueDebugEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ContinueDebugEvent$MH = RuntimeHelper.downcallHandle(
        "ContinueDebugEvent",
        constants$190.ContinueDebugEvent$FUNC
    );
    static final FunctionDescriptor WaitForDebugEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForDebugEvent$MH = RuntimeHelper.downcallHandle(
        "WaitForDebugEvent",
        constants$190.WaitForDebugEvent$FUNC
    );
    static final FunctionDescriptor DebugActiveProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DebugActiveProcess$MH = RuntimeHelper.downcallHandle(
        "DebugActiveProcess",
        constants$190.DebugActiveProcess$FUNC
    );
    static final FunctionDescriptor DebugActiveProcessStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DebugActiveProcessStop$MH = RuntimeHelper.downcallHandle(
        "DebugActiveProcessStop",
        constants$190.DebugActiveProcessStop$FUNC
    );
    static final FunctionDescriptor CheckRemoteDebuggerPresent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CheckRemoteDebuggerPresent$MH = RuntimeHelper.downcallHandle(
        "CheckRemoteDebuggerPresent",
        constants$190.CheckRemoteDebuggerPresent$FUNC
    );
}


