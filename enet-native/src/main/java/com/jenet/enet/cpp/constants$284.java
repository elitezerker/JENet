// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$284 {

    static final FunctionDescriptor PrivilegedServiceAuditAlarmW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrivilegedServiceAuditAlarmW$MH = RuntimeHelper.downcallHandle(
        "PrivilegedServiceAuditAlarmW",
        constants$284.PrivilegedServiceAuditAlarmW$FUNC
    );
    static final FunctionDescriptor QuerySecurityAccessMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QuerySecurityAccessMask$MH = RuntimeHelper.downcallHandle(
        "QuerySecurityAccessMask",
        constants$284.QuerySecurityAccessMask$FUNC
    );
    static final FunctionDescriptor RevertToSelf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RevertToSelf$MH = RuntimeHelper.downcallHandle(
        "RevertToSelf",
        constants$284.RevertToSelf$FUNC
    );
    static final FunctionDescriptor SetAclInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetAclInformation$MH = RuntimeHelper.downcallHandle(
        "SetAclInformation",
        constants$284.SetAclInformation$FUNC
    );
    static final FunctionDescriptor SetFileSecurityW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileSecurityW$MH = RuntimeHelper.downcallHandle(
        "SetFileSecurityW",
        constants$284.SetFileSecurityW$FUNC
    );
    static final FunctionDescriptor SetKernelObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKernelObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetKernelObjectSecurity",
        constants$284.SetKernelObjectSecurity$FUNC
    );
}


