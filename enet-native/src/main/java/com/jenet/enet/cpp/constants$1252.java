// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1252 {

    static final FunctionDescriptor LPPRINTHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPPRINTHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1252.LPPRINTHOOKPROC$FUNC
    );
    static final FunctionDescriptor LPSETUPHOOKPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPSETUPHOOKPROC$MH = RuntimeHelper.downcallHandle(
        constants$1252.LPSETUPHOOKPROC$FUNC
    );
    static final FunctionDescriptor PrintDlgA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrintDlgA$MH = RuntimeHelper.downcallHandle(
        "PrintDlgA",
        constants$1252.PrintDlgA$FUNC
    );
    static final FunctionDescriptor PrintDlgW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrintDlgW$MH = RuntimeHelper.downcallHandle(
        "PrintDlgW",
        constants$1252.PrintDlgW$FUNC
    );
    static final FunctionDescriptor PrintDlgExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrintDlgExA$MH = RuntimeHelper.downcallHandle(
        "PrintDlgExA",
        constants$1252.PrintDlgExA$FUNC
    );
}


