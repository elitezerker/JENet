// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$371 {

    static final FunctionDescriptor PQUERYACTCTXW_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PQUERYACTCTXW_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$371.PQUERYACTCTXW_FUNC$FUNC
    );
    static final FunctionDescriptor WTSGetActiveConsoleSessionId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WTSGetActiveConsoleSessionId$MH = RuntimeHelper.downcallHandle(
        "WTSGetActiveConsoleSessionId",
        constants$371.WTSGetActiveConsoleSessionId$FUNC
    );
    static final FunctionDescriptor WTSGetServiceSessionId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle WTSGetServiceSessionId$MH = RuntimeHelper.downcallHandle(
        "WTSGetServiceSessionId",
        constants$371.WTSGetServiceSessionId$FUNC
    );
    static final FunctionDescriptor WTSIsServerContainer$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT);
    static final MethodHandle WTSIsServerContainer$MH = RuntimeHelper.downcallHandle(
        "WTSIsServerContainer",
        constants$371.WTSIsServerContainer$FUNC
    );
    static final FunctionDescriptor GetActiveProcessorGroupCount$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetActiveProcessorGroupCount$MH = RuntimeHelper.downcallHandle(
        "GetActiveProcessorGroupCount",
        constants$371.GetActiveProcessorGroupCount$FUNC
    );
    static final FunctionDescriptor GetMaximumProcessorGroupCount$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetMaximumProcessorGroupCount$MH = RuntimeHelper.downcallHandle(
        "GetMaximumProcessorGroupCount",
        constants$371.GetMaximumProcessorGroupCount$FUNC
    );
}

