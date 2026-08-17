package If;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1118u implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1108j f5559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f5560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5562d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1118u(a0 source, Inflater inflater) {
        this(K.d(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }

    public C1118u(InterfaceC1108j source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f5559a = source;
        this.f5560b = inflater;
    }

    private final void c() {
        int i10 = this.f5561c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f5560b.getRemaining();
        this.f5561c -= remaining;
        this.f5559a.skip(remaining);
    }

    @Override // If.a0
    public b0 C() {
        return this.f5559a.C();
    }

    public final long a(C1106h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f5562d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            V vS = sink.S(1);
            int iMin = (int) Math.min(j10, 8192 - vS.f5467c);
            b();
            int iInflate = this.f5560b.inflate(vS.f5465a, vS.f5467c, iMin);
            c();
            if (iInflate > 0) {
                vS.f5467c += iInflate;
                long j11 = iInflate;
                sink.K(sink.size() + j11);
                return j11;
            }
            if (vS.f5466b == vS.f5467c) {
                sink.f5512a = vS.b();
                W.b(vS);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f5560b.needsInput()) {
            return false;
        }
        if (this.f5559a.z2()) {
            return true;
        }
        V v10 = this.f5559a.B().f5512a;
        Intrinsics.c(v10);
        int i10 = v10.f5467c;
        int i11 = v10.f5466b;
        int i12 = i10 - i11;
        this.f5561c = i12;
        this.f5560b.setInput(v10.f5465a, i11, i12);
        return false;
    }

    @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5562d) {
            return;
        }
        this.f5560b.end();
        this.f5562d = true;
        this.f5559a.close();
    }

    @Override // If.a0
    public long o0(C1106h sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f5560b.finished() || this.f5560b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f5559a.z2());
        throw new EOFException("source exhausted prematurely");
    }
}
