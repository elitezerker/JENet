// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$846 {

    static final FunctionDescriptor PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZE$MH = RuntimeHelper.downcallHandle(
        constants$846.PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_INITIALIZE$FUNC
    );
    static final FunctionDescriptor CertIsWeakHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertIsWeakHash$MH = RuntimeHelper.downcallHandle(
        "CertIsWeakHash",
        constants$846.CertIsWeakHash$FUNC
    );
    static final FunctionDescriptor PFN_CERT_IS_WEAK_HASH$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_IS_WEAK_HASH$MH = RuntimeHelper.downcallHandle(
        constants$846.PFN_CERT_IS_WEAK_HASH$FUNC
    );
    static final FunctionDescriptor CryptProtectData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptProtectData$MH = RuntimeHelper.downcallHandle(
        "CryptProtectData",
        constants$846.CryptProtectData$FUNC
    );
    static final FunctionDescriptor CryptUnprotectData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUnprotectData$MH = RuntimeHelper.downcallHandle(
        "CryptUnprotectData",
        constants$846.CryptUnprotectData$FUNC
    );
}


