// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$811 {

    static final FunctionDescriptor CertCreateCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertCreateCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertCreateCTLContext",
        constants$811.CertCreateCTLContext$FUNC
    );
    static final FunctionDescriptor CertFreeCTLContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCTLContext$MH = RuntimeHelper.downcallHandle(
        "CertFreeCTLContext",
        constants$811.CertFreeCTLContext$FUNC
    );
    static final FunctionDescriptor CertSetCTLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetCTLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertSetCTLContextProperty",
        constants$811.CertSetCTLContextProperty$FUNC
    );
    static final FunctionDescriptor CertGetCTLContextProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCTLContextProperty$MH = RuntimeHelper.downcallHandle(
        "CertGetCTLContextProperty",
        constants$811.CertGetCTLContextProperty$FUNC
    );
    static final FunctionDescriptor CertEnumCTLContextProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertEnumCTLContextProperties$MH = RuntimeHelper.downcallHandle(
        "CertEnumCTLContextProperties",
        constants$811.CertEnumCTLContextProperties$FUNC
    );
    static final FunctionDescriptor CertEnumCTLsInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumCTLsInStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumCTLsInStore",
        constants$811.CertEnumCTLsInStore$FUNC
    );
}


