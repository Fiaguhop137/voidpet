package p450z0;

import Ad.InterfaceC0795e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4362a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0795e f58237b;

    public C4362a(String str, InterfaceC0795e interfaceC0795e) {
        this.f58236a = str;
        this.f58237b = interfaceC0795e;
    }

    public final InterfaceC0795e a() {
        return this.f58237b;
    }

    public final String b() {
        return this.f58236a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4362a)) {
            return false;
        }
        C4362a c4362a = (C4362a) obj;
        return Intrinsics.b(this.f58236a, c4362a.f58236a) && Intrinsics.b(this.f58237b, c4362a.f58237b);
    }

    public int hashCode() {
        String str = this.f58236a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0795e interfaceC0795e = this.f58237b;
        return iHashCode + (interfaceC0795e != null ? interfaceC0795e.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f58236a + ", action=" + this.f58237b + ')';
    }
}
