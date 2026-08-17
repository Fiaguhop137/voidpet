package p033be;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f26545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f26547c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(h delegate, Function1 fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
    }

    public p(h delegate, boolean z10, Function1 fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f26545a = delegate;
        this.f26546b = z10;
        this.f26547c = fqNameFilter;
    }

    private final boolean a(c cVar) {
        c cVarF = cVar.f();
        return cVarF != null && ((Boolean) this.f26547c.invoke(cVarF)).booleanValue();
    }

    @Override // p033be.h
    public boolean b1(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f26547c.invoke(fqName)).booleanValue()) {
            return this.f26545a.b1(fqName);
        }
        return false;
    }

    @Override // p033be.h
    public boolean isEmpty() {
        boolean z10;
        h hVar = this.f26545a;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (a((c) it.next())) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (this.f26546b) {
            return !z10;
        }
        return z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        h hVar = this.f26545a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            if (a((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // p033be.h
    public c u(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (((Boolean) this.f26547c.invoke(fqName)).booleanValue()) {
            return this.f26545a.u(fqName);
        }
        return null;
    }
}
