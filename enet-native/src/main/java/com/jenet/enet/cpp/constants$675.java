// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$675 {

    static final FunctionDescriptor midiOutGetErrorTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiOutGetErrorTextW$MH = RuntimeHelper.downcallHandle(
        "midiOutGetErrorTextW",
        constants$675.midiOutGetErrorTextW$FUNC
    );
    static final FunctionDescriptor midiOutOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiOutOpen$MH = RuntimeHelper.downcallHandle(
        "midiOutOpen",
        constants$675.midiOutOpen$FUNC
    );
    static final FunctionDescriptor midiOutClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiOutClose$MH = RuntimeHelper.downcallHandle(
        "midiOutClose",
        constants$675.midiOutClose$FUNC
    );
    static final FunctionDescriptor midiOutPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiOutPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiOutPrepareHeader",
        constants$675.midiOutPrepareHeader$FUNC
    );
    static final FunctionDescriptor midiOutUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiOutUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "midiOutUnprepareHeader",
        constants$675.midiOutUnprepareHeader$FUNC
    );
    static final FunctionDescriptor midiOutShortMsg$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiOutShortMsg$MH = RuntimeHelper.downcallHandle(
        "midiOutShortMsg",
        constants$675.midiOutShortMsg$FUNC
    );
}


