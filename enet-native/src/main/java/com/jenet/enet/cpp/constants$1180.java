// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1180 {

    static final FunctionDescriptor SafeArrayRedim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayRedim$MH = RuntimeHelper.downcallHandle(
        "SafeArrayRedim",
        constants$1180.SafeArrayRedim$FUNC
    );
    static final FunctionDescriptor SafeArrayGetDim$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetDim$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetDim",
        constants$1180.SafeArrayGetDim$FUNC
    );
    static final FunctionDescriptor SafeArrayGetElemsize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetElemsize$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetElemsize",
        constants$1180.SafeArrayGetElemsize$FUNC
    );
    static final FunctionDescriptor SafeArrayGetUBound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetUBound$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetUBound",
        constants$1180.SafeArrayGetUBound$FUNC
    );
    static final FunctionDescriptor SafeArrayGetLBound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetLBound$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetLBound",
        constants$1180.SafeArrayGetLBound$FUNC
    );
    static final FunctionDescriptor SafeArrayLock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayLock$MH = RuntimeHelper.downcallHandle(
        "SafeArrayLock",
        constants$1180.SafeArrayLock$FUNC
    );
}

