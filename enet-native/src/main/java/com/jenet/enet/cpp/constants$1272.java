// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1272 {

    static final FunctionDescriptor GetServiceDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceDirectory$MH = RuntimeHelper.downcallHandle(
        "GetServiceDirectory",
        constants$1272.GetServiceDirectory$FUNC
    );
    static final FunctionDescriptor IMCENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle IMCENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$1272.IMCENUMPROC$FUNC
    );
    static final FunctionDescriptor ImmInstallIMEA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmInstallIMEA$MH = RuntimeHelper.downcallHandle(
        "ImmInstallIMEA",
        constants$1272.ImmInstallIMEA$FUNC
    );
    static final FunctionDescriptor ImmInstallIMEW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmInstallIMEW$MH = RuntimeHelper.downcallHandle(
        "ImmInstallIMEW",
        constants$1272.ImmInstallIMEW$FUNC
    );
    static final FunctionDescriptor ImmGetDefaultIMEWnd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImmGetDefaultIMEWnd$MH = RuntimeHelper.downcallHandle(
        "ImmGetDefaultIMEWnd",
        constants$1272.ImmGetDefaultIMEWnd$FUNC
    );
}

