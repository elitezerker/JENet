// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$613 {

    static final FunctionDescriptor GetConsoleDisplayMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleDisplayMode$MH = RuntimeHelper.downcallHandle(
        "GetConsoleDisplayMode",
        constants$613.GetConsoleDisplayMode$FUNC
    );
    static final FunctionDescriptor SetConsoleDisplayMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleDisplayMode$MH = RuntimeHelper.downcallHandle(
        "SetConsoleDisplayMode",
        constants$613.SetConsoleDisplayMode$FUNC
    );
    static final FunctionDescriptor GetConsoleWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetConsoleWindow$MH = RuntimeHelper.downcallHandle(
        "GetConsoleWindow",
        constants$613.GetConsoleWindow$FUNC
    );
    static final FunctionDescriptor AddConsoleAliasA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddConsoleAliasA$MH = RuntimeHelper.downcallHandle(
        "AddConsoleAliasA",
        constants$613.AddConsoleAliasA$FUNC
    );
    static final FunctionDescriptor AddConsoleAliasW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddConsoleAliasW$MH = RuntimeHelper.downcallHandle(
        "AddConsoleAliasW",
        constants$613.AddConsoleAliasW$FUNC
    );
    static final FunctionDescriptor GetConsoleAliasA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleAliasA$MH = RuntimeHelper.downcallHandle(
        "GetConsoleAliasA",
        constants$613.GetConsoleAliasA$FUNC
    );
}


