// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$374 {

    static final FunctionDescriptor UnregisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle UnregisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "UnregisterApplicationRecoveryCallback",
        constants$374.UnregisterApplicationRecoveryCallback$FUNC
    );
    static final FunctionDescriptor RegisterApplicationRestart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterApplicationRestart$MH = RuntimeHelper.downcallHandle(
        "RegisterApplicationRestart",
        constants$374.RegisterApplicationRestart$FUNC
    );
    static final FunctionDescriptor UnregisterApplicationRestart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle UnregisterApplicationRestart$MH = RuntimeHelper.downcallHandle(
        "UnregisterApplicationRestart",
        constants$374.UnregisterApplicationRestart$FUNC
    );
    static final FunctionDescriptor GetApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "GetApplicationRecoveryCallback",
        constants$374.GetApplicationRecoveryCallback$FUNC
    );
    static final FunctionDescriptor GetApplicationRestartSettings$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetApplicationRestartSettings$MH = RuntimeHelper.downcallHandle(
        "GetApplicationRestartSettings",
        constants$374.GetApplicationRestartSettings$FUNC
    );
    static final FunctionDescriptor ApplicationRecoveryInProgress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ApplicationRecoveryInProgress$MH = RuntimeHelper.downcallHandle(
        "ApplicationRecoveryInProgress",
        constants$374.ApplicationRecoveryInProgress$FUNC
    );
}


