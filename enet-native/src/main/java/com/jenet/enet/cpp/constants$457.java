// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$457 {

    static final FunctionDescriptor GetThreadDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetThreadDesktop$MH = RuntimeHelper.downcallHandle(
        "GetThreadDesktop",
        constants$457.GetThreadDesktop$FUNC
    );
    static final FunctionDescriptor CreateWindowStationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowStationA$MH = RuntimeHelper.downcallHandle(
        "CreateWindowStationA",
        constants$457.CreateWindowStationA$FUNC
    );
    static final FunctionDescriptor CreateWindowStationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowStationW$MH = RuntimeHelper.downcallHandle(
        "CreateWindowStationW",
        constants$457.CreateWindowStationW$FUNC
    );
    static final FunctionDescriptor OpenWindowStationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenWindowStationA$MH = RuntimeHelper.downcallHandle(
        "OpenWindowStationA",
        constants$457.OpenWindowStationA$FUNC
    );
    static final FunctionDescriptor OpenWindowStationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenWindowStationW$MH = RuntimeHelper.downcallHandle(
        "OpenWindowStationW",
        constants$457.OpenWindowStationW$FUNC
    );
    static final FunctionDescriptor EnumWindowStationsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindowStationsA$MH = RuntimeHelper.downcallHandle(
        "EnumWindowStationsA",
        constants$457.EnumWindowStationsA$FUNC
    );
}

