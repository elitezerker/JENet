// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$238 {

    static final FunctionDescriptor SetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameA",
        constants$238.SetComputerNameA$FUNC
    );
    static final FunctionDescriptor SetComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameW",
        constants$238.SetComputerNameW$FUNC
    );
    static final FunctionDescriptor SetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExA",
        constants$238.SetComputerNameExA$FUNC
    );
    static final FunctionDescriptor VirtualAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAlloc$MH = RuntimeHelper.downcallHandle(
        "VirtualAlloc",
        constants$238.VirtualAlloc$FUNC
    );
    static final FunctionDescriptor VirtualProtect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VirtualProtect$MH = RuntimeHelper.downcallHandle(
        "VirtualProtect",
        constants$238.VirtualProtect$FUNC
    );
    static final FunctionDescriptor VirtualFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualFree$MH = RuntimeHelper.downcallHandle(
        "VirtualFree",
        constants$238.VirtualFree$FUNC
    );
}


