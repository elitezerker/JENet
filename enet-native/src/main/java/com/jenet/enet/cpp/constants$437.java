// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$437 {

    static final FunctionDescriptor ICMENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ICMENUMPROCW$MH = RuntimeHelper.downcallHandle(
        constants$437.ICMENUMPROCW$FUNC
    );
    static final FunctionDescriptor SetICMMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetICMMode$MH = RuntimeHelper.downcallHandle(
        "SetICMMode",
        constants$437.SetICMMode$FUNC
    );
    static final FunctionDescriptor CheckColorsInGamut$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CheckColorsInGamut$MH = RuntimeHelper.downcallHandle(
        "CheckColorsInGamut",
        constants$437.CheckColorsInGamut$FUNC
    );
    static final FunctionDescriptor GetColorSpace$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetColorSpace$MH = RuntimeHelper.downcallHandle(
        "GetColorSpace",
        constants$437.GetColorSpace$FUNC
    );
    static final FunctionDescriptor GetLogColorSpaceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLogColorSpaceA$MH = RuntimeHelper.downcallHandle(
        "GetLogColorSpaceA",
        constants$437.GetLogColorSpaceA$FUNC
    );
}


