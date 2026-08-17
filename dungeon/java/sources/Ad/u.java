package Ad;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f340c;

    public u(Object obj, Object obj2, Object obj3) {
        this.f338a = obj;
        this.f339b = obj2;
        this.f340c = obj3;
    }

    public final Object a() {
        return this.f338a;
    }

    public final Object b() {
        return this.f339b;
    }

    public final Object c() {
        return this.f340c;
    }

    public final Object d() {
        return this.f338a;
    }

    public final Object e() {
        return this.f339b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.b(this.f338a, uVar.f338a) && Intrinsics.b(this.f339b, uVar.f339b) && Intrinsics.b(this.f340c, uVar.f340c);
    }

    public final Object f() {
        return this.f340c;
    }

    public int hashCode() {
        Object obj = this.f338a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f339b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f340c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f338a + ", " + this.f339b + ", " + this.f340c + ')';
    }
}
