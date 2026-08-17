package com.facebook.imagepipeline.memory;

import Y4.k;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p079e6.v;
import p079e6.x;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f28944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Z4.a f28945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28946c;

    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public g(f pool, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.f28944a = pool;
        this.f28946c = 0;
        this.f28945b = Z4.a.x(pool.get(i10), pool);
    }

    public /* synthetic */ g(f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? fVar.D() : i10);
    }

    private final void b() {
        if (!Z4.a.r(this.f28945b)) {
            throw new a();
        }
    }

    public final void c(int i10) throws Throwable {
        b();
        Z4.a aVar = this.f28945b;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.c(aVar);
        if (i10 <= ((v) aVar.m()).a()) {
            return;
        }
        Object obj = this.f28944a.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        v vVar = (v) obj;
        Z4.a aVar2 = this.f28945b;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.c(aVar2);
        ((v) aVar2.m()).d(0, vVar, 0, this.f28946c);
        Z4.a aVar3 = this.f28945b;
        Intrinsics.c(aVar3);
        aVar3.close();
        this.f28945b = Z4.a.x(vVar, this.f28944a);
    }

    @Override // Y4.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Z4.a.g(this.f28945b);
        this.f28945b = null;
        this.f28946c = -1;
        super.close();
    }

    @Override // Y4.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public x a() {
        b();
        Z4.a aVar = this.f28945b;
        if (aVar != null) {
            return new x(aVar, this.f28946c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // Y4.k
    public int size() {
        return this.f28946c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws Throwable {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= buffer.length) {
            b();
            c(this.f28946c + i11);
            Z4.a aVar = this.f28945b;
            if (aVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((v) aVar.m()).c(this.f28946c, buffer, i10, i11);
            this.f28946c += i11;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
