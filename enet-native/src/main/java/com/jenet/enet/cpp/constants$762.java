// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$762 {

    static final FunctionDescriptor PM_QUERY_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_QUERY_PROC$MH = RuntimeHelper.downcallHandle(
        constants$762.PM_QUERY_PROC$FUNC
    );
    static final FunctionDescriptor CryptAcquireContextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptAcquireContextA$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireContextA",
        constants$762.CryptAcquireContextA$FUNC
    );
    static final FunctionDescriptor CryptAcquireContextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptAcquireContextW$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireContextW",
        constants$762.CryptAcquireContextW$FUNC
    );
    static final FunctionDescriptor CryptReleaseContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptReleaseContext$MH = RuntimeHelper.downcallHandle(
        "CryptReleaseContext",
        constants$762.CryptReleaseContext$FUNC
    );
    static final FunctionDescriptor CryptGenKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGenKey$MH = RuntimeHelper.downcallHandle(
        "CryptGenKey",
        constants$762.CryptGenKey$FUNC
    );
}

