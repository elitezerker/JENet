// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1181 {

    static final FunctionDescriptor SafeArrayUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayUnlock$MH = RuntimeHelper.downcallHandle(
        "SafeArrayUnlock",
        constants$1181.SafeArrayUnlock$FUNC
    );
    static final FunctionDescriptor SafeArrayAccessData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayAccessData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayAccessData",
        constants$1181.SafeArrayAccessData$FUNC
    );
    static final FunctionDescriptor SafeArrayUnaccessData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayUnaccessData$MH = RuntimeHelper.downcallHandle(
        "SafeArrayUnaccessData",
        constants$1181.SafeArrayUnaccessData$FUNC
    );
    static final FunctionDescriptor SafeArrayGetElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayGetElement$MH = RuntimeHelper.downcallHandle(
        "SafeArrayGetElement",
        constants$1181.SafeArrayGetElement$FUNC
    );
    static final FunctionDescriptor SafeArrayPutElement$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayPutElement$MH = RuntimeHelper.downcallHandle(
        "SafeArrayPutElement",
        constants$1181.SafeArrayPutElement$FUNC
    );
    static final FunctionDescriptor SafeArrayCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SafeArrayCopy$MH = RuntimeHelper.downcallHandle(
        "SafeArrayCopy",
        constants$1181.SafeArrayCopy$FUNC
    );
}

