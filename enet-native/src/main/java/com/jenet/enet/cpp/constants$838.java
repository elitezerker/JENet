// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$838 {

    static final FunctionDescriptor PFN_CRYPT_ENUM_KEYID_PROP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ENUM_KEYID_PROP$MH = RuntimeHelper.downcallHandle(
        constants$838.PFN_CRYPT_ENUM_KEYID_PROP$FUNC
    );
    static final FunctionDescriptor CryptEnumKeyIdentifierProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumKeyIdentifierProperties$MH = RuntimeHelper.downcallHandle(
        "CryptEnumKeyIdentifierProperties",
        constants$838.CryptEnumKeyIdentifierProperties$FUNC
    );
    static final FunctionDescriptor CryptCreateKeyIdentifierFromCSP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCreateKeyIdentifierFromCSP$MH = RuntimeHelper.downcallHandle(
        "CryptCreateKeyIdentifierFromCSP",
        constants$838.CryptCreateKeyIdentifierFromCSP$FUNC
    );
    static final FunctionDescriptor CertCreateCertificateChainEngine$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCreateCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertCreateCertificateChainEngine",
        constants$838.CertCreateCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateChainEngine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChainEngine",
        constants$838.CertFreeCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertResyncCertificateChainEngine$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertResyncCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertResyncCertificateChainEngine",
        constants$838.CertResyncCertificateChainEngine$FUNC
    );
}


