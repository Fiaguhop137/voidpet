package L3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f6312c;

    public d(f fVar) {
        this.f6312c = fVar;
    }

    @Override // L3.h
    public Object a(Ed.b bVar) {
        return this.f6312c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.b(this.f6312c, ((d) obj).f6312c);
    }

    public int hashCode() {
        return this.f6312c.hashCode();
    }

    public String toString() {
        return "RealSizeResolver(size=" + this.f6312c + ')';
    }
}
