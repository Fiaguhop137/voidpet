package p170j8;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f47021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47023e;

    public r0(ComponentName componentName, int i10) {
        this.f47019a = null;
        this.f47020b = null;
        r.l(componentName);
        this.f47021c = componentName;
        this.f47022d = 4225;
        this.f47023e = false;
    }

    public r0(String str, String str2, int i10, boolean z10) {
        r.f(str);
        this.f47019a = str;
        r.f(str2);
        this.f47020b = str2;
        this.f47021c = null;
        this.f47022d = 4225;
        this.f47023e = z10;
    }

    public final String a() {
        return this.f47019a;
    }

    public final String b() {
        return this.f47020b;
    }

    public final ComponentName c() {
        return this.f47021c;
    }

    public final boolean d() {
        return this.f47023e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return AbstractC3851p.a(this.f47019a, r0Var.f47019a) && AbstractC3851p.a(this.f47020b, r0Var.f47020b) && AbstractC3851p.a(this.f47021c, r0Var.f47021c) && this.f47023e == r0Var.f47023e;
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f47019a, this.f47020b, this.f47021c, 4225, Boolean.valueOf(this.f47023e));
    }

    public final String toString() {
        String str = this.f47019a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f47021c;
        r.l(componentName);
        return componentName.flattenToString();
    }
}
