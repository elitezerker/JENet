// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$428 {

    static final FunctionDescriptor EndPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndPath$MH = RuntimeHelper.downcallHandle(
        "EndPath",
        constants$428.EndPath$FUNC
    );
    static final FunctionDescriptor FillPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FillPath$MH = RuntimeHelper.downcallHandle(
        "FillPath",
        constants$428.FillPath$FUNC
    );
    static final FunctionDescriptor FlattenPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FlattenPath$MH = RuntimeHelper.downcallHandle(
        "FlattenPath",
        constants$428.FlattenPath$FUNC
    );
    static final FunctionDescriptor GetPath$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetPath$MH = RuntimeHelper.downcallHandle(
        "GetPath",
        constants$428.GetPath$FUNC
    );
    static final FunctionDescriptor PathToRegion$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PathToRegion$MH = RuntimeHelper.downcallHandle(
        "PathToRegion",
        constants$428.PathToRegion$FUNC
    );
    static final FunctionDescriptor PolyDraw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PolyDraw$MH = RuntimeHelper.downcallHandle(
        "PolyDraw",
        constants$428.PolyDraw$FUNC
    );
}


