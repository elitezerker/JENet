// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$459 {

    static final FunctionDescriptor GetUserObjectInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationA$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationA",
        constants$459.GetUserObjectInformationA$FUNC
    );
    static final FunctionDescriptor GetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "GetUserObjectInformationW",
        constants$459.GetUserObjectInformationW$FUNC
    );
    static final FunctionDescriptor SetUserObjectInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserObjectInformationA$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectInformationA",
        constants$459.SetUserObjectInformationA$FUNC
    );
    static final FunctionDescriptor SetUserObjectInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserObjectInformationW$MH = RuntimeHelper.downcallHandle(
        "SetUserObjectInformationW",
        constants$459.SetUserObjectInformationW$FUNC
    );
    static final FunctionDescriptor IsHungAppWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsHungAppWindow$MH = RuntimeHelper.downcallHandle(
        "IsHungAppWindow",
        constants$459.IsHungAppWindow$FUNC
    );
    static final FunctionDescriptor DisableProcessWindowsGhosting$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle DisableProcessWindowsGhosting$MH = RuntimeHelper.downcallHandle(
        "DisableProcessWindowsGhosting",
        constants$459.DisableProcessWindowsGhosting$FUNC
    );
}

