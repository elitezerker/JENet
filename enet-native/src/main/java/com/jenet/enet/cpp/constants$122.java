// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$122 {

    static final  GroupLayout GUID_STANDBY_BUDGET_GRACE_PERIOD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_STANDBY_BUDGET_GRACE_PERIOD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_STANDBY_BUDGET_GRACE_PERIOD", constants$122.GUID_STANDBY_BUDGET_GRACE_PERIOD$LAYOUT);
    static final  GroupLayout GUID_STANDBY_BUDGET_PERCENT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_STANDBY_BUDGET_PERCENT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_STANDBY_BUDGET_PERCENT", constants$122.GUID_STANDBY_BUDGET_PERCENT$LAYOUT);
    static final  GroupLayout GUID_STANDBY_RESERVE_GRACE_PERIOD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_STANDBY_RESERVE_GRACE_PERIOD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_STANDBY_RESERVE_GRACE_PERIOD", constants$122.GUID_STANDBY_RESERVE_GRACE_PERIOD$LAYOUT);
    static final  GroupLayout GUID_STANDBY_RESERVE_TIME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_STANDBY_RESERVE_TIME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_STANDBY_RESERVE_TIME", constants$122.GUID_STANDBY_RESERVE_TIME$LAYOUT);
    static final  GroupLayout GUID_STANDBY_RESET_PERCENT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_STANDBY_RESET_PERCENT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_STANDBY_RESET_PERCENT", constants$122.GUID_STANDBY_RESET_PERCENT$LAYOUT);
    static final  GroupLayout GUID_ALLOW_STANDBY_STATES$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_STANDBY_STATES$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ALLOW_STANDBY_STATES", constants$122.GUID_ALLOW_STANDBY_STATES$LAYOUT);
}


