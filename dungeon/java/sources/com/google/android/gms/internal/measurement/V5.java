package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class V5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f32753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ X5 f32754d;

    /* synthetic */ V5(X5 x10, byte[] bArr) {
        Objects.requireNonNull(x10);
        this.f32754d = x10;
        this.f32751a = -1;
    }

    private final Iterator a() {
        if (this.f32753c == null) {
            this.f32753c = this.f32754d.m().entrySet().iterator();
        }
        return this.f32753c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f32751a + 1;
        X5 x10 = this.f32754d;
        if (i10 >= x10.k()) {
            return !x10.m().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f32752b = true;
        int i10 = this.f32751a + 1;
        this.f32751a = i10;
        X5 x10 = this.f32754d;
        return i10 < x10.k() ? (U5) x10.i()[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f32752b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f32752b = false;
        X5 x10 = this.f32754d;
        x10.h();
        int i10 = this.f32751a;
        if (i10 >= x10.k()) {
            a().remove();
        } else {
            this.f32751a = i10 - 1;
            x10.g(i10);
        }
    }
}
