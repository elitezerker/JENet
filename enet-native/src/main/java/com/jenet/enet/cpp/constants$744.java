// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$744 {

    static final FunctionDescriptor RpcAsyncInitializeHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcAsyncInitializeHandle$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncInitializeHandle",
        constants$744.RpcAsyncInitializeHandle$FUNC
    );
    static final FunctionDescriptor RpcAsyncGetCallStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcAsyncGetCallStatus$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncGetCallStatus",
        constants$744.RpcAsyncGetCallStatus$FUNC
    );
    static final FunctionDescriptor RpcAsyncCompleteCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcAsyncCompleteCall$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncCompleteCall",
        constants$744.RpcAsyncCompleteCall$FUNC
    );
    static final FunctionDescriptor RpcAsyncAbortCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcAsyncAbortCall$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncAbortCall",
        constants$744.RpcAsyncAbortCall$FUNC
    );
    static final FunctionDescriptor RpcAsyncCancelCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcAsyncCancelCall$MH = RuntimeHelper.downcallHandle(
        "RpcAsyncCancelCall",
        constants$744.RpcAsyncCancelCall$FUNC
    );
    static final FunctionDescriptor RpcErrorStartEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorStartEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorStartEnumeration",
        constants$744.RpcErrorStartEnumeration$FUNC
    );
}


