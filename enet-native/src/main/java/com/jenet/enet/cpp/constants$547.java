// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$547 {

    static final FunctionDescriptor PrivateExtractIconsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrivateExtractIconsW$MH = RuntimeHelper.downcallHandle(
        "PrivateExtractIconsW",
        constants$547.PrivateExtractIconsW$FUNC
    );
    static final FunctionDescriptor CreateIcon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateIcon$MH = RuntimeHelper.downcallHandle(
        "CreateIcon",
        constants$547.CreateIcon$FUNC
    );
    static final FunctionDescriptor DestroyIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyIcon$MH = RuntimeHelper.downcallHandle(
        "DestroyIcon",
        constants$547.DestroyIcon$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectory$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectory",
        constants$547.LookupIconIdFromDirectory$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectoryEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectoryEx$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectoryEx",
        constants$547.LookupIconIdFromDirectoryEx$FUNC
    );
    static final FunctionDescriptor CreateIconFromResource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResource$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResource",
        constants$547.CreateIconFromResource$FUNC
    );
}

