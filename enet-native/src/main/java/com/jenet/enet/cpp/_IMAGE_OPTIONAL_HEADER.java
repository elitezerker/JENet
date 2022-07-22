// Generated by jextract

package com.jenet.enet.cpp;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_OPTIONAL_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Magic"),
        Constants$root.C_CHAR$LAYOUT.withName("MajorLinkerVersion"),
        Constants$root.C_CHAR$LAYOUT.withName("MinorLinkerVersion"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfCode"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfInitializedData"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfUninitializedData"),
        Constants$root.C_LONG$LAYOUT.withName("AddressOfEntryPoint"),
        Constants$root.C_LONG$LAYOUT.withName("BaseOfCode"),
        Constants$root.C_LONG$LAYOUT.withName("BaseOfData"),
        Constants$root.C_LONG$LAYOUT.withName("ImageBase"),
        Constants$root.C_LONG$LAYOUT.withName("SectionAlignment"),
        Constants$root.C_LONG$LAYOUT.withName("FileAlignment"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorOperatingSystemVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorOperatingSystemVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorImageVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorImageVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorSubsystemVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorSubsystemVersion"),
        Constants$root.C_LONG$LAYOUT.withName("Win32VersionValue"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfImage"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfHeaders"),
        Constants$root.C_LONG$LAYOUT.withName("CheckSum"),
        Constants$root.C_SHORT$LAYOUT.withName("Subsystem"),
        Constants$root.C_SHORT$LAYOUT.withName("DllCharacteristics"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfStackReserve"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfStackCommit"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfHeapReserve"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfHeapCommit"),
        Constants$root.C_LONG$LAYOUT.withName("LoaderFlags"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfRvaAndSizes"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Size")
        ).withName("_IMAGE_DATA_DIRECTORY")).withName("DataDirectory")
    ).withName("_IMAGE_OPTIONAL_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_OPTIONAL_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return _IMAGE_OPTIONAL_HEADER.Magic$VH;
    }
    public static short Magic$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.Magic$VH.get(seg);
    }
    public static void Magic$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.Magic$VH.set(seg, x);
    }
    public static short Magic$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.Magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorLinkerVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorLinkerVersion"));
    public static VarHandle MajorLinkerVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MajorLinkerVersion$VH;
    }
    public static byte MajorLinkerVersion$get(MemorySegment seg) {
        return (byte)_IMAGE_OPTIONAL_HEADER.MajorLinkerVersion$VH.get(seg);
    }
    public static void MajorLinkerVersion$set( MemorySegment seg, byte x) {
        _IMAGE_OPTIONAL_HEADER.MajorLinkerVersion$VH.set(seg, x);
    }
    public static byte MajorLinkerVersion$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OPTIONAL_HEADER.MajorLinkerVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorLinkerVersion$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OPTIONAL_HEADER.MajorLinkerVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorLinkerVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorLinkerVersion"));
    public static VarHandle MinorLinkerVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MinorLinkerVersion$VH;
    }
    public static byte MinorLinkerVersion$get(MemorySegment seg) {
        return (byte)_IMAGE_OPTIONAL_HEADER.MinorLinkerVersion$VH.get(seg);
    }
    public static void MinorLinkerVersion$set( MemorySegment seg, byte x) {
        _IMAGE_OPTIONAL_HEADER.MinorLinkerVersion$VH.set(seg, x);
    }
    public static byte MinorLinkerVersion$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OPTIONAL_HEADER.MinorLinkerVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorLinkerVersion$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OPTIONAL_HEADER.MinorLinkerVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfCode"));
    public static VarHandle SizeOfCode$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfCode$VH;
    }
    public static int SizeOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfCode$VH.get(seg);
    }
    public static void SizeOfCode$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfCode$VH.set(seg, x);
    }
    public static int SizeOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfInitializedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfInitializedData"));
    public static VarHandle SizeOfInitializedData$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfInitializedData$VH;
    }
    public static int SizeOfInitializedData$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfInitializedData$VH.get(seg);
    }
    public static void SizeOfInitializedData$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfInitializedData$VH.set(seg, x);
    }
    public static int SizeOfInitializedData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfInitializedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfInitializedData$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfInitializedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfUninitializedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfUninitializedData"));
    public static VarHandle SizeOfUninitializedData$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfUninitializedData$VH;
    }
    public static int SizeOfUninitializedData$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfUninitializedData$VH.get(seg);
    }
    public static void SizeOfUninitializedData$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfUninitializedData$VH.set(seg, x);
    }
    public static int SizeOfUninitializedData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfUninitializedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfUninitializedData$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfUninitializedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfEntryPoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfEntryPoint"));
    public static VarHandle AddressOfEntryPoint$VH() {
        return _IMAGE_OPTIONAL_HEADER.AddressOfEntryPoint$VH;
    }
    public static int AddressOfEntryPoint$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.AddressOfEntryPoint$VH.get(seg);
    }
    public static void AddressOfEntryPoint$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.AddressOfEntryPoint$VH.set(seg, x);
    }
    public static int AddressOfEntryPoint$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.AddressOfEntryPoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfEntryPoint$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.AddressOfEntryPoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseOfCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseOfCode"));
    public static VarHandle BaseOfCode$VH() {
        return _IMAGE_OPTIONAL_HEADER.BaseOfCode$VH;
    }
    public static int BaseOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.BaseOfCode$VH.get(seg);
    }
    public static void BaseOfCode$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.BaseOfCode$VH.set(seg, x);
    }
    public static int BaseOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.BaseOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.BaseOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseOfData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseOfData"));
    public static VarHandle BaseOfData$VH() {
        return _IMAGE_OPTIONAL_HEADER.BaseOfData$VH;
    }
    public static int BaseOfData$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.BaseOfData$VH.get(seg);
    }
    public static void BaseOfData$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.BaseOfData$VH.set(seg, x);
    }
    public static int BaseOfData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.BaseOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseOfData$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.BaseOfData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImageBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImageBase"));
    public static VarHandle ImageBase$VH() {
        return _IMAGE_OPTIONAL_HEADER.ImageBase$VH;
    }
    public static int ImageBase$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.ImageBase$VH.get(seg);
    }
    public static void ImageBase$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.ImageBase$VH.set(seg, x);
    }
    public static int ImageBase$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.ImageBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.ImageBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectionAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectionAlignment"));
    public static VarHandle SectionAlignment$VH() {
        return _IMAGE_OPTIONAL_HEADER.SectionAlignment$VH;
    }
    public static int SectionAlignment$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SectionAlignment$VH.get(seg);
    }
    public static void SectionAlignment$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SectionAlignment$VH.set(seg, x);
    }
    public static int SectionAlignment$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SectionAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectionAlignment$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SectionAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAlignment"));
    public static VarHandle FileAlignment$VH() {
        return _IMAGE_OPTIONAL_HEADER.FileAlignment$VH;
    }
    public static int FileAlignment$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.FileAlignment$VH.get(seg);
    }
    public static void FileAlignment$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.FileAlignment$VH.set(seg, x);
    }
    public static int FileAlignment$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.FileAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAlignment$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.FileAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorOperatingSystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorOperatingSystemVersion"));
    public static VarHandle MajorOperatingSystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MajorOperatingSystemVersion$VH;
    }
    public static short MajorOperatingSystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.MajorOperatingSystemVersion$VH.get(seg);
    }
    public static void MajorOperatingSystemVersion$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.MajorOperatingSystemVersion$VH.set(seg, x);
    }
    public static short MajorOperatingSystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.MajorOperatingSystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorOperatingSystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.MajorOperatingSystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorOperatingSystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorOperatingSystemVersion"));
    public static VarHandle MinorOperatingSystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MinorOperatingSystemVersion$VH;
    }
    public static short MinorOperatingSystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.MinorOperatingSystemVersion$VH.get(seg);
    }
    public static void MinorOperatingSystemVersion$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.MinorOperatingSystemVersion$VH.set(seg, x);
    }
    public static short MinorOperatingSystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.MinorOperatingSystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorOperatingSystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.MinorOperatingSystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorImageVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorImageVersion"));
    public static VarHandle MajorImageVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MajorImageVersion$VH;
    }
    public static short MajorImageVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.MajorImageVersion$VH.get(seg);
    }
    public static void MajorImageVersion$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.MajorImageVersion$VH.set(seg, x);
    }
    public static short MajorImageVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.MajorImageVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorImageVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.MajorImageVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorImageVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorImageVersion"));
    public static VarHandle MinorImageVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MinorImageVersion$VH;
    }
    public static short MinorImageVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.MinorImageVersion$VH.get(seg);
    }
    public static void MinorImageVersion$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.MinorImageVersion$VH.set(seg, x);
    }
    public static short MinorImageVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.MinorImageVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorImageVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.MinorImageVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorSubsystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorSubsystemVersion"));
    public static VarHandle MajorSubsystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MajorSubsystemVersion$VH;
    }
    public static short MajorSubsystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.MajorSubsystemVersion$VH.get(seg);
    }
    public static void MajorSubsystemVersion$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.MajorSubsystemVersion$VH.set(seg, x);
    }
    public static short MajorSubsystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.MajorSubsystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorSubsystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.MajorSubsystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorSubsystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorSubsystemVersion"));
    public static VarHandle MinorSubsystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER.MinorSubsystemVersion$VH;
    }
    public static short MinorSubsystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.MinorSubsystemVersion$VH.get(seg);
    }
    public static void MinorSubsystemVersion$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.MinorSubsystemVersion$VH.set(seg, x);
    }
    public static short MinorSubsystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.MinorSubsystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorSubsystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.MinorSubsystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Win32VersionValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Win32VersionValue"));
    public static VarHandle Win32VersionValue$VH() {
        return _IMAGE_OPTIONAL_HEADER.Win32VersionValue$VH;
    }
    public static int Win32VersionValue$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.Win32VersionValue$VH.get(seg);
    }
    public static void Win32VersionValue$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.Win32VersionValue$VH.set(seg, x);
    }
    public static int Win32VersionValue$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.Win32VersionValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Win32VersionValue$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.Win32VersionValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfImage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfImage"));
    public static VarHandle SizeOfImage$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfImage$VH;
    }
    public static int SizeOfImage$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfImage$VH.get(seg);
    }
    public static void SizeOfImage$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfImage$VH.set(seg, x);
    }
    public static int SizeOfImage$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfImage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfImage$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfImage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfHeaders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfHeaders"));
    public static VarHandle SizeOfHeaders$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfHeaders$VH;
    }
    public static int SizeOfHeaders$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfHeaders$VH.get(seg);
    }
    public static void SizeOfHeaders$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfHeaders$VH.set(seg, x);
    }
    public static int SizeOfHeaders$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfHeaders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfHeaders$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfHeaders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CheckSum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
    public static VarHandle CheckSum$VH() {
        return _IMAGE_OPTIONAL_HEADER.CheckSum$VH;
    }
    public static int CheckSum$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.CheckSum$VH.get(seg);
    }
    public static void CheckSum$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.CheckSum$VH.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.CheckSum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Subsystem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Subsystem"));
    public static VarHandle Subsystem$VH() {
        return _IMAGE_OPTIONAL_HEADER.Subsystem$VH;
    }
    public static short Subsystem$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.Subsystem$VH.get(seg);
    }
    public static void Subsystem$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.Subsystem$VH.set(seg, x);
    }
    public static short Subsystem$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.Subsystem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Subsystem$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.Subsystem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DllCharacteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DllCharacteristics"));
    public static VarHandle DllCharacteristics$VH() {
        return _IMAGE_OPTIONAL_HEADER.DllCharacteristics$VH;
    }
    public static short DllCharacteristics$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER.DllCharacteristics$VH.get(seg);
    }
    public static void DllCharacteristics$set( MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER.DllCharacteristics$VH.set(seg, x);
    }
    public static short DllCharacteristics$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER.DllCharacteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DllCharacteristics$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER.DllCharacteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfStackReserve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfStackReserve"));
    public static VarHandle SizeOfStackReserve$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfStackReserve$VH;
    }
    public static int SizeOfStackReserve$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfStackReserve$VH.get(seg);
    }
    public static void SizeOfStackReserve$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfStackReserve$VH.set(seg, x);
    }
    public static int SizeOfStackReserve$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfStackReserve$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfStackReserve$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfStackReserve$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfStackCommit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfStackCommit"));
    public static VarHandle SizeOfStackCommit$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfStackCommit$VH;
    }
    public static int SizeOfStackCommit$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfStackCommit$VH.get(seg);
    }
    public static void SizeOfStackCommit$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfStackCommit$VH.set(seg, x);
    }
    public static int SizeOfStackCommit$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfStackCommit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfStackCommit$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfStackCommit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfHeapReserve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfHeapReserve"));
    public static VarHandle SizeOfHeapReserve$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfHeapReserve$VH;
    }
    public static int SizeOfHeapReserve$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfHeapReserve$VH.get(seg);
    }
    public static void SizeOfHeapReserve$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfHeapReserve$VH.set(seg, x);
    }
    public static int SizeOfHeapReserve$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfHeapReserve$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfHeapReserve$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfHeapReserve$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfHeapCommit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfHeapCommit"));
    public static VarHandle SizeOfHeapCommit$VH() {
        return _IMAGE_OPTIONAL_HEADER.SizeOfHeapCommit$VH;
    }
    public static int SizeOfHeapCommit$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfHeapCommit$VH.get(seg);
    }
    public static void SizeOfHeapCommit$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfHeapCommit$VH.set(seg, x);
    }
    public static int SizeOfHeapCommit$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.SizeOfHeapCommit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfHeapCommit$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.SizeOfHeapCommit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LoaderFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LoaderFlags"));
    public static VarHandle LoaderFlags$VH() {
        return _IMAGE_OPTIONAL_HEADER.LoaderFlags$VH;
    }
    public static int LoaderFlags$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.LoaderFlags$VH.get(seg);
    }
    public static void LoaderFlags$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.LoaderFlags$VH.set(seg, x);
    }
    public static int LoaderFlags$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.LoaderFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LoaderFlags$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.LoaderFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRvaAndSizes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRvaAndSizes"));
    public static VarHandle NumberOfRvaAndSizes$VH() {
        return _IMAGE_OPTIONAL_HEADER.NumberOfRvaAndSizes$VH;
    }
    public static int NumberOfRvaAndSizes$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER.NumberOfRvaAndSizes$VH.get(seg);
    }
    public static void NumberOfRvaAndSizes$set( MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER.NumberOfRvaAndSizes$VH.set(seg, x);
    }
    public static int NumberOfRvaAndSizes$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER.NumberOfRvaAndSizes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRvaAndSizes$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER.NumberOfRvaAndSizes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DataDirectory$slice(MemorySegment seg) {
        return seg.asSlice(96, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

