// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1176 {

    static final FunctionDescriptor SysAllocStringLen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SysAllocStringLen$MH = RuntimeHelper.downcallHandle(
        "SysAllocStringLen",
        constants$1176.SysAllocStringLen$FUNC
    );
    static final FunctionDescriptor SysReAllocStringLen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SysReAllocStringLen$MH = RuntimeHelper.downcallHandle(
        "SysReAllocStringLen",
        constants$1176.SysReAllocStringLen$FUNC
    );
    static final FunctionDescriptor SysAddRefString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysAddRefString$MH = RuntimeHelper.downcallHandle(
        "SysAddRefString",
        constants$1176.SysAddRefString$FUNC
    );
    static final FunctionDescriptor SysReleaseString$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysReleaseString$MH = RuntimeHelper.downcallHandle(
        "SysReleaseString",
        constants$1176.SysReleaseString$FUNC
    );
    static final FunctionDescriptor SysFreeString$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysFreeString$MH = RuntimeHelper.downcallHandle(
        "SysFreeString",
        constants$1176.SysFreeString$FUNC
    );
    static final FunctionDescriptor SysStringLen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysStringLen$MH = RuntimeHelper.downcallHandle(
        "SysStringLen",
        constants$1176.SysStringLen$FUNC
    );
}


