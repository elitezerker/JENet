// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1309 {

    static final FunctionDescriptor enet_address_get_host_ip$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_address_get_host_ip$MH = RuntimeHelper.downcallHandle(
        "enet_address_get_host_ip",
        constants$1309.enet_address_get_host_ip$FUNC
    );
    static final FunctionDescriptor enet_address_get_host$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_address_get_host$MH = RuntimeHelper.downcallHandle(
        "enet_address_get_host",
        constants$1309.enet_address_get_host$FUNC
    );
    static final FunctionDescriptor enet_packet_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle enet_packet_create$MH = RuntimeHelper.downcallHandle(
        "enet_packet_create",
        constants$1309.enet_packet_create$FUNC
    );
    static final FunctionDescriptor enet_packet_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle enet_packet_destroy$MH = RuntimeHelper.downcallHandle(
        "enet_packet_destroy",
        constants$1309.enet_packet_destroy$FUNC
    );
    static final FunctionDescriptor enet_packet_resize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_packet_resize$MH = RuntimeHelper.downcallHandle(
        "enet_packet_resize",
        constants$1309.enet_packet_resize$FUNC
    );
    static final FunctionDescriptor enet_crc32$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle enet_crc32$MH = RuntimeHelper.downcallHandle(
        "enet_crc32",
        constants$1309.enet_crc32$FUNC
    );
}

