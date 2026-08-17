package Re;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Re.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1413s extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p033be.h f11159a;

    public C1413s(p033be.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.f11159a = annotations;
    }

    @Override // Re.p0
    public kotlin.reflect.d b() {
        return kotlin.jvm.internal.F.b(C1413s.class);
    }

    @Override // Re.p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1413s a(C1413s c1413s) {
        return c1413s == null ? this : new C1413s(p033be.j.a(this.f11159a, c1413s.f11159a));
    }

    public final p033be.h e() {
        return this.f11159a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1413s) {
            return Intrinsics.b(((C1413s) obj).f11159a, this.f11159a);
        }
        return false;
    }

    @Override // Re.p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1413s c(C1413s c1413s) {
        if (Intrinsics.b(c1413s, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f11159a.hashCode();
    }
}
