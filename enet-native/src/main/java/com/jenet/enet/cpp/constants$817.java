// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$817 {

    static final FunctionDescriptor CertGetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        "CertGetEnhancedKeyUsage",
        constants$817.CertGetEnhancedKeyUsage$FUNC
    );
    static final FunctionDescriptor CertSetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        "CertSetEnhancedKeyUsage",
        constants$817.CertSetEnhancedKeyUsage$FUNC
    );
    static final FunctionDescriptor CertAddEnhancedKeyUsageIdentifier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertAddEnhancedKeyUsageIdentifier$MH = RuntimeHelper.downcallHandle(
        "CertAddEnhancedKeyUsageIdentifier",
        constants$817.CertAddEnhancedKeyUsageIdentifier$FUNC
    );
    static final FunctionDescriptor CertRemoveEnhancedKeyUsageIdentifier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertRemoveEnhancedKeyUsageIdentifier$MH = RuntimeHelper.downcallHandle(
        "CertRemoveEnhancedKeyUsageIdentifier",
        constants$817.CertRemoveEnhancedKeyUsageIdentifier$FUNC
    );
    static final FunctionDescriptor CertGetValidUsages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetValidUsages$MH = RuntimeHelper.downcallHandle(
        "CertGetValidUsages",
        constants$817.CertGetValidUsages$FUNC
    );
    static final FunctionDescriptor CryptMsgGetAndVerifySigner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptMsgGetAndVerifySigner$MH = RuntimeHelper.downcallHandle(
        "CryptMsgGetAndVerifySigner",
        constants$817.CryptMsgGetAndVerifySigner$FUNC
    );
}


