// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$464 {

    static final FunctionDescriptor SetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "SetMessageExtraInfo",
        constants$464.SetMessageExtraInfo$FUNC
    );
    static final FunctionDescriptor SendMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendMessageA$MH = RuntimeHelper.downcallHandle(
        "SendMessageA",
        constants$464.SendMessageA$FUNC
    );
    static final FunctionDescriptor SendMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendMessageW$MH = RuntimeHelper.downcallHandle(
        "SendMessageW",
        constants$464.SendMessageW$FUNC
    );
    static final FunctionDescriptor SendMessageTimeoutA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendMessageTimeoutA$MH = RuntimeHelper.downcallHandle(
        "SendMessageTimeoutA",
        constants$464.SendMessageTimeoutA$FUNC
    );
    static final FunctionDescriptor SendMessageTimeoutW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SendMessageTimeoutW$MH = RuntimeHelper.downcallHandle(
        "SendMessageTimeoutW",
        constants$464.SendMessageTimeoutW$FUNC
    );
    static final FunctionDescriptor SendNotifyMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendNotifyMessageA$MH = RuntimeHelper.downcallHandle(
        "SendNotifyMessageA",
        constants$464.SendNotifyMessageA$FUNC
    );
}


