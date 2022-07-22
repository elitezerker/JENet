// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IInternetProtocolSinkVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Switch"),
        Constants$root.C_POINTER$LAYOUT.withName("ReportProgress"),
        Constants$root.C_POINTER$LAYOUT.withName("ReportData"),
        Constants$root.C_POINTER$LAYOUT.withName("ReportResult")
    ).withName("IInternetProtocolSinkVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetProtocolSinkVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetProtocolSinkVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInternetProtocolSinkVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetProtocolSinkVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInternetProtocolSinkVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetProtocolSinkVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInternetProtocolSinkVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Switch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Switch$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.Switch$FUNC
    );
    public interface Switch {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Switch fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Switch.class, fi, IInternetProtocolSinkVtbl.Switch$FUNC, session);
        }
        static Switch ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.Switch$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Switch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Switch"));
    public static VarHandle Switch$VH() {
        return IInternetProtocolSinkVtbl.Switch$VH;
    }
    public static MemoryAddress Switch$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Switch$VH.get(seg);
    }
    public static void Switch$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Switch$VH.set(seg, x);
    }
    public static MemoryAddress Switch$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Switch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Switch$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Switch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Switch Switch (MemorySegment segment, MemorySession session) {
        return Switch.ofAddress(Switch$get(segment), session);
    }
    static final FunctionDescriptor ReportProgress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReportProgress$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.ReportProgress$FUNC
    );
    public interface ReportProgress {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(ReportProgress fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReportProgress.class, fi, IInternetProtocolSinkVtbl.ReportProgress$FUNC, session);
        }
        static ReportProgress ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.ReportProgress$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReportProgress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReportProgress"));
    public static VarHandle ReportProgress$VH() {
        return IInternetProtocolSinkVtbl.ReportProgress$VH;
    }
    public static MemoryAddress ReportProgress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportProgress$VH.get(seg);
    }
    public static void ReportProgress$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportProgress$VH.set(seg, x);
    }
    public static MemoryAddress ReportProgress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportProgress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportProgress$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportProgress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReportProgress ReportProgress (MemorySegment segment, MemorySession session) {
        return ReportProgress.ofAddress(ReportProgress$get(segment), session);
    }
    static final FunctionDescriptor ReportData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReportData$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.ReportData$FUNC
    );
    public interface ReportData {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, int _x3);
        static MemorySegment allocate(ReportData fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReportData.class, fi, IInternetProtocolSinkVtbl.ReportData$FUNC, session);
        }
        static ReportData ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, int __x3) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.ReportData$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReportData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReportData"));
    public static VarHandle ReportData$VH() {
        return IInternetProtocolSinkVtbl.ReportData$VH;
    }
    public static MemoryAddress ReportData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportData$VH.get(seg);
    }
    public static void ReportData$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportData$VH.set(seg, x);
    }
    public static MemoryAddress ReportData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportData$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReportData ReportData (MemorySegment segment, MemorySession session) {
        return ReportData.ofAddress(ReportData$get(segment), session);
    }
    static final FunctionDescriptor ReportResult$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReportResult$MH = RuntimeHelper.downcallHandle(
        IInternetProtocolSinkVtbl.ReportResult$FUNC
    );
    public interface ReportResult {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(ReportResult fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ReportResult.class, fi, IInternetProtocolSinkVtbl.ReportResult$FUNC, session);
        }
        static ReportResult ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.ReportResult$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReportResult$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReportResult"));
    public static VarHandle ReportResult$VH() {
        return IInternetProtocolSinkVtbl.ReportResult$VH;
    }
    public static MemoryAddress ReportResult$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportResult$VH.get(seg);
    }
    public static void ReportResult$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportResult$VH.set(seg, x);
    }
    public static MemoryAddress ReportResult$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportResult$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportResult$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportResult$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReportResult ReportResult (MemorySegment segment, MemorySession session) {
        return ReportResult.ofAddress(ReportResult$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

