// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$490 {

    static final FunctionDescriptor CharPrevW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharPrevW$MH = RuntimeHelper.downcallHandle(
        "CharPrevW",
        constants$490.CharPrevW$FUNC
    );
    static final FunctionDescriptor CharNextExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CharNextExA$MH = RuntimeHelper.downcallHandle(
        "CharNextExA",
        constants$490.CharNextExA$FUNC
    );
    static final FunctionDescriptor CharPrevExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CharPrevExA$MH = RuntimeHelper.downcallHandle(
        "CharPrevExA",
        constants$490.CharPrevExA$FUNC
    );
    static final FunctionDescriptor IsCharAlphaA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsCharAlphaA$MH = RuntimeHelper.downcallHandle(
        "IsCharAlphaA",
        constants$490.IsCharAlphaA$FUNC
    );
    static final FunctionDescriptor IsCharAlphaW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle IsCharAlphaW$MH = RuntimeHelper.downcallHandle(
        "IsCharAlphaW",
        constants$490.IsCharAlphaW$FUNC
    );
    static final FunctionDescriptor IsCharAlphaNumericA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle IsCharAlphaNumericA$MH = RuntimeHelper.downcallHandle(
        "IsCharAlphaNumericA",
        constants$490.IsCharAlphaNumericA$FUNC
    );
}


