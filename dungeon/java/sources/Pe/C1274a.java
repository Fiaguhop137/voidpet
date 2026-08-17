package Pe;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1274a implements p033be.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f8935b = {kotlin.jvm.internal.F.j(new kotlin.jvm.internal.w(C1274a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qe.i f8936a;

    public C1274a(Qe.n storageManager, Function0 compute) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f8936a = storageManager.c(compute);
    }

    private final List a() {
        return (List) Qe.m.a(this.f8936a, this, f8935b[0]);
    }

    @Override // p033be.h
    public boolean b1(p464ze.c cVar) {
        return be.h.b.b(this, cVar);
    }

    @Override // p033be.h
    public boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return a().iterator();
    }

    @Override // p033be.h
    public p033be.c u(p464ze.c cVar) {
        return be.h.b.a(this, cVar);
    }
}
