// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$611 {

    static final FunctionDescriptor GetConsoleOriginalTitleA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleOriginalTitleA$MH = RuntimeHelper.downcallHandle(
        "GetConsoleOriginalTitleA",
        constants$611.GetConsoleOriginalTitleA$FUNC
    );
    static final FunctionDescriptor GetConsoleOriginalTitleW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleOriginalTitleW$MH = RuntimeHelper.downcallHandle(
        "GetConsoleOriginalTitleW",
        constants$611.GetConsoleOriginalTitleW$FUNC
    );
    static final FunctionDescriptor SetConsoleTitleA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleTitleA$MH = RuntimeHelper.downcallHandle(
        "SetConsoleTitleA",
        constants$611.SetConsoleTitleA$FUNC
    );
    static final FunctionDescriptor SetConsoleTitleW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleTitleW$MH = RuntimeHelper.downcallHandle(
        "SetConsoleTitleW",
        constants$611.SetConsoleTitleW$FUNC
    );
    static final FunctionDescriptor GetNumberOfConsoleMouseButtons$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumberOfConsoleMouseButtons$MH = RuntimeHelper.downcallHandle(
        "GetNumberOfConsoleMouseButtons",
        constants$611.GetNumberOfConsoleMouseButtons$FUNC
    );
    static final FunctionDescriptor GetConsoleFontSize$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("X"),
        Constants$root.C_SHORT$LAYOUT.withName("Y")
    ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetConsoleFontSize$MH = RuntimeHelper.downcallHandle(
        "GetConsoleFontSize",
        constants$611.GetConsoleFontSize$FUNC
    );
}


