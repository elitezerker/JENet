// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$892 {

    static final FunctionDescriptor NdrRpcSsDisableAllocate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrRpcSsDisableAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrRpcSsDisableAllocate",
        constants$892.NdrRpcSsDisableAllocate$FUNC
    );
    static final FunctionDescriptor NdrRpcSmSetClientToOsf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrRpcSmSetClientToOsf$MH = RuntimeHelper.downcallHandle(
        "NdrRpcSmSetClientToOsf",
        constants$892.NdrRpcSmSetClientToOsf$FUNC
    );
    static final FunctionDescriptor NdrRpcSmClientAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NdrRpcSmClientAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrRpcSmClientAllocate",
        constants$892.NdrRpcSmClientAllocate$FUNC
    );
    static final FunctionDescriptor NdrRpcSmClientFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrRpcSmClientFree$MH = RuntimeHelper.downcallHandle(
        "NdrRpcSmClientFree",
        constants$892.NdrRpcSmClientFree$FUNC
    );
    static final FunctionDescriptor NdrRpcSsDefaultAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NdrRpcSsDefaultAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrRpcSsDefaultAllocate",
        constants$892.NdrRpcSsDefaultAllocate$FUNC
    );
    static final FunctionDescriptor NdrRpcSsDefaultFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrRpcSsDefaultFree$MH = RuntimeHelper.downcallHandle(
        "NdrRpcSsDefaultFree",
        constants$892.NdrRpcSsDefaultFree$FUNC
    );
}


