package p320re;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p033be.h;
import p464ze.c;

/* JADX INFO: renamed from: re.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4081f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f52519a;

    public C4081f(c fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f52519a = fqNameToMatch;
    }

    @Override // p033be.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4080e u(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.b(fqName, this.f52519a)) {
            return C4080e.f52517a;
        }
        return null;
    }

    @Override // p033be.h
    public boolean b1(c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // p033be.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return CollectionsKt.l().iterator();
    }
}
