// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$730 {

    static final FunctionDescriptor I_RpcFreeCalloutStateFn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcFreeCalloutStateFn$MH = RuntimeHelper.downcallHandle(
        constants$730.I_RpcFreeCalloutStateFn$FUNC
    );
    static final FunctionDescriptor I_RpcProxyGetClientSessionAndResourceUUID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcProxyGetClientSessionAndResourceUUID$MH = RuntimeHelper.downcallHandle(
        constants$730.I_RpcProxyGetClientSessionAndResourceUUID$FUNC
    );
    static final FunctionDescriptor I_RpcProxyFilterIfFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcProxyFilterIfFn$MH = RuntimeHelper.downcallHandle(
        constants$730.I_RpcProxyFilterIfFn$FUNC
    );
}


