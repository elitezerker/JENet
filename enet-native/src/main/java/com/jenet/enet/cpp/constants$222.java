// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$222 {

    static final FunctionDescriptor SetThreadToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadToken$MH = RuntimeHelper.downcallHandle(
        "SetThreadToken",
        constants$222.SetThreadToken$FUNC
    );
    static final FunctionDescriptor OpenProcessToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenProcessToken$MH = RuntimeHelper.downcallHandle(
        "OpenProcessToken",
        constants$222.OpenProcessToken$FUNC
    );
    static final FunctionDescriptor OpenThreadToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenThreadToken$MH = RuntimeHelper.downcallHandle(
        "OpenThreadToken",
        constants$222.OpenThreadToken$FUNC
    );
    static final FunctionDescriptor SetPriorityClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPriorityClass$MH = RuntimeHelper.downcallHandle(
        "SetPriorityClass",
        constants$222.SetPriorityClass$FUNC
    );
    static final FunctionDescriptor GetPriorityClass$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPriorityClass$MH = RuntimeHelper.downcallHandle(
        "GetPriorityClass",
        constants$222.GetPriorityClass$FUNC
    );
    static final FunctionDescriptor SetThreadStackGuarantee$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadStackGuarantee$MH = RuntimeHelper.downcallHandle(
        "SetThreadStackGuarantee",
        constants$222.SetThreadStackGuarantee$FUNC
    );
}

