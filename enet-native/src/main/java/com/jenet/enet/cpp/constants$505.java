// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$505 {

    static final FunctionDescriptor LoadAcceleratorsA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadAcceleratorsA$MH = RuntimeHelper.downcallHandle(
        "LoadAcceleratorsA",
        constants$505.LoadAcceleratorsA$FUNC
    );
    static final FunctionDescriptor LoadAcceleratorsW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadAcceleratorsW$MH = RuntimeHelper.downcallHandle(
        "LoadAcceleratorsW",
        constants$505.LoadAcceleratorsW$FUNC
    );
    static final FunctionDescriptor CreateAcceleratorTableA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateAcceleratorTableA$MH = RuntimeHelper.downcallHandle(
        "CreateAcceleratorTableA",
        constants$505.CreateAcceleratorTableA$FUNC
    );
    static final FunctionDescriptor CreateAcceleratorTableW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateAcceleratorTableW$MH = RuntimeHelper.downcallHandle(
        "CreateAcceleratorTableW",
        constants$505.CreateAcceleratorTableW$FUNC
    );
    static final FunctionDescriptor DestroyAcceleratorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyAcceleratorTable$MH = RuntimeHelper.downcallHandle(
        "DestroyAcceleratorTable",
        constants$505.DestroyAcceleratorTable$FUNC
    );
    static final FunctionDescriptor CopyAcceleratorTableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyAcceleratorTableA$MH = RuntimeHelper.downcallHandle(
        "CopyAcceleratorTableA",
        constants$505.CopyAcceleratorTableA$FUNC
    );
}

