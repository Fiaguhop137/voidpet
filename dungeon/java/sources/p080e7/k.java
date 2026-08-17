package p080e7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f40584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f40585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f40586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f40587d;

    public k() {
        this(new l(0.0f, 0.0f), new l(0.0f, 0.0f), new l(0.0f, 0.0f), new l(0.0f, 0.0f));
    }

    public k(l topLeft, l topRight, l bottomLeft, l bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.f40584a = topLeft;
        this.f40585b = topRight;
        this.f40586c = bottomLeft;
        this.f40587d = bottomRight;
    }

    public final l a() {
        return this.f40586c;
    }

    public final l b() {
        return this.f40587d;
    }

    public final l c() {
        return this.f40584a;
    }

    public final l d() {
        return this.f40585b;
    }

    public final boolean e() {
        return this.f40584a.a() > 0.0f || this.f40584a.b() > 0.0f || this.f40585b.a() > 0.0f || this.f40585b.b() > 0.0f || this.f40586c.a() > 0.0f || this.f40586c.b() > 0.0f || this.f40587d.a() > 0.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.b(this.f40584a, kVar.f40584a) && Intrinsics.b(this.f40585b, kVar.f40585b) && Intrinsics.b(this.f40586c, kVar.f40586c) && Intrinsics.b(this.f40587d, kVar.f40587d);
    }

    public final boolean f() {
        return Intrinsics.b(this.f40584a, this.f40585b) && Intrinsics.b(this.f40584a, this.f40586c) && Intrinsics.b(this.f40584a, this.f40587d);
    }

    public int hashCode() {
        return (((((this.f40584a.hashCode() * 31) + this.f40585b.hashCode()) * 31) + this.f40586c.hashCode()) * 31) + this.f40587d.hashCode();
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.f40584a + ", topRight=" + this.f40585b + ", bottomLeft=" + this.f40586c + ", bottomRight=" + this.f40587d + ")";
    }
}
