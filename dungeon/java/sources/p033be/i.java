package p033be;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26535a;

    public i(List annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f26535a = annotations;
    }

    @Override // p033be.h
    public boolean b1(c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // p033be.h
    public boolean isEmpty() {
        return this.f26535a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f26535a.iterator();
    }

    public String toString() {
        return this.f26535a.toString();
    }

    @Override // p033be.h
    public c u(c cVar) {
        return h.b.a(this, cVar);
    }
}
