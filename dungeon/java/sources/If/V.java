package If;

import java.util.Arrays;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5464h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f5470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V f5471g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public V() {
        this.f5465a = new byte[8192];
        this.f5469e = true;
        this.f5468d = false;
    }

    public V(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f5465a = data;
        this.f5466b = i10;
        this.f5467c = i11;
        this.f5468d = z10;
        this.f5469e = z11;
    }

    public final void a() {
        int i10;
        V v10 = this.f5471g;
        if (v10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.c(v10);
        if (v10.f5469e) {
            int i11 = this.f5467c - this.f5466b;
            V v11 = this.f5471g;
            Intrinsics.c(v11);
            int i12 = 8192 - v11.f5467c;
            V v12 = this.f5471g;
            Intrinsics.c(v12);
            if (v12.f5468d) {
                i10 = 0;
            } else {
                V v13 = this.f5471g;
                Intrinsics.c(v13);
                i10 = v13.f5466b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            V v14 = this.f5471g;
            Intrinsics.c(v14);
            g(v14, i11);
            b();
            W.b(this);
        }
    }

    public final V b() {
        V v10 = this.f5470f;
        if (v10 == this) {
            v10 = null;
        }
        V v11 = this.f5471g;
        Intrinsics.c(v11);
        v11.f5470f = this.f5470f;
        V v12 = this.f5470f;
        Intrinsics.c(v12);
        v12.f5471g = this.f5471g;
        this.f5470f = null;
        this.f5471g = null;
        return v10;
    }

    public final V c(V segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f5471g = this;
        segment.f5470f = this.f5470f;
        V v10 = this.f5470f;
        Intrinsics.c(v10);
        v10.f5471g = segment;
        this.f5470f = segment;
        return segment;
    }

    public final V d() {
        this.f5468d = true;
        return new V(this.f5465a, this.f5466b, this.f5467c, true, false);
    }

    public final V e(int i10) {
        V vC;
        if (i10 <= 0 || i10 > this.f5467c - this.f5466b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            vC = d();
        } else {
            vC = W.c();
            byte[] bArr = this.f5465a;
            byte[] bArr2 = vC.f5465a;
            int i11 = this.f5466b;
            AbstractC3952n.m(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        vC.f5467c = vC.f5466b + i10;
        this.f5466b += i10;
        V v10 = this.f5471g;
        Intrinsics.c(v10);
        v10.c(vC);
        return vC;
    }

    public final V f() {
        byte[] bArr = this.f5465a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new V(bArrCopyOf, this.f5466b, this.f5467c, false, true);
    }

    public final void g(V sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f5469e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f5467c;
        if (i11 + i10 > 8192) {
            if (sink.f5468d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f5466b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f5465a;
            AbstractC3952n.m(bArr, bArr, 0, i12, i11, 2, null);
            sink.f5467c -= sink.f5466b;
            sink.f5466b = 0;
        }
        byte[] bArr2 = this.f5465a;
        byte[] bArr3 = sink.f5465a;
        int i13 = sink.f5467c;
        int i14 = this.f5466b;
        AbstractC3952n.h(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f5467c += i10;
        this.f5466b += i10;
    }
}
