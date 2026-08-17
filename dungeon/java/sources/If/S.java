package If;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1108j f5450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1106h f5451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f5452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5455f;

    public S(InterfaceC1108j upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f5450a = upstream;
        C1106h c1106hB = upstream.B();
        this.f5451b = c1106hB;
        V v10 = c1106hB.f5512a;
        this.f5452c = v10;
        this.f5453d = v10 != null ? v10.f5466b : -1;
    }

    @Override // If.a0
    public b0 C() {
        return this.f5450a.C();
    }

    @Override // If.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5454e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f5466b) goto L15;
     */
    @Override // If.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o0(If.C1106h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f5454e
            if (r3 != 0) goto L6c
            If.V r3 = r8.f5452c
            if (r3 == 0) goto L2b
            If.h r4 = r8.f5451b
            If.V r4 = r4.f5512a
            if (r3 != r4) goto L23
            int r3 = r8.f5453d
            kotlin.jvm.internal.Intrinsics.c(r4)
            int r4 = r4.f5466b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            If.j r0 = r8.f5450a
            long r1 = r8.f5455f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.u1(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            If.V r0 = r8.f5452c
            if (r0 != 0) goto L51
            If.h r0 = r8.f5451b
            If.V r0 = r0.f5512a
            if (r0 == 0) goto L51
            r8.f5452c = r0
            kotlin.jvm.internal.Intrinsics.c(r0)
            int r0 = r0.f5466b
            r8.f5453d = r0
        L51:
            If.h r0 = r8.f5451b
            long r0 = r0.size()
            long r2 = r8.f5455f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            If.h r2 = r8.f5451b
            long r4 = r8.f5455f
            r3 = r9
            r2.g(r3, r4, r6)
            long r9 = r8.f5455f
            long r9 = r9 + r6
            r8.f5455f = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: If.S.o0(If.h, long):long");
    }
}
