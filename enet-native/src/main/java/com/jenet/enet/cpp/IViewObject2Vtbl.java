// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IViewObject2Vtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Draw"),
        Constants$root.C_POINTER$LAYOUT.withName("GetColorSet"),
        Constants$root.C_POINTER$LAYOUT.withName("Freeze"),
        Constants$root.C_POINTER$LAYOUT.withName("Unfreeze"),
        Constants$root.C_POINTER$LAYOUT.withName("SetAdvise"),
        Constants$root.C_POINTER$LAYOUT.withName("GetAdvise"),
        Constants$root.C_POINTER$LAYOUT.withName("GetExtent")
    ).withName("IViewObject2Vtbl");
    public static MemoryLayout $LAYOUT() {
        return IViewObject2Vtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IViewObject2Vtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IViewObject2Vtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IViewObject2Vtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IViewObject2Vtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IViewObject2Vtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IViewObject2Vtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IViewObject2Vtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IViewObject2Vtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IViewObject2Vtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Draw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle Draw$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.Draw$FUNC
    );
    public interface Draw {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5, java.lang.foreign.MemoryAddress _x6, java.lang.foreign.MemoryAddress _x7, java.lang.foreign.MemoryAddress _x8, java.lang.foreign.MemoryAddress _x9, long _x10);
        static MemorySegment allocate(Draw fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Draw.class, fi, IViewObject2Vtbl.Draw$FUNC, session);
        }
        static Draw ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5, java.lang.foreign.MemoryAddress __x6, java.lang.foreign.MemoryAddress __x7, java.lang.foreign.MemoryAddress __x8, java.lang.foreign.MemoryAddress __x9, long __x10) -> {
                try {
                    return (int)IViewObject2Vtbl.Draw$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5, (java.lang.foreign.Addressable)__x6, (java.lang.foreign.Addressable)__x7, (java.lang.foreign.Addressable)__x8, (java.lang.foreign.Addressable)__x9, __x10);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Draw$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Draw"));
    public static VarHandle Draw$VH() {
        return IViewObject2Vtbl.Draw$VH;
    }
    public static MemoryAddress Draw$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Draw$VH.get(seg);
    }
    public static void Draw$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.Draw$VH.set(seg, x);
    }
    public static MemoryAddress Draw$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Draw$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Draw$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.Draw$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Draw Draw (MemorySegment segment, MemorySession session) {
        return Draw.ofAddress(Draw$get(segment), session);
    }
    static final FunctionDescriptor GetColorSet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetColorSet$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.GetColorSet$FUNC
    );
    public interface GetColorSet {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5, java.lang.foreign.MemoryAddress _x6);
        static MemorySegment allocate(GetColorSet fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetColorSet.class, fi, IViewObject2Vtbl.GetColorSet$FUNC, session);
        }
        static GetColorSet ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5, java.lang.foreign.MemoryAddress __x6) -> {
                try {
                    return (int)IViewObject2Vtbl.GetColorSet$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5, (java.lang.foreign.Addressable)__x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetColorSet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetColorSet"));
    public static VarHandle GetColorSet$VH() {
        return IViewObject2Vtbl.GetColorSet$VH;
    }
    public static MemoryAddress GetColorSet$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.GetColorSet$VH.get(seg);
    }
    public static void GetColorSet$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.GetColorSet$VH.set(seg, x);
    }
    public static MemoryAddress GetColorSet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.GetColorSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetColorSet$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.GetColorSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetColorSet GetColorSet (MemorySegment segment, MemorySession session) {
        return GetColorSet.ofAddress(GetColorSet$get(segment), session);
    }
    static final FunctionDescriptor Freeze$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Freeze$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.Freeze$FUNC
    );
    public interface Freeze {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(Freeze fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Freeze.class, fi, IViewObject2Vtbl.Freeze$FUNC, session);
        }
        static Freeze ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IViewObject2Vtbl.Freeze$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Freeze$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Freeze"));
    public static VarHandle Freeze$VH() {
        return IViewObject2Vtbl.Freeze$VH;
    }
    public static MemoryAddress Freeze$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Freeze$VH.get(seg);
    }
    public static void Freeze$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.Freeze$VH.set(seg, x);
    }
    public static MemoryAddress Freeze$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Freeze$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Freeze$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.Freeze$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Freeze Freeze (MemorySegment segment, MemorySession session) {
        return Freeze.ofAddress(Freeze$get(segment), session);
    }
    static final FunctionDescriptor Unfreeze$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Unfreeze$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.Unfreeze$FUNC
    );
    public interface Unfreeze {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Unfreeze fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Unfreeze.class, fi, IViewObject2Vtbl.Unfreeze$FUNC, session);
        }
        static Unfreeze ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IViewObject2Vtbl.Unfreeze$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Unfreeze$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unfreeze"));
    public static VarHandle Unfreeze$VH() {
        return IViewObject2Vtbl.Unfreeze$VH;
    }
    public static MemoryAddress Unfreeze$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Unfreeze$VH.get(seg);
    }
    public static void Unfreeze$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.Unfreeze$VH.set(seg, x);
    }
    public static MemoryAddress Unfreeze$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.Unfreeze$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unfreeze$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.Unfreeze$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unfreeze Unfreeze (MemorySegment segment, MemorySession session) {
        return Unfreeze.ofAddress(Unfreeze$get(segment), session);
    }
    static final FunctionDescriptor SetAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetAdvise$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.SetAdvise$FUNC
    );
    public interface SetAdvise {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(SetAdvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetAdvise.class, fi, IViewObject2Vtbl.SetAdvise$FUNC, session);
        }
        static SetAdvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IViewObject2Vtbl.SetAdvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetAdvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetAdvise"));
    public static VarHandle SetAdvise$VH() {
        return IViewObject2Vtbl.SetAdvise$VH;
    }
    public static MemoryAddress SetAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.SetAdvise$VH.get(seg);
    }
    public static void SetAdvise$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.SetAdvise$VH.set(seg, x);
    }
    public static MemoryAddress SetAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.SetAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.SetAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetAdvise SetAdvise (MemorySegment segment, MemorySession session) {
        return SetAdvise.ofAddress(SetAdvise$get(segment), session);
    }
    static final FunctionDescriptor GetAdvise$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAdvise$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.GetAdvise$FUNC
    );
    public interface GetAdvise {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(GetAdvise fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetAdvise.class, fi, IViewObject2Vtbl.GetAdvise$FUNC, session);
        }
        static GetAdvise ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IViewObject2Vtbl.GetAdvise$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetAdvise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetAdvise"));
    public static VarHandle GetAdvise$VH() {
        return IViewObject2Vtbl.GetAdvise$VH;
    }
    public static MemoryAddress GetAdvise$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.GetAdvise$VH.get(seg);
    }
    public static void GetAdvise$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.GetAdvise$VH.set(seg, x);
    }
    public static MemoryAddress GetAdvise$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.GetAdvise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetAdvise$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.GetAdvise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetAdvise GetAdvise (MemorySegment segment, MemorySession session) {
        return GetAdvise.ofAddress(GetAdvise$get(segment), session);
    }
    static final FunctionDescriptor GetExtent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExtent$MH = RuntimeHelper.downcallHandle(
        IViewObject2Vtbl.GetExtent$FUNC
    );
    public interface GetExtent {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(GetExtent fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetExtent.class, fi, IViewObject2Vtbl.GetExtent$FUNC, session);
        }
        static GetExtent ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)IViewObject2Vtbl.GetExtent$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetExtent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetExtent"));
    public static VarHandle GetExtent$VH() {
        return IViewObject2Vtbl.GetExtent$VH;
    }
    public static MemoryAddress GetExtent$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.GetExtent$VH.get(seg);
    }
    public static void GetExtent$set( MemorySegment seg, MemoryAddress x) {
        IViewObject2Vtbl.GetExtent$VH.set(seg, x);
    }
    public static MemoryAddress GetExtent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IViewObject2Vtbl.GetExtent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetExtent$set(MemorySegment seg, long index, MemoryAddress x) {
        IViewObject2Vtbl.GetExtent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetExtent GetExtent (MemorySegment segment, MemorySession session) {
        return GetExtent.ofAddress(GetExtent$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

