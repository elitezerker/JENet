// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$438 {

    static final FunctionDescriptor GetLogColorSpaceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLogColorSpaceW$MH = RuntimeHelper.downcallHandle(
        "GetLogColorSpaceW",
        constants$438.GetLogColorSpaceW$FUNC
    );
    static final FunctionDescriptor CreateColorSpaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateColorSpaceA$MH = RuntimeHelper.downcallHandle(
        "CreateColorSpaceA",
        constants$438.CreateColorSpaceA$FUNC
    );
    static final FunctionDescriptor CreateColorSpaceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateColorSpaceW$MH = RuntimeHelper.downcallHandle(
        "CreateColorSpaceW",
        constants$438.CreateColorSpaceW$FUNC
    );
    static final FunctionDescriptor SetColorSpace$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetColorSpace$MH = RuntimeHelper.downcallHandle(
        "SetColorSpace",
        constants$438.SetColorSpace$FUNC
    );
    static final FunctionDescriptor DeleteColorSpace$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteColorSpace$MH = RuntimeHelper.downcallHandle(
        "DeleteColorSpace",
        constants$438.DeleteColorSpace$FUNC
    );
    static final FunctionDescriptor GetICMProfileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetICMProfileA$MH = RuntimeHelper.downcallHandle(
        "GetICMProfileA",
        constants$438.GetICMProfileA$FUNC
    );
}


