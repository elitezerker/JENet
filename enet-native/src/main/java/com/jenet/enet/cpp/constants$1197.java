// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1197 {

    static final FunctionDescriptor VarR8FromUI1$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromUI1$MH = RuntimeHelper.downcallHandle(
        "VarR8FromUI1",
        constants$1197.VarR8FromUI1$FUNC
    );
    static final FunctionDescriptor VarR8FromI2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromI2$MH = RuntimeHelper.downcallHandle(
        "VarR8FromI2",
        constants$1197.VarR8FromI2$FUNC
    );
    static final FunctionDescriptor VarR8FromI4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromI4$MH = RuntimeHelper.downcallHandle(
        "VarR8FromI4",
        constants$1197.VarR8FromI4$FUNC
    );
    static final FunctionDescriptor VarR8FromI8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromI8$MH = RuntimeHelper.downcallHandle(
        "VarR8FromI8",
        constants$1197.VarR8FromI8$FUNC
    );
    static final FunctionDescriptor VarR8FromR4$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromR4$MH = RuntimeHelper.downcallHandle(
        "VarR8FromR4",
        constants$1197.VarR8FromR4$FUNC
    );
    static final FunctionDescriptor VarR8FromCy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                Constants$root.C_LONG$LAYOUT.withName("Hi")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
        ).withName("tagCY"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8FromCy$MH = RuntimeHelper.downcallHandle(
        "VarR8FromCy",
        constants$1197.VarR8FromCy$FUNC
    );
}

