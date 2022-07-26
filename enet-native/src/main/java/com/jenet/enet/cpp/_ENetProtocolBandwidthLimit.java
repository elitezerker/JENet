// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENetProtocolBandwidthLimit {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("command"),
            Constants$root.C_CHAR$LAYOUT.withName("channelID"),
            Constants$root.C_SHORT$LAYOUT.withName("reliableSequenceNumber")
        ).withName("header"),
        Constants$root.C_LONG$LAYOUT.withName("incomingBandwidth"),
        Constants$root.C_LONG$LAYOUT.withName("outgoingBandwidth")
    ).withName("_ENetProtocolBandwidthLimit");
    public static MemoryLayout $LAYOUT() {
        return _ENetProtocolBandwidthLimit.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle incomingBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("incomingBandwidth"));
    public static VarHandle incomingBandwidth$VH() {
        return _ENetProtocolBandwidthLimit.incomingBandwidth$VH;
    }
    public static int incomingBandwidth$get(MemorySegment seg) {
        return (int)_ENetProtocolBandwidthLimit.incomingBandwidth$VH.get(seg);
    }
    public static void incomingBandwidth$set( MemorySegment seg, int x) {
        _ENetProtocolBandwidthLimit.incomingBandwidth$VH.set(seg, x);
    }
    public static int incomingBandwidth$get(MemorySegment seg, long index) {
        return (int)_ENetProtocolBandwidthLimit.incomingBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void incomingBandwidth$set(MemorySegment seg, long index, int x) {
        _ENetProtocolBandwidthLimit.incomingBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle outgoingBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("outgoingBandwidth"));
    public static VarHandle outgoingBandwidth$VH() {
        return _ENetProtocolBandwidthLimit.outgoingBandwidth$VH;
    }
    public static int outgoingBandwidth$get(MemorySegment seg) {
        return (int)_ENetProtocolBandwidthLimit.outgoingBandwidth$VH.get(seg);
    }
    public static void outgoingBandwidth$set( MemorySegment seg, int x) {
        _ENetProtocolBandwidthLimit.outgoingBandwidth$VH.set(seg, x);
    }
    public static int outgoingBandwidth$get(MemorySegment seg, long index) {
        return (int)_ENetProtocolBandwidthLimit.outgoingBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void outgoingBandwidth$set(MemorySegment seg, long index, int x) {
        _ENetProtocolBandwidthLimit.outgoingBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


