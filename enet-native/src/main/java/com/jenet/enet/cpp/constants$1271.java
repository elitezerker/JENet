// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1271 {

    static final FunctionDescriptor PSC_NOTIFICATION_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PSC_NOTIFICATION_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$1271.PSC_NOTIFICATION_CALLBACK$FUNC
    );
    static final FunctionDescriptor SubscribeServiceChangeNotifications$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SubscribeServiceChangeNotifications$MH = RuntimeHelper.downcallHandle(
        "SubscribeServiceChangeNotifications",
        constants$1271.SubscribeServiceChangeNotifications$FUNC
    );
    static final FunctionDescriptor UnsubscribeServiceChangeNotifications$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnsubscribeServiceChangeNotifications$MH = RuntimeHelper.downcallHandle(
        "UnsubscribeServiceChangeNotifications",
        constants$1271.UnsubscribeServiceChangeNotifications$FUNC
    );
    static final FunctionDescriptor WaitServiceState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitServiceState$MH = RuntimeHelper.downcallHandle(
        "WaitServiceState",
        constants$1271.WaitServiceState$FUNC
    );
    static final FunctionDescriptor GetServiceRegistryStateKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceRegistryStateKey$MH = RuntimeHelper.downcallHandle(
        "GetServiceRegistryStateKey",
        constants$1271.GetServiceRegistryStateKey$FUNC
    );
}


