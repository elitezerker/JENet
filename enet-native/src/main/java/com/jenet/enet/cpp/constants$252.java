// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$252 {

    static final FunctionDescriptor SetThreadpoolThreadMaximum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolThreadMaximum$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolThreadMaximum",
        constants$252.SetThreadpoolThreadMaximum$FUNC
    );
    static final FunctionDescriptor SetThreadpoolThreadMinimum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolThreadMinimum$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolThreadMinimum",
        constants$252.SetThreadpoolThreadMinimum$FUNC
    );
    static final FunctionDescriptor SetThreadpoolStackInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolStackInformation$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolStackInformation",
        constants$252.SetThreadpoolStackInformation$FUNC
    );
    static final FunctionDescriptor QueryThreadpoolStackInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadpoolStackInformation$MH = RuntimeHelper.downcallHandle(
        "QueryThreadpoolStackInformation",
        constants$252.QueryThreadpoolStackInformation$FUNC
    );
    static final FunctionDescriptor CloseThreadpool$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpool$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpool",
        constants$252.CloseThreadpool$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolCleanupGroup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreateThreadpoolCleanupGroup$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolCleanupGroup",
        constants$252.CreateThreadpoolCleanupGroup$FUNC
    );
}

