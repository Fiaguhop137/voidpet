package p157ic;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f43863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43864b;

    public D(d classifier, boolean z10) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f43863a = classifier;
        this.f43864b = z10;
    }

    @Override // kotlin.reflect.o
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d e() {
        return this.f43863a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return Intrinsics.b(e(), d10.e()) && l() == d10.l();
    }

    @Override // kotlin.reflect.b
    public List getAnnotations() {
        return CollectionsKt.l();
    }

    public int hashCode() {
        return (e().hashCode() * 31) + Boolean.hashCode(l());
    }

    @Override // kotlin.reflect.o
    public List k() {
        return CollectionsKt.l();
    }

    @Override // kotlin.reflect.o
    public boolean l() {
        return this.f43864b;
    }
}
