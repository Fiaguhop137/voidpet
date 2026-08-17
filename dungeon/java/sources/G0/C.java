package G0;

import C0.C0819d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class C implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0819d f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3723b;

    public C(C0819d c0819d, int i10) {
        this.f3722a = c0819d;
        this.f3723b = i10;
    }

    public C(String str, int i10) {
        this(new C0819d(str, null, 2, null), i10);
    }

    public final String a() {
        return this.f3722a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return Intrinsics.b(a(), c10.a()) && this.f3723b == c10.f3723b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f3723b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + a() + "', newCursorPosition=" + this.f3723b + ')';
    }
}
