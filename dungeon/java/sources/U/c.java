package U;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f12599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f12600b;

    public c(w wVar, Integer num) {
        this.f12599a = wVar;
        this.f12600b = num;
    }

    public static /* synthetic */ c b(c cVar, w wVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wVar = cVar.f12599a;
        }
        if ((i10 & 2) != 0) {
            num = cVar.f12600b;
        }
        return cVar.a(wVar, num);
    }

    public final c a(w wVar, Integer num) {
        return new c(wVar, num);
    }

    public final Integer c() {
        return this.f12600b;
    }

    public final w d() {
        return this.f12599a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.b(this.f12599a, cVar.f12599a) && Intrinsics.b(this.f12600b, cVar.f12600b);
    }

    public int hashCode() {
        int iHashCode = this.f12599a.hashCode() * 31;
        Integer num = this.f12600b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.f12599a + ", groupOffset=" + this.f12600b + ')';
    }
}
