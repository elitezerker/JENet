// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface PFE_IMPORT_FUNC {

    int apply(java.lang.foreign.MemoryAddress pbData, java.lang.foreign.MemoryAddress pvCallbackContext, java.lang.foreign.MemoryAddress ulLength);
    static MemorySegment allocate(PFE_IMPORT_FUNC fi, MemorySession session) {
        return RuntimeHelper.upcallStub(PFE_IMPORT_FUNC.class, fi, constants$315.PFE_IMPORT_FUNC$FUNC, session);
    }
    static PFE_IMPORT_FUNC ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pbData, java.lang.foreign.MemoryAddress _pvCallbackContext, java.lang.foreign.MemoryAddress _ulLength) -> {
            try {
                return (int)constants$315.PFE_IMPORT_FUNC$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pbData, (java.lang.foreign.Addressable)_pvCallbackContext, (java.lang.foreign.Addressable)_ulLength);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

