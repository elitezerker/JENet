// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$893 {

    static final FunctionDescriptor NdrFullPointerXlatInit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NdrFullPointerXlatInit$MH = RuntimeHelper.downcallHandle(
        "NdrFullPointerXlatInit",
        constants$893.NdrFullPointerXlatInit$FUNC
    );
    static final FunctionDescriptor NdrFullPointerXlatFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrFullPointerXlatFree$MH = RuntimeHelper.downcallHandle(
        "NdrFullPointerXlatFree",
        constants$893.NdrFullPointerXlatFree$FUNC
    );
    static final FunctionDescriptor NdrAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NdrAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrAllocate",
        constants$893.NdrAllocate$FUNC
    );
    static final FunctionDescriptor NdrClearOutParameters$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrClearOutParameters$MH = RuntimeHelper.downcallHandle(
        "NdrClearOutParameters",
        constants$893.NdrClearOutParameters$FUNC
    );
    static final FunctionDescriptor NdrOleAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle NdrOleAllocate$MH = RuntimeHelper.downcallHandle(
        "NdrOleAllocate",
        constants$893.NdrOleAllocate$FUNC
    );
    static final FunctionDescriptor NdrOleFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NdrOleFree$MH = RuntimeHelper.downcallHandle(
        "NdrOleFree",
        constants$893.NdrOleFree$FUNC
    );
}


