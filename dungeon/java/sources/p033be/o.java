package p033be;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26544a;

    public o(List delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f26544a = delegates;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h... delegates) {
        this(AbstractC3952n.J0(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c e(c cVar, h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.u(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence g(h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.Z(it);
    }

    @Override // p033be.h
    public boolean b1(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = CollectionsKt.Z(this.f26544a).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).b1(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p033be.h
    public boolean isEmpty() {
        List list = this.f26544a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return k.H(CollectionsKt.Z(this.f26544a), n.f26543a).iterator();
    }

    @Override // p033be.h
    public c u(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (c) k.G(k.O(CollectionsKt.Z(this.f26544a), new m(fqName)));
    }
}
