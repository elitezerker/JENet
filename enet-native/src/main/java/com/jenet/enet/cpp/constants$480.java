// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$480 {

    static final FunctionDescriptor GetDlgItemTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDlgItemTextA$MH = RuntimeHelper.downcallHandle(
        "GetDlgItemTextA",
        constants$480.GetDlgItemTextA$FUNC
    );
    static final FunctionDescriptor GetDlgItemTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDlgItemTextW$MH = RuntimeHelper.downcallHandle(
        "GetDlgItemTextW",
        constants$480.GetDlgItemTextW$FUNC
    );
    static final FunctionDescriptor CheckDlgButton$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CheckDlgButton$MH = RuntimeHelper.downcallHandle(
        "CheckDlgButton",
        constants$480.CheckDlgButton$FUNC
    );
    static final FunctionDescriptor CheckRadioButton$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CheckRadioButton$MH = RuntimeHelper.downcallHandle(
        "CheckRadioButton",
        constants$480.CheckRadioButton$FUNC
    );
    static final FunctionDescriptor IsDlgButtonChecked$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsDlgButtonChecked$MH = RuntimeHelper.downcallHandle(
        "IsDlgButtonChecked",
        constants$480.IsDlgButtonChecked$FUNC
    );
    static final FunctionDescriptor SendDlgItemMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendDlgItemMessageA$MH = RuntimeHelper.downcallHandle(
        "SendDlgItemMessageA",
        constants$480.SendDlgItemMessageA$FUNC
    );
}

