// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$483 {

    static final FunctionDescriptor CallMsgFilterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallMsgFilterW$MH = RuntimeHelper.downcallHandle(
        "CallMsgFilterW",
        constants$483.CallMsgFilterW$FUNC
    );
    static final FunctionDescriptor OpenClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenClipboard$MH = RuntimeHelper.downcallHandle(
        "OpenClipboard",
        constants$483.OpenClipboard$FUNC
    );
    static final FunctionDescriptor CloseClipboard$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CloseClipboard$MH = RuntimeHelper.downcallHandle(
        "CloseClipboard",
        constants$483.CloseClipboard$FUNC
    );
    static final FunctionDescriptor GetClipboardSequenceNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetClipboardSequenceNumber$MH = RuntimeHelper.downcallHandle(
        "GetClipboardSequenceNumber",
        constants$483.GetClipboardSequenceNumber$FUNC
    );
    static final FunctionDescriptor GetClipboardOwner$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetClipboardOwner$MH = RuntimeHelper.downcallHandle(
        "GetClipboardOwner",
        constants$483.GetClipboardOwner$FUNC
    );
    static final FunctionDescriptor SetClipboardViewer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetClipboardViewer$MH = RuntimeHelper.downcallHandle(
        "SetClipboardViewer",
        constants$483.SetClipboardViewer$FUNC
    );
}


