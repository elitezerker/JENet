// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$294 {

    static final FunctionDescriptor GlobalCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalCompact$MH = RuntimeHelper.downcallHandle(
        "GlobalCompact",
        constants$294.GlobalCompact$FUNC
    );
    static final FunctionDescriptor GlobalFix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFix$MH = RuntimeHelper.downcallHandle(
        "GlobalFix",
        constants$294.GlobalFix$FUNC
    );
    static final FunctionDescriptor GlobalUnfix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalUnfix$MH = RuntimeHelper.downcallHandle(
        "GlobalUnfix",
        constants$294.GlobalUnfix$FUNC
    );
    static final FunctionDescriptor GlobalWire$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalWire$MH = RuntimeHelper.downcallHandle(
        "GlobalWire",
        constants$294.GlobalWire$FUNC
    );
    static final FunctionDescriptor GlobalUnWire$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalUnWire$MH = RuntimeHelper.downcallHandle(
        "GlobalUnWire",
        constants$294.GlobalUnWire$FUNC
    );
    static final FunctionDescriptor GlobalMemoryStatus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalMemoryStatus$MH = RuntimeHelper.downcallHandle(
        "GlobalMemoryStatus",
        constants$294.GlobalMemoryStatus$FUNC
    );
}


