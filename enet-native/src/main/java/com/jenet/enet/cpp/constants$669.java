// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$669 {

    static final FunctionDescriptor waveInGetNumDevs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle waveInGetNumDevs$MH = RuntimeHelper.downcallHandle(
        "waveInGetNumDevs",
        constants$669.waveInGetNumDevs$FUNC
    );
    static final FunctionDescriptor waveInGetDevCapsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetDevCapsA$MH = RuntimeHelper.downcallHandle(
        "waveInGetDevCapsA",
        constants$669.waveInGetDevCapsA$FUNC
    );
    static final FunctionDescriptor waveInGetDevCapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetDevCapsW$MH = RuntimeHelper.downcallHandle(
        "waveInGetDevCapsW",
        constants$669.waveInGetDevCapsW$FUNC
    );
    static final FunctionDescriptor waveInGetErrorTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetErrorTextA$MH = RuntimeHelper.downcallHandle(
        "waveInGetErrorTextA",
        constants$669.waveInGetErrorTextA$FUNC
    );
    static final FunctionDescriptor waveInGetErrorTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInGetErrorTextW$MH = RuntimeHelper.downcallHandle(
        "waveInGetErrorTextW",
        constants$669.waveInGetErrorTextW$FUNC
    );
    static final FunctionDescriptor waveInOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInOpen$MH = RuntimeHelper.downcallHandle(
        "waveInOpen",
        constants$669.waveInOpen$FUNC
    );
}


