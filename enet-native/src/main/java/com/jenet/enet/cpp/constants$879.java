// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$879 {

    static final FunctionDescriptor NdrInterfacePointerFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrInterfacePointerFree$MH = RuntimeHelper.downcallHandle(
        "NdrInterfacePointerFree",
        constants$879.NdrInterfacePointerFree$FUNC
    );
    static final FunctionDescriptor NdrConvert2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrConvert2$MH = RuntimeHelper.downcallHandle(
        "NdrConvert2",
        constants$879.NdrConvert2$FUNC
    );
    static final FunctionDescriptor NdrConvert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrConvert$MH = RuntimeHelper.downcallHandle(
        "NdrConvert",
        constants$879.NdrConvert$FUNC
    );
    static final FunctionDescriptor NdrUserMarshalSimpleTypeConvert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle NdrUserMarshalSimpleTypeConvert$MH = RuntimeHelper.downcallHandle(
        "NdrUserMarshalSimpleTypeConvert",
        constants$879.NdrUserMarshalSimpleTypeConvert$FUNC
    );
    static final FunctionDescriptor NdrClientInitializeNew$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrClientInitializeNew$MH = RuntimeHelper.downcallHandle(
        "NdrClientInitializeNew",
        constants$879.NdrClientInitializeNew$FUNC
    );
    static final FunctionDescriptor NdrServerInitializeNew$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrServerInitializeNew$MH = RuntimeHelper.downcallHandle(
        "NdrServerInitializeNew",
        constants$879.NdrServerInitializeNew$FUNC
    );
}


