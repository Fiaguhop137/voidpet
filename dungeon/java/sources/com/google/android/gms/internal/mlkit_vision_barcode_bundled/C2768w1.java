package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2768w1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f34334a;

    public C2768w1(Iterator it) {
        this.f34334a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34334a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f34334a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f34334a.remove();
    }
}
