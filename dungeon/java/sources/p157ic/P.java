package p157ic;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public final class P implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f43877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f43879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f43880d;

    public P(d classifier, boolean z10, Function0 kTypeProvider) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(kTypeProvider, "kTypeProvider");
        this.f43877a = classifier;
        this.f43878b = z10;
        this.f43879c = kTypeProvider;
    }

    public /* synthetic */ P(d dVar, boolean z10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? false : z10, function0);
    }

    private final o m() {
        if (this.f43880d == null) {
            this.f43880d = (o) this.f43879c.invoke();
        }
        o oVar = this.f43880d;
        Intrinsics.c(oVar);
        return oVar;
    }

    @Override // kotlin.reflect.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d e() {
        return this.f43877a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return Intrinsics.b(m(), obj);
        }
        P p10 = (P) obj;
        return Intrinsics.b(e(), p10.e()) && l() == p10.l();
    }

    @Override // kotlin.reflect.b
    public List getAnnotations() {
        return m().getAnnotations();
    }

    public int hashCode() {
        return (e().hashCode() * 31) + Boolean.hashCode(l());
    }

    @Override // kotlin.reflect.o
    public List k() {
        return m().k();
    }

    @Override // kotlin.reflect.o
    public boolean l() {
        return this.f43878b;
    }

    public String toString() {
        return m().toString();
    }
}
