// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$685 {

    static final FunctionDescriptor joySetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetThreshold$MH = RuntimeHelper.downcallHandle(
        "joySetThreshold",
        constants$685.joySetThreshold$FUNC
    );
    static final FunctionDescriptor joyConfigChanged$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyConfigChanged$MH = RuntimeHelper.downcallHandle(
        "joyConfigChanged",
        constants$685.joyConfigChanged$FUNC
    );
    static final FunctionDescriptor Netbios$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Netbios$MH = RuntimeHelper.downcallHandle(
        "Netbios",
        constants$685.Netbios$FUNC
    );
    static final FunctionDescriptor RPC_OBJECT_INQ_FN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RPC_OBJECT_INQ_FN$MH = RuntimeHelper.downcallHandle(
        constants$685.RPC_OBJECT_INQ_FN$FUNC
    );
    static final FunctionDescriptor RPC_IF_CALLBACK_FN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


