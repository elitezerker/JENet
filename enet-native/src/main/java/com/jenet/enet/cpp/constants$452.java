// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$452 {

    static final FunctionDescriptor WINSTAENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WINSTAENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$452.WINSTAENUMPROC$FUNC
    );
    static final FunctionDescriptor DESKTOPENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DESKTOPENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$452.DESKTOPENUMPROC$FUNC
    );
    static final FunctionDescriptor wvsprintfA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wvsprintfA$MH = RuntimeHelper.downcallHandle(
        "wvsprintfA",
        constants$452.wvsprintfA$FUNC
    );
    static final FunctionDescriptor wvsprintfW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wvsprintfW$MH = RuntimeHelper.downcallHandle(
        "wvsprintfW",
        constants$452.wvsprintfW$FUNC
    );
    static final FunctionDescriptor wsprintfA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wsprintfA$MH = RuntimeHelper.downcallHandleVariadic(
        "wsprintfA",
        constants$452.wsprintfA$FUNC
    );
}


