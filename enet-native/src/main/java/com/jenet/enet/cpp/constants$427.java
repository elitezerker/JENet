// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$427 {

    static final FunctionDescriptor AbortDoc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AbortDoc$MH = RuntimeHelper.downcallHandle(
        "AbortDoc",
        constants$427.AbortDoc$FUNC
    );
    static final FunctionDescriptor SetAbortProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetAbortProc$MH = RuntimeHelper.downcallHandle(
        "SetAbortProc",
        constants$427.SetAbortProc$FUNC
    );
    static final FunctionDescriptor AbortPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AbortPath$MH = RuntimeHelper.downcallHandle(
        "AbortPath",
        constants$427.AbortPath$FUNC
    );
    static final FunctionDescriptor ArcTo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ArcTo$MH = RuntimeHelper.downcallHandle(
        "ArcTo",
        constants$427.ArcTo$FUNC
    );
    static final FunctionDescriptor BeginPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BeginPath$MH = RuntimeHelper.downcallHandle(
        "BeginPath",
        constants$427.BeginPath$FUNC
    );
    static final FunctionDescriptor CloseFigure$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseFigure$MH = RuntimeHelper.downcallHandle(
        "CloseFigure",
        constants$427.CloseFigure$FUNC
    );
}


