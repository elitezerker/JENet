// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _userSTGMEDIUM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(128),
        Constants$root.C_POINTER$LAYOUT.withName("pUnkForRelease")
    ).withName("_userSTGMEDIUM");
    public static MemoryLayout $LAYOUT() {
        return _userSTGMEDIUM.$struct$LAYOUT;
    }
    static final VarHandle pUnkForRelease$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnkForRelease"));
    public static VarHandle pUnkForRelease$VH() {
        return _userSTGMEDIUM.pUnkForRelease$VH;
    }
    public static MemoryAddress pUnkForRelease$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_userSTGMEDIUM.pUnkForRelease$VH.get(seg);
    }
    public static void pUnkForRelease$set( MemorySegment seg, MemoryAddress x) {
        _userSTGMEDIUM.pUnkForRelease$VH.set(seg, x);
    }
    public static MemoryAddress pUnkForRelease$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_userSTGMEDIUM.pUnkForRelease$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnkForRelease$set(MemorySegment seg, long index, MemoryAddress x) {
        _userSTGMEDIUM.pUnkForRelease$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

