// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$825 {

    static final FunctionDescriptor CryptExportPublicKeyInfoFromBCryptKeyHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPublicKeyInfoFromBCryptKeyHandle$MH = RuntimeHelper.downcallHandle(
        "CryptExportPublicKeyInfoFromBCryptKeyHandle",
        constants$825.CryptExportPublicKeyInfoFromBCryptKeyHandle$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC$MH = RuntimeHelper.downcallHandle(
        constants$825.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC$FUNC
    );
    static final FunctionDescriptor CryptImportPublicKeyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        "CryptImportPublicKeyInfo",
        constants$825.CryptImportPublicKeyInfo$FUNC
    );
    static final FunctionDescriptor CryptImportPublicKeyInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPublicKeyInfoEx$MH = RuntimeHelper.downcallHandle(
        "CryptImportPublicKeyInfoEx",
        constants$825.CryptImportPublicKeyInfoEx$FUNC
    );
    static final FunctionDescriptor CryptImportPublicKeyInfoEx2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPublicKeyInfoEx2$MH = RuntimeHelper.downcallHandle(
        "CryptImportPublicKeyInfoEx2",
        constants$825.CryptImportPublicKeyInfoEx2$FUNC
    );
}


