// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$224 {

    static final FunctionDescriptor DeleteProcThreadAttributeList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteProcThreadAttributeList$MH = RuntimeHelper.downcallHandle(
        "DeleteProcThreadAttributeList",
        constants$224.DeleteProcThreadAttributeList$FUNC
    );
    static final FunctionDescriptor UpdateProcThreadAttribute$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateProcThreadAttribute$MH = RuntimeHelper.downcallHandle(
        "UpdateProcThreadAttribute",
        constants$224.UpdateProcThreadAttribute$FUNC
    );
    static final FunctionDescriptor SetProcessDynamicEHContinuationTargets$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessDynamicEHContinuationTargets$MH = RuntimeHelper.downcallHandle(
        "SetProcessDynamicEHContinuationTargets",
        constants$224.SetProcessDynamicEHContinuationTargets$FUNC
    );
    static final FunctionDescriptor SetProcessDynamicEnforcedCetCompatibleRanges$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessDynamicEnforcedCetCompatibleRanges$MH = RuntimeHelper.downcallHandle(
        "SetProcessDynamicEnforcedCetCompatibleRanges",
        constants$224.SetProcessDynamicEnforcedCetCompatibleRanges$FUNC
    );
    static final FunctionDescriptor SetProcessAffinityUpdateMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessAffinityUpdateMode$MH = RuntimeHelper.downcallHandle(
        "SetProcessAffinityUpdateMode",
        constants$224.SetProcessAffinityUpdateMode$FUNC
    );
    static final FunctionDescriptor QueryProcessAffinityUpdateMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProcessAffinityUpdateMode$MH = RuntimeHelper.downcallHandle(
        "QueryProcessAffinityUpdateMode",
        constants$224.QueryProcessAffinityUpdateMode$FUNC
    );
}


