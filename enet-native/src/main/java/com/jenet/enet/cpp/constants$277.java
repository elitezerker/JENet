// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$277 {

    static final FunctionDescriptor EqualPrefixSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EqualPrefixSid$MH = RuntimeHelper.downcallHandle(
        "EqualPrefixSid",
        constants$277.EqualPrefixSid$FUNC
    );
    static final FunctionDescriptor EqualSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EqualSid$MH = RuntimeHelper.downcallHandle(
        "EqualSid",
        constants$277.EqualSid$FUNC
    );
    static final FunctionDescriptor FindFirstFreeAce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFreeAce$MH = RuntimeHelper.downcallHandle(
        "FindFirstFreeAce",
        constants$277.FindFirstFreeAce$FUNC
    );
    static final FunctionDescriptor FreeSid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeSid$MH = RuntimeHelper.downcallHandle(
        "FreeSid",
        constants$277.FreeSid$FUNC
    );
    static final FunctionDescriptor GetAce$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAce$MH = RuntimeHelper.downcallHandle(
        "GetAce",
        constants$277.GetAce$FUNC
    );
    static final FunctionDescriptor GetAclInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAclInformation$MH = RuntimeHelper.downcallHandle(
        "GetAclInformation",
        constants$277.GetAclInformation$FUNC
    );
}


