// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$182 {

    static final FunctionDescriptor ReadFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadFileEx$MH = RuntimeHelper.downcallHandle(
        "ReadFileEx",
        constants$182.ReadFileEx$FUNC
    );
    static final FunctionDescriptor ReadFileScatter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadFileScatter$MH = RuntimeHelper.downcallHandle(
        "ReadFileScatter",
        constants$182.ReadFileScatter$FUNC
    );
    static final FunctionDescriptor RemoveDirectoryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDirectoryA$MH = RuntimeHelper.downcallHandle(
        "RemoveDirectoryA",
        constants$182.RemoveDirectoryA$FUNC
    );
    static final FunctionDescriptor RemoveDirectoryW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveDirectoryW$MH = RuntimeHelper.downcallHandle(
        "RemoveDirectoryW",
        constants$182.RemoveDirectoryW$FUNC
    );
    static final FunctionDescriptor SetEndOfFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEndOfFile$MH = RuntimeHelper.downcallHandle(
        "SetEndOfFile",
        constants$182.SetEndOfFile$FUNC
    );
    static final FunctionDescriptor SetFileAttributesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetFileAttributesA$MH = RuntimeHelper.downcallHandle(
        "SetFileAttributesA",
        constants$182.SetFileAttributesA$FUNC
    );
}


