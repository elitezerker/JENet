// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$72 {

    static final FunctionDescriptor _wcsnicoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wcsnicoll$MH = RuntimeHelper.downcallHandle(
        "_wcsnicoll",
        constants$72._wcsnicoll$FUNC
    );
    static final FunctionDescriptor _wcsnicoll_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wcsnicoll_l$MH = RuntimeHelper.downcallHandle(
        "_wcsnicoll_l",
        constants$72._wcsnicoll_l$FUNC
    );
    static final FunctionDescriptor wcsdup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsdup$MH = RuntimeHelper.downcallHandle(
        "wcsdup",
        constants$72.wcsdup$FUNC
    );
    static final FunctionDescriptor wcsicmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wcsicmp$MH = RuntimeHelper.downcallHandle(
        "wcsicmp",
        constants$72.wcsicmp$FUNC
    );
    static final FunctionDescriptor wcsnicmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsnicmp$MH = RuntimeHelper.downcallHandle(
        "wcsnicmp",
        constants$72.wcsnicmp$FUNC
    );
    static final FunctionDescriptor wcsnset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcsnset$MH = RuntimeHelper.downcallHandle(
        "wcsnset",
        constants$72.wcsnset$FUNC
    );
}


