// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$527 {

    static final FunctionDescriptor GetWindowContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowContextHelpId$MH = RuntimeHelper.downcallHandle(
        "GetWindowContextHelpId",
        constants$527.GetWindowContextHelpId$FUNC
    );
    static final FunctionDescriptor SetMenuContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMenuContextHelpId$MH = RuntimeHelper.downcallHandle(
        "SetMenuContextHelpId",
        constants$527.SetMenuContextHelpId$FUNC
    );
    static final FunctionDescriptor GetMenuContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuContextHelpId$MH = RuntimeHelper.downcallHandle(
        "GetMenuContextHelpId",
        constants$527.GetMenuContextHelpId$FUNC
    );
    static final FunctionDescriptor MessageBoxA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBoxA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxA",
        constants$527.MessageBoxA$FUNC
    );
    static final FunctionDescriptor MessageBoxW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBoxW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxW",
        constants$527.MessageBoxW$FUNC
    );
    static final FunctionDescriptor MessageBoxExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle MessageBoxExA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxExA",
        constants$527.MessageBoxExA$FUNC
    );
}

