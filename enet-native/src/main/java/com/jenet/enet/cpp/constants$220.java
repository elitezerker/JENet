// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$220 {

    static final FunctionDescriptor TlsGetValue$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TlsGetValue$MH = RuntimeHelper.downcallHandle(
        "TlsGetValue",
        constants$220.TlsGetValue$FUNC
    );
    static final FunctionDescriptor TlsSetValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TlsSetValue$MH = RuntimeHelper.downcallHandle(
        "TlsSetValue",
        constants$220.TlsSetValue$FUNC
    );
    static final FunctionDescriptor TlsFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TlsFree$MH = RuntimeHelper.downcallHandle(
        "TlsFree",
        constants$220.TlsFree$FUNC
    );
    static final FunctionDescriptor CreateProcessA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessA$MH = RuntimeHelper.downcallHandle(
        "CreateProcessA",
        constants$220.CreateProcessA$FUNC
    );
    static final FunctionDescriptor CreateProcessW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateProcessW$MH = RuntimeHelper.downcallHandle(
        "CreateProcessW",
        constants$220.CreateProcessW$FUNC
    );
    static final FunctionDescriptor SetProcessShutdownParameters$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessShutdownParameters$MH = RuntimeHelper.downcallHandle(
        "SetProcessShutdownParameters",
        constants$220.SetProcessShutdownParameters$FUNC
    );
}


