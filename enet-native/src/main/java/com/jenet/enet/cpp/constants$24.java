// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG$LAYOUT.withName("rem")
    ).withName("_div_t"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
        "div",
        constants$24.div$FUNC
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG$LAYOUT.withName("rem")
    ).withName("_ldiv_t"),
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$24.ldiv$FUNC
    );
    static final FunctionDescriptor lldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ).withName("_lldiv_t"),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle lldiv$MH = RuntimeHelper.downcallHandle(
        "lldiv",
        constants$24.lldiv$FUNC
    );
    static final FunctionDescriptor _rotl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _rotl$MH = RuntimeHelper.downcallHandle(
        "_rotl",
        constants$24._rotl$FUNC
    );
    static final FunctionDescriptor _lrotl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lrotl$MH = RuntimeHelper.downcallHandle(
        "_lrotl",
        constants$24._lrotl$FUNC
    );
    static final FunctionDescriptor _rotl64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _rotl64$MH = RuntimeHelper.downcallHandle(
        "_rotl64",
        constants$24._rotl64$FUNC
    );
}

