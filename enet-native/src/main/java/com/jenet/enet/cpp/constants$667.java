// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$667 {

    static final FunctionDescriptor waveOutWrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutWrite$MH = RuntimeHelper.downcallHandle(
        "waveOutWrite",
        constants$667.waveOutWrite$FUNC
    );
    static final FunctionDescriptor waveOutPause$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveOutPause$MH = RuntimeHelper.downcallHandle(
        "waveOutPause",
        constants$667.waveOutPause$FUNC
    );
    static final FunctionDescriptor waveOutRestart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveOutRestart$MH = RuntimeHelper.downcallHandle(
        "waveOutRestart",
        constants$667.waveOutRestart$FUNC
    );
    static final FunctionDescriptor waveOutReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveOutReset$MH = RuntimeHelper.downcallHandle(
        "waveOutReset",
        constants$667.waveOutReset$FUNC
    );
    static final FunctionDescriptor waveOutBreakLoop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveOutBreakLoop$MH = RuntimeHelper.downcallHandle(
        "waveOutBreakLoop",
        constants$667.waveOutBreakLoop$FUNC
    );
    static final FunctionDescriptor waveOutGetPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveOutGetPosition$MH = RuntimeHelper.downcallHandle(
        "waveOutGetPosition",
        constants$667.waveOutGetPosition$FUNC
    );
}


