// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$855 {

    static final FunctionDescriptor RpcSsDestroyClientContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsDestroyClientContext$MH = RuntimeHelper.downcallHandle(
        "RpcSsDestroyClientContext",
        constants$855.RpcSsDestroyClientContext$FUNC
    );
    static final FunctionDescriptor EXPR_EVAL$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EXPR_EVAL$MH = RuntimeHelper.downcallHandle(
        constants$855.EXPR_EVAL$FUNC
    );
    static final FunctionDescriptor GENERIC_BINDING_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GENERIC_BINDING_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$855.GENERIC_BINDING_ROUTINE$FUNC
    );
    static final FunctionDescriptor GENERIC_UNBIND_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


