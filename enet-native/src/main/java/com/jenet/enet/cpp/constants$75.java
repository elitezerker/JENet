// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$75 {

    static final FunctionDescriptor strcat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcat$MH = RuntimeHelper.downcallHandle(
        "strcat",
        constants$75.strcat$FUNC
    );
    static final FunctionDescriptor strcmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcmp$MH = RuntimeHelper.downcallHandle(
        "strcmp",
        constants$75.strcmp$FUNC
    );
    static final FunctionDescriptor _strcmpi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strcmpi$MH = RuntimeHelper.downcallHandle(
        "_strcmpi",
        constants$75._strcmpi$FUNC
    );
    static final FunctionDescriptor strcoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcoll$MH = RuntimeHelper.downcallHandle(
        "strcoll",
        constants$75.strcoll$FUNC
    );
    static final FunctionDescriptor _strcoll_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strcoll_l$MH = RuntimeHelper.downcallHandle(
        "_strcoll_l",
        constants$75._strcoll_l$FUNC
    );
    static final FunctionDescriptor strcpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcpy$MH = RuntimeHelper.downcallHandle(
        "strcpy",
        constants$75.strcpy$FUNC
    );
}


