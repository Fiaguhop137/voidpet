package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2705j2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34234a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f34236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2725n2 f34237d;

    /* synthetic */ C2705j2(AbstractC2725n2 abstractC2725n2, AbstractC2700i2 abstractC2700i2) {
        this.f34237d = abstractC2725n2;
    }

    private final Iterator a() {
        if (this.f34236c == null) {
            this.f34236c = this.f34237d.f34249c.entrySet().iterator();
        }
        return this.f34236c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f34234a + 1;
        AbstractC2725n2 abstractC2725n2 = this.f34237d;
        if (i10 >= abstractC2725n2.f34248b) {
            return !abstractC2725n2.f34249c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f34235b = true;
        int i10 = this.f34234a + 1;
        this.f34234a = i10;
        AbstractC2725n2 abstractC2725n2 = this.f34237d;
        return i10 < abstractC2725n2.f34248b ? (C2695h2) abstractC2725n2.f34247a[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f34235b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f34235b = false;
        this.f34237d.r();
        int i10 = this.f34234a;
        AbstractC2725n2 abstractC2725n2 = this.f34237d;
        if (i10 >= abstractC2725n2.f34248b) {
            a().remove();
        } else {
            this.f34234a = i10 - 1;
            abstractC2725n2.p(i10);
        }
    }
}
