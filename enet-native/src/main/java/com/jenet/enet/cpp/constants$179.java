// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$179 {

    static final FunctionDescriptor GetFinalPathNameByHandleW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetFinalPathNameByHandleW$MH = RuntimeHelper.downcallHandle(
        "GetFinalPathNameByHandleW",
        constants$179.GetFinalPathNameByHandleW$FUNC
    );
    static final FunctionDescriptor GetFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileTime$MH = RuntimeHelper.downcallHandle(
        "GetFileTime",
        constants$179.GetFileTime$FUNC
    );
    static final FunctionDescriptor GetFullPathNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameW$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameW",
        constants$179.GetFullPathNameW$FUNC
    );
    static final FunctionDescriptor GetFullPathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameA$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameA",
        constants$179.GetFullPathNameA$FUNC
    );
    static final FunctionDescriptor GetLogicalDrives$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetLogicalDrives$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDrives",
        constants$179.GetLogicalDrives$FUNC
    );
    static final FunctionDescriptor GetLogicalDriveStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalDriveStringsW$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDriveStringsW",
        constants$179.GetLogicalDriveStringsW$FUNC
    );
}

