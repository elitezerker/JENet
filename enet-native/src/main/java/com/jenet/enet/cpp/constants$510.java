// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$510 {

    static final FunctionDescriptor GetSubMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSubMenu$MH = RuntimeHelper.downcallHandle(
        "GetSubMenu",
        constants$510.GetSubMenu$FUNC
    );
    static final FunctionDescriptor GetMenuItemID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMenuItemID$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemID",
        constants$510.GetMenuItemID$FUNC
    );
    static final FunctionDescriptor GetMenuItemCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuItemCount$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemCount",
        constants$510.GetMenuItemCount$FUNC
    );
    static final FunctionDescriptor InsertMenuA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InsertMenuA$MH = RuntimeHelper.downcallHandle(
        "InsertMenuA",
        constants$510.InsertMenuA$FUNC
    );
    static final FunctionDescriptor InsertMenuW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InsertMenuW$MH = RuntimeHelper.downcallHandle(
        "InsertMenuW",
        constants$510.InsertMenuW$FUNC
    );
    static final FunctionDescriptor AppendMenuA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AppendMenuA$MH = RuntimeHelper.downcallHandle(
        "AppendMenuA",
        constants$510.AppendMenuA$FUNC
    );
}


