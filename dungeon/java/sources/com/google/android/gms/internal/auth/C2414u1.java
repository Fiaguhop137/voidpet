package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2414u1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f32461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2417v1 f32462b;

    C2414u1(C2417v1 c2417v1) {
        this.f32462b = c2417v1;
        this.f32461a = c2417v1.f32467a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32461a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f32461a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
