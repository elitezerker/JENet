// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENetProtocolDisconnect {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("command"),
            Constants$root.C_CHAR$LAYOUT.withName("channelID"),
            Constants$root.C_SHORT$LAYOUT.withName("reliableSequenceNumber")
        ).withName("header"),
        Constants$root.C_LONG$LAYOUT.withName("data")
    ).withName("_ENetProtocolDisconnect");
    public static MemoryLayout $LAYOUT() {
        return _ENetProtocolDisconnect.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _ENetProtocolDisconnect.data$VH;
    }
    public static int data$get(MemorySegment seg) {
        return (int)_ENetProtocolDisconnect.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, int x) {
        _ENetProtocolDisconnect.data$VH.set(seg, x);
    }
    public static int data$get(MemorySegment seg, long index) {
        return (int)_ENetProtocolDisconnect.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, int x) {
        _ENetProtocolDisconnect.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


