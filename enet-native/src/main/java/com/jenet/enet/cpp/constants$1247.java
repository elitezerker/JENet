// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1247 {

    static final FunctionDescriptor OleGetAutoConvert$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleGetAutoConvert$MH = RuntimeHelper.downcallHandle(
        "OleGetAutoConvert",
        constants$1247.OleGetAutoConvert$FUNC
    );
    static final FunctionDescriptor OleSetAutoConvert$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleSetAutoConvert$MH = RuntimeHelper.downcallHandle(
        "OleSetAutoConvert",
        constants$1247.OleSetAutoConvert$FUNC
    );
    static final FunctionDescriptor SetConvertStg$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetConvertStg$MH = RuntimeHelper.downcallHandle(
        "SetConvertStg",
        constants$1247.SetConvertStg$FUNC
    );
    static final FunctionDescriptor OleConvertIStorageToOLESTREAMEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleConvertIStorageToOLESTREAMEx$MH = RuntimeHelper.downcallHandle(
        "OleConvertIStorageToOLESTREAMEx",
        constants$1247.OleConvertIStorageToOLESTREAMEx$FUNC
    );
    static final FunctionDescriptor OleConvertOLESTREAMToIStorageEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleConvertOLESTREAMToIStorageEx$MH = RuntimeHelper.downcallHandle(
        "OleConvertOLESTREAMToIStorageEx",
        constants$1247.OleConvertOLESTREAMToIStorageEx$FUNC
    );
    static final  GroupLayout IID_IPrintDialogCallback$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IPrintDialogCallback$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IPrintDialogCallback", constants$1247.IID_IPrintDialogCallback$LAYOUT);
}

