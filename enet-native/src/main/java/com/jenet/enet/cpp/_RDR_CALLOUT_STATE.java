// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RDR_CALLOUT_STATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("LastError"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("LastEEInfo"),
        Constants$root.C_LONG$LAYOUT.withName("LastCalledStage"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ServerName"),
        Constants$root.C_POINTER$LAYOUT.withName("ServerPort"),
        Constants$root.C_POINTER$LAYOUT.withName("RemoteUser"),
        Constants$root.C_POINTER$LAYOUT.withName("AuthType"),
        Constants$root.C_CHAR$LAYOUT.withName("ResourceTypePresent"),
        Constants$root.C_CHAR$LAYOUT.withName("SessionIdPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("InterfacePresent"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ResourceType"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("SessionId"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("SyntaxGUID"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
                Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
            ).withName("SyntaxVersion")
        ).withName("Interface"),
        Constants$root.C_POINTER$LAYOUT.withName("CertContext")
    ).withName("_RDR_CALLOUT_STATE");
    public static MemoryLayout $LAYOUT() {
        return _RDR_CALLOUT_STATE.$struct$LAYOUT;
    }
    static final VarHandle LastError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastError"));
    public static VarHandle LastError$VH() {
        return _RDR_CALLOUT_STATE.LastError$VH;
    }
    public static int LastError$get(MemorySegment seg) {
        return (int)_RDR_CALLOUT_STATE.LastError$VH.get(seg);
    }
    public static void LastError$set( MemorySegment seg, int x) {
        _RDR_CALLOUT_STATE.LastError$VH.set(seg, x);
    }
    public static int LastError$get(MemorySegment seg, long index) {
        return (int)_RDR_CALLOUT_STATE.LastError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LastError$set(MemorySegment seg, long index, int x) {
        _RDR_CALLOUT_STATE.LastError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LastEEInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastEEInfo"));
    public static VarHandle LastEEInfo$VH() {
        return _RDR_CALLOUT_STATE.LastEEInfo$VH;
    }
    public static MemoryAddress LastEEInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.LastEEInfo$VH.get(seg);
    }
    public static void LastEEInfo$set( MemorySegment seg, MemoryAddress x) {
        _RDR_CALLOUT_STATE.LastEEInfo$VH.set(seg, x);
    }
    public static MemoryAddress LastEEInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.LastEEInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LastEEInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _RDR_CALLOUT_STATE.LastEEInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LastCalledStage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastCalledStage"));
    public static VarHandle LastCalledStage$VH() {
        return _RDR_CALLOUT_STATE.LastCalledStage$VH;
    }
    public static int LastCalledStage$get(MemorySegment seg) {
        return (int)_RDR_CALLOUT_STATE.LastCalledStage$VH.get(seg);
    }
    public static void LastCalledStage$set( MemorySegment seg, int x) {
        _RDR_CALLOUT_STATE.LastCalledStage$VH.set(seg, x);
    }
    public static int LastCalledStage$get(MemorySegment seg, long index) {
        return (int)_RDR_CALLOUT_STATE.LastCalledStage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LastCalledStage$set(MemorySegment seg, long index, int x) {
        _RDR_CALLOUT_STATE.LastCalledStage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerName"));
    public static VarHandle ServerName$VH() {
        return _RDR_CALLOUT_STATE.ServerName$VH;
    }
    public static MemoryAddress ServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.ServerName$VH.get(seg);
    }
    public static void ServerName$set( MemorySegment seg, MemoryAddress x) {
        _RDR_CALLOUT_STATE.ServerName$VH.set(seg, x);
    }
    public static MemoryAddress ServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.ServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerName$set(MemorySegment seg, long index, MemoryAddress x) {
        _RDR_CALLOUT_STATE.ServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPort$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerPort"));
    public static VarHandle ServerPort$VH() {
        return _RDR_CALLOUT_STATE.ServerPort$VH;
    }
    public static MemoryAddress ServerPort$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.ServerPort$VH.get(seg);
    }
    public static void ServerPort$set( MemorySegment seg, MemoryAddress x) {
        _RDR_CALLOUT_STATE.ServerPort$VH.set(seg, x);
    }
    public static MemoryAddress ServerPort$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.ServerPort$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPort$set(MemorySegment seg, long index, MemoryAddress x) {
        _RDR_CALLOUT_STATE.ServerPort$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RemoteUser$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RemoteUser"));
    public static VarHandle RemoteUser$VH() {
        return _RDR_CALLOUT_STATE.RemoteUser$VH;
    }
    public static MemoryAddress RemoteUser$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.RemoteUser$VH.get(seg);
    }
    public static void RemoteUser$set( MemorySegment seg, MemoryAddress x) {
        _RDR_CALLOUT_STATE.RemoteUser$VH.set(seg, x);
    }
    public static MemoryAddress RemoteUser$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.RemoteUser$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RemoteUser$set(MemorySegment seg, long index, MemoryAddress x) {
        _RDR_CALLOUT_STATE.RemoteUser$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthType"));
    public static VarHandle AuthType$VH() {
        return _RDR_CALLOUT_STATE.AuthType$VH;
    }
    public static MemoryAddress AuthType$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.AuthType$VH.get(seg);
    }
    public static void AuthType$set( MemorySegment seg, MemoryAddress x) {
        _RDR_CALLOUT_STATE.AuthType$VH.set(seg, x);
    }
    public static MemoryAddress AuthType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.AuthType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthType$set(MemorySegment seg, long index, MemoryAddress x) {
        _RDR_CALLOUT_STATE.AuthType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ResourceTypePresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResourceTypePresent"));
    public static VarHandle ResourceTypePresent$VH() {
        return _RDR_CALLOUT_STATE.ResourceTypePresent$VH;
    }
    public static byte ResourceTypePresent$get(MemorySegment seg) {
        return (byte)_RDR_CALLOUT_STATE.ResourceTypePresent$VH.get(seg);
    }
    public static void ResourceTypePresent$set( MemorySegment seg, byte x) {
        _RDR_CALLOUT_STATE.ResourceTypePresent$VH.set(seg, x);
    }
    public static byte ResourceTypePresent$get(MemorySegment seg, long index) {
        return (byte)_RDR_CALLOUT_STATE.ResourceTypePresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResourceTypePresent$set(MemorySegment seg, long index, byte x) {
        _RDR_CALLOUT_STATE.ResourceTypePresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SessionIdPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SessionIdPresent"));
    public static VarHandle SessionIdPresent$VH() {
        return _RDR_CALLOUT_STATE.SessionIdPresent$VH;
    }
    public static byte SessionIdPresent$get(MemorySegment seg) {
        return (byte)_RDR_CALLOUT_STATE.SessionIdPresent$VH.get(seg);
    }
    public static void SessionIdPresent$set( MemorySegment seg, byte x) {
        _RDR_CALLOUT_STATE.SessionIdPresent$VH.set(seg, x);
    }
    public static byte SessionIdPresent$get(MemorySegment seg, long index) {
        return (byte)_RDR_CALLOUT_STATE.SessionIdPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SessionIdPresent$set(MemorySegment seg, long index, byte x) {
        _RDR_CALLOUT_STATE.SessionIdPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InterfacePresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InterfacePresent"));
    public static VarHandle InterfacePresent$VH() {
        return _RDR_CALLOUT_STATE.InterfacePresent$VH;
    }
    public static byte InterfacePresent$get(MemorySegment seg) {
        return (byte)_RDR_CALLOUT_STATE.InterfacePresent$VH.get(seg);
    }
    public static void InterfacePresent$set( MemorySegment seg, byte x) {
        _RDR_CALLOUT_STATE.InterfacePresent$VH.set(seg, x);
    }
    public static byte InterfacePresent$get(MemorySegment seg, long index) {
        return (byte)_RDR_CALLOUT_STATE.InterfacePresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InterfacePresent$set(MemorySegment seg, long index, byte x) {
        _RDR_CALLOUT_STATE.InterfacePresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ResourceType$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    public static MemorySegment SessionId$slice(MemorySegment seg) {
        return seg.asSlice(76, 16);
    }
    public static MemorySegment Interface$slice(MemorySegment seg) {
        return seg.asSlice(92, 20);
    }
    static final VarHandle CertContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CertContext"));
    public static VarHandle CertContext$VH() {
        return _RDR_CALLOUT_STATE.CertContext$VH;
    }
    public static MemoryAddress CertContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.CertContext$VH.get(seg);
    }
    public static void CertContext$set( MemorySegment seg, MemoryAddress x) {
        _RDR_CALLOUT_STATE.CertContext$VH.set(seg, x);
    }
    public static MemoryAddress CertContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RDR_CALLOUT_STATE.CertContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CertContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _RDR_CALLOUT_STATE.CertContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

