// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$781 {

    static final FunctionDescriptor NCryptExportKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptExportKey$MH = RuntimeHelper.downcallHandle(
        "NCryptExportKey",
        constants$781.NCryptExportKey$FUNC
    );
    static final FunctionDescriptor NCryptSignHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptSignHash$MH = RuntimeHelper.downcallHandle(
        "NCryptSignHash",
        constants$781.NCryptSignHash$FUNC
    );
    static final FunctionDescriptor NCryptVerifySignature$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptVerifySignature$MH = RuntimeHelper.downcallHandle(
        "NCryptVerifySignature",
        constants$781.NCryptVerifySignature$FUNC
    );
    static final FunctionDescriptor NCryptDeleteKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NCryptDeleteKey$MH = RuntimeHelper.downcallHandle(
        "NCryptDeleteKey",
        constants$781.NCryptDeleteKey$FUNC
    );
    static final FunctionDescriptor NCryptFreeObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NCryptFreeObject$MH = RuntimeHelper.downcallHandle(
        "NCryptFreeObject",
        constants$781.NCryptFreeObject$FUNC
    );
    static final FunctionDescriptor NCryptIsKeyHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NCryptIsKeyHandle$MH = RuntimeHelper.downcallHandle(
        "NCryptIsKeyHandle",
        constants$781.NCryptIsKeyHandle$FUNC
    );
}


