// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1304 {

    static final FunctionDescriptor enet_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_malloc$MH = RuntimeHelper.downcallHandle(
        "enet_malloc",
        constants$1304.enet_malloc$FUNC
    );
    static final FunctionDescriptor enet_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_free$MH = RuntimeHelper.downcallHandle(
        "enet_free",
        constants$1304.enet_free$FUNC
    );
    static final FunctionDescriptor ENetPacketFreeCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ENetPacketFreeCallback$MH = RuntimeHelper.downcallHandle(
        constants$1304.ENetPacketFreeCallback$FUNC
    );
    static final FunctionDescriptor ENetChecksumCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ENetChecksumCallback$MH = RuntimeHelper.downcallHandle(
        constants$1304.ENetChecksumCallback$FUNC
    );
}


