// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$441 {

    static final FunctionDescriptor wglCreateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglCreateContext$MH = RuntimeHelper.downcallHandle(
        "wglCreateContext",
        constants$441.wglCreateContext$FUNC
    );
    static final FunctionDescriptor wglCreateLayerContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglCreateLayerContext$MH = RuntimeHelper.downcallHandle(
        "wglCreateLayerContext",
        constants$441.wglCreateLayerContext$FUNC
    );
    static final FunctionDescriptor wglDeleteContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglDeleteContext$MH = RuntimeHelper.downcallHandle(
        "wglDeleteContext",
        constants$441.wglDeleteContext$FUNC
    );
    static final FunctionDescriptor wglGetCurrentContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle wglGetCurrentContext$MH = RuntimeHelper.downcallHandle(
        "wglGetCurrentContext",
        constants$441.wglGetCurrentContext$FUNC
    );
    static final FunctionDescriptor wglGetCurrentDC$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle wglGetCurrentDC$MH = RuntimeHelper.downcallHandle(
        "wglGetCurrentDC",
        constants$441.wglGetCurrentDC$FUNC
    );
    static final FunctionDescriptor wglGetProcAddress$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglGetProcAddress$MH = RuntimeHelper.downcallHandle(
        "wglGetProcAddress",
        constants$441.wglGetProcAddress$FUNC
    );
}


