// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$774 {

    static final FunctionDescriptor BCryptHash$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptHash$MH = RuntimeHelper.downcallHandle(
        "BCryptHash",
        constants$774.BCryptHash$FUNC
    );
    static final FunctionDescriptor BCryptGenRandom$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptGenRandom$MH = RuntimeHelper.downcallHandle(
        "BCryptGenRandom",
        constants$774.BCryptGenRandom$FUNC
    );
    static final FunctionDescriptor BCryptDeriveKeyCapi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptDeriveKeyCapi$MH = RuntimeHelper.downcallHandle(
        "BCryptDeriveKeyCapi",
        constants$774.BCryptDeriveKeyCapi$FUNC
    );
    static final FunctionDescriptor BCryptDeriveKeyPBKDF2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BCryptDeriveKeyPBKDF2$MH = RuntimeHelper.downcallHandle(
        "BCryptDeriveKeyPBKDF2",
        constants$774.BCryptDeriveKeyPBKDF2$FUNC
    );
    static final FunctionDescriptor BCryptQueryProviderRegistration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptQueryProviderRegistration$MH = RuntimeHelper.downcallHandle(
        "BCryptQueryProviderRegistration",
        constants$774.BCryptQueryProviderRegistration$FUNC
    );
    static final FunctionDescriptor BCryptEnumRegisteredProviders$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BCryptEnumRegisteredProviders$MH = RuntimeHelper.downcallHandle(
        "BCryptEnumRegisteredProviders",
        constants$774.BCryptEnumRegisteredProviders$FUNC
    );
}


