// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1116 {

    static final FunctionDescriptor IServiceProvider_QueryService_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IServiceProvider_QueryService_Stub$MH = RuntimeHelper.downcallHandle(
        "IServiceProvider_QueryService_Stub",
        constants$1116.IServiceProvider_QueryService_Stub$FUNC
    );
    static final  OfAddress __MIDL_itf_msxml_0000_0000_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_msxml_0000_0000_v0_0_c_ifspec$VH = constants$1116.__MIDL_itf_msxml_0000_0000_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_msxml_0000_0000_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_msxml_0000_0000_v0_0_c_ifspec", constants$1116.__MIDL_itf_msxml_0000_0000_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_msxml_0000_0000_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_msxml_0000_0000_v0_0_s_ifspec$VH = constants$1116.__MIDL_itf_msxml_0000_0000_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_msxml_0000_0000_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_msxml_0000_0000_v0_0_s_ifspec", constants$1116.__MIDL_itf_msxml_0000_0000_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout LIBID_MSXML$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment LIBID_MSXML$SEGMENT = RuntimeHelper.lookupGlobalVariable("LIBID_MSXML", constants$1116.LIBID_MSXML$LAYOUT);
    static final  GroupLayout IID_IXMLDOMImplementation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLDOMImplementation$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IXMLDOMImplementation", constants$1116.IID_IXMLDOMImplementation$LAYOUT);
    static final  GroupLayout IID_IXMLDOMNode$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLDOMNode$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IXMLDOMNode", constants$1116.IID_IXMLDOMNode$LAYOUT);
}

