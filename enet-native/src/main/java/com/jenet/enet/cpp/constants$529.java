// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$529 {

    static final FunctionDescriptor ShowCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowCursor$MH = RuntimeHelper.downcallHandle(
        "ShowCursor",
        constants$529.ShowCursor$FUNC
    );
    static final FunctionDescriptor SetCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCursorPos$MH = RuntimeHelper.downcallHandle(
        "SetCursorPos",
        constants$529.SetCursorPos$FUNC
    );
    static final FunctionDescriptor SetPhysicalCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPhysicalCursorPos$MH = RuntimeHelper.downcallHandle(
        "SetPhysicalCursorPos",
        constants$529.SetPhysicalCursorPos$FUNC
    );
    static final FunctionDescriptor SetCursor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCursor$MH = RuntimeHelper.downcallHandle(
        "SetCursor",
        constants$529.SetCursor$FUNC
    );
    static final FunctionDescriptor GetCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCursorPos$MH = RuntimeHelper.downcallHandle(
        "GetCursorPos",
        constants$529.GetCursorPos$FUNC
    );
    static final FunctionDescriptor GetPhysicalCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPhysicalCursorPos$MH = RuntimeHelper.downcallHandle(
        "GetPhysicalCursorPos",
        constants$529.GetPhysicalCursorPos$FUNC
    );
}

