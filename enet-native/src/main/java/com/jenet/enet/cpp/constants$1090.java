// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1090 {

    static final FunctionDescriptor GetHGlobalFromILockBytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetHGlobalFromILockBytes$MH = RuntimeHelper.downcallHandle(
        "GetHGlobalFromILockBytes",
        constants$1090.GetHGlobalFromILockBytes$FUNC
    );
    static final FunctionDescriptor CreateILockBytesOnHGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateILockBytesOnHGlobal$MH = RuntimeHelper.downcallHandle(
        "CreateILockBytesOnHGlobal",
        constants$1090.CreateILockBytesOnHGlobal$FUNC
    );
    static final FunctionDescriptor GetConvertStg$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConvertStg$MH = RuntimeHelper.downcallHandle(
        "GetConvertStg",
        constants$1090.GetConvertStg$FUNC
    );
    static final FunctionDescriptor CoBuildVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle CoBuildVersion$MH = RuntimeHelper.downcallHandle(
        "CoBuildVersion",
        constants$1090.CoBuildVersion$FUNC
    );
    static final FunctionDescriptor CoInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoInitialize$MH = RuntimeHelper.downcallHandle(
        "CoInitialize",
        constants$1090.CoInitialize$FUNC
    );
    static final FunctionDescriptor CoRegisterMallocSpy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterMallocSpy$MH = RuntimeHelper.downcallHandle(
        "CoRegisterMallocSpy",
        constants$1090.CoRegisterMallocSpy$FUNC
    );
}

