// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$796 {

    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_KEY_AGREE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_KEY_AGREE$MH = RuntimeHelper.downcallHandle(
        constants$796.PFN_CMSG_CNG_IMPORT_KEY_AGREE$FUNC
    );
    static final FunctionDescriptor PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY$MH = RuntimeHelper.downcallHandle(
        constants$796.PFN_CMSG_CNG_IMPORT_CONTENT_ENCRYPT_KEY$FUNC
    );
    static final FunctionDescriptor CertOpenStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertOpenStore$MH = RuntimeHelper.downcallHandle(
        "CertOpenStore",
        constants$796.CertOpenStore$FUNC
    );
    static final FunctionDescriptor PFN_CERT_DLL_OPEN_STORE_PROV_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


