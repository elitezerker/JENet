// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$234 {

    static final FunctionDescriptor GetSystemWindowsDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSystemWindowsDirectoryW$MH = RuntimeHelper.downcallHandle(
        "GetSystemWindowsDirectoryW",
        constants$234.GetSystemWindowsDirectoryW$FUNC
    );
    static final FunctionDescriptor GetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameExA",
        constants$234.GetComputerNameExA$FUNC
    );
    static final FunctionDescriptor GetComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameExW",
        constants$234.GetComputerNameExW$FUNC
    );
    static final FunctionDescriptor SetComputerNameExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExW",
        constants$234.SetComputerNameExW$FUNC
    );
    static final FunctionDescriptor SetSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSystemTime$MH = RuntimeHelper.downcallHandle(
        "SetSystemTime",
        constants$234.SetSystemTime$FUNC
    );
    static final FunctionDescriptor GetVersionExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetVersionExA$MH = RuntimeHelper.downcallHandle(
        "GetVersionExA",
        constants$234.GetVersionExA$FUNC
    );
}


