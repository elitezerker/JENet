// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$322 {

    static final FunctionDescriptor GetLogicalDriveStringsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalDriveStringsA$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDriveStringsA",
        constants$322.GetLogicalDriveStringsA$FUNC
    );
    static final FunctionDescriptor LoadPackagedLibrary$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadPackagedLibrary$MH = RuntimeHelper.downcallHandle(
        "LoadPackagedLibrary",
        constants$322.LoadPackagedLibrary$FUNC
    );
    static final FunctionDescriptor QueryFullProcessImageNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryFullProcessImageNameA$MH = RuntimeHelper.downcallHandle(
        "QueryFullProcessImageNameA",
        constants$322.QueryFullProcessImageNameA$FUNC
    );
    static final FunctionDescriptor QueryFullProcessImageNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryFullProcessImageNameW$MH = RuntimeHelper.downcallHandle(
        "QueryFullProcessImageNameW",
        constants$322.QueryFullProcessImageNameW$FUNC
    );
    static final FunctionDescriptor GetStartupInfoA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetStartupInfoA$MH = RuntimeHelper.downcallHandle(
        "GetStartupInfoA",
        constants$322.GetStartupInfoA$FUNC
    );
    static final FunctionDescriptor GetFirmwareEnvironmentVariableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetFirmwareEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareEnvironmentVariableA",
        constants$322.GetFirmwareEnvironmentVariableA$FUNC
    );
}


