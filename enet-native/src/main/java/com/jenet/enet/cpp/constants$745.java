// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$745 {

    static final FunctionDescriptor RpcErrorGetNextRecord$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorGetNextRecord$MH = RuntimeHelper.downcallHandle(
        "RpcErrorGetNextRecord",
        constants$745.RpcErrorGetNextRecord$FUNC
    );
    static final FunctionDescriptor RpcErrorEndEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorEndEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorEndEnumeration",
        constants$745.RpcErrorEndEnumeration$FUNC
    );
    static final FunctionDescriptor RpcErrorResetEnumeration$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorResetEnumeration$MH = RuntimeHelper.downcallHandle(
        "RpcErrorResetEnumeration",
        constants$745.RpcErrorResetEnumeration$FUNC
    );
    static final FunctionDescriptor RpcErrorGetNumberOfRecords$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorGetNumberOfRecords$MH = RuntimeHelper.downcallHandle(
        "RpcErrorGetNumberOfRecords",
        constants$745.RpcErrorGetNumberOfRecords$FUNC
    );
    static final FunctionDescriptor RpcErrorSaveErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorSaveErrorInfo$MH = RuntimeHelper.downcallHandle(
        "RpcErrorSaveErrorInfo",
        constants$745.RpcErrorSaveErrorInfo$FUNC
    );
    static final FunctionDescriptor RpcErrorLoadErrorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcErrorLoadErrorInfo$MH = RuntimeHelper.downcallHandle(
        "RpcErrorLoadErrorInfo",
        constants$745.RpcErrorLoadErrorInfo$FUNC
    );
}

