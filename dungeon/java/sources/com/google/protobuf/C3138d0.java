package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3138d0 extends AbstractC3142h.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ByteBuffer f37892e;

    C3138d0(ByteBuffer byteBuffer) {
        A.b(byteBuffer, "buffer");
        this.f37892e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer I(int i10, int i11) {
        if (i10 < this.f37892e.position() || i11 > this.f37892e.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f37892e.slice();
        C.b(byteBufferSlice, i10 - this.f37892e.position());
        C.a(byteBufferSlice, i11 - this.f37892e.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.AbstractC3142h
    protected String B(Charset charset) {
        byte[] bArrX;
        int length;
        int iArrayOffset;
        if (this.f37892e.hasArray()) {
            bArrX = this.f37892e.array();
            iArrayOffset = this.f37892e.arrayOffset() + this.f37892e.position();
            length = this.f37892e.remaining();
        } else {
            bArrX = x();
            length = bArrX.length;
            iArrayOffset = 0;
        }
        return new String(bArrX, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.AbstractC3142h
    void H(AbstractC3141g abstractC3141g) {
        abstractC3141g.a(this.f37892e.slice());
    }

    @Override // com.google.protobuf.AbstractC3142h
    public ByteBuffer c() {
        return this.f37892e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC3142h
    public byte e(int i10) {
        try {
            return this.f37892e.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.AbstractC3142h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3142h)) {
            return false;
        }
        AbstractC3142h abstractC3142h = (AbstractC3142h) obj;
        if (size() != abstractC3142h.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof C3138d0 ? this.f37892e.equals(((C3138d0) obj).f37892e) : this.f37892e.equals(abstractC3142h.c());
    }

    @Override // com.google.protobuf.AbstractC3142h
    protected void l(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f37892e.slice();
        C.b(byteBufferSlice, i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.AbstractC3142h
    public byte n(int i10) {
        return e(i10);
    }

    @Override // com.google.protobuf.AbstractC3142h
    public boolean o() {
        return A0.r(this.f37892e);
    }

    @Override // com.google.protobuf.AbstractC3142h
    public AbstractC3143i s() {
        return AbstractC3143i.k(this.f37892e, true);
    }

    @Override // com.google.protobuf.AbstractC3142h
    public int size() {
        return this.f37892e.remaining();
    }

    @Override // com.google.protobuf.AbstractC3142h
    protected int t(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f37892e.get(i13);
        }
        return i10;
    }

    @Override // com.google.protobuf.AbstractC3142h
    public AbstractC3142h w(int i10, int i11) {
        try {
            return new C3138d0(I(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }
}
