// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$705 {

    static final FunctionDescriptor RPC_AUTH_KEY_RETRIEVAL_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_AUTH_KEY_RETRIEVAL_FN$MH = RuntimeHelper.downcallHandle(
        constants$705.RPC_AUTH_KEY_RETRIEVAL_FN$FUNC
    );
    static final FunctionDescriptor RpcServerCompleteSecurityCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerCompleteSecurityCallback$MH = RuntimeHelper.downcallHandle(
        "RpcServerCompleteSecurityCallback",
        constants$705.RpcServerCompleteSecurityCallback$FUNC
    );
    static final FunctionDescriptor RpcServerRegisterAuthInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerRegisterAuthInfoA$MH = RuntimeHelper.downcallHandle(
        "RpcServerRegisterAuthInfoA",
        constants$705.RpcServerRegisterAuthInfoA$FUNC
    );
    static final FunctionDescriptor RpcServerRegisterAuthInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerRegisterAuthInfoW$MH = RuntimeHelper.downcallHandle(
        "RpcServerRegisterAuthInfoW",
        constants$705.RpcServerRegisterAuthInfoW$FUNC
    );
    static final FunctionDescriptor RpcBindingServerFromClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingServerFromClient$MH = RuntimeHelper.downcallHandle(
        "RpcBindingServerFromClient",
        constants$705.RpcBindingServerFromClient$FUNC
    );
}


