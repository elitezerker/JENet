// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$372 {

    static final FunctionDescriptor GetActiveProcessorCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetActiveProcessorCount$MH = RuntimeHelper.downcallHandle(
        "GetActiveProcessorCount",
        constants$372.GetActiveProcessorCount$FUNC
    );
    static final FunctionDescriptor GetMaximumProcessorCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle GetMaximumProcessorCount$MH = RuntimeHelper.downcallHandle(
        "GetMaximumProcessorCount",
        constants$372.GetMaximumProcessorCount$FUNC
    );
    static final FunctionDescriptor GetNumaProcessorNode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProcessorNode$MH = RuntimeHelper.downcallHandle(
        "GetNumaProcessorNode",
        constants$372.GetNumaProcessorNode$FUNC
    );
    static final FunctionDescriptor GetNumaNodeNumberFromHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaNodeNumberFromHandle$MH = RuntimeHelper.downcallHandle(
        "GetNumaNodeNumberFromHandle",
        constants$372.GetNumaNodeNumberFromHandle$FUNC
    );
    static final FunctionDescriptor GetNumaProcessorNodeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProcessorNodeEx$MH = RuntimeHelper.downcallHandle(
        "GetNumaProcessorNodeEx",
        constants$372.GetNumaProcessorNodeEx$FUNC
    );
    static final FunctionDescriptor GetNumaNodeProcessorMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaNodeProcessorMask$MH = RuntimeHelper.downcallHandle(
        "GetNumaNodeProcessorMask",
        constants$372.GetNumaNodeProcessorMask$FUNC
    );
}


