package p230me;

import Xd.o;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import p033be.c;
import p033be.h;
import p194ke.d;
import p302qe.InterfaceC4072a;
import p302qe.InterfaceC4075d;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f49276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4075d f49277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f49278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qe.h f49279d;

    public g(k c10, InterfaceC4075d annotationOwner, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f49276a = c10;
        this.f49277b = annotationOwner;
        this.f49278c = z10;
        this.f49279d = c10.a().u().g(new f(this));
    }

    public /* synthetic */ g(k kVar, InterfaceC4075d interfaceC4075d, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC4075d, (i10 & 4) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c c(g gVar, InterfaceC4072a annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        return d.f48093a.e(annotation, gVar.f49276a, gVar.f49278c);
    }

    @Override // p033be.h
    public boolean b1(p464ze.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // p033be.h
    public boolean isEmpty() {
        return this.f49277b.getAnnotations().isEmpty() && !this.f49277b.E();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return k.E(k.Q(k.N(CollectionsKt.Z(this.f49277b.getAnnotations()), this.f49279d), d.f48093a.a(o.a.f16444y, this.f49277b, this.f49276a))).iterator();
    }

    @Override // p033be.h
    public c u(p464ze.c fqName) {
        c cVar;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InterfaceC4072a interfaceC4072aU = this.f49277b.u(fqName);
        return (interfaceC4072aU == null || (cVar = (c) this.f49279d.invoke(interfaceC4072aU)) == null) ? d.f48093a.a(fqName, this.f49277b, this.f49276a) : cVar;
    }
}
