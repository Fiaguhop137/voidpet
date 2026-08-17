package G0;

import C0.C0819d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: G0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0819d f3757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3758b;

    public C1005a(C0819d c0819d, int i10) {
        this.f3757a = c0819d;
        this.f3758b = i10;
    }

    public C1005a(String str, int i10) {
        this(new C0819d(str, null, 2, null), i10);
    }

    public final String a() {
        return this.f3757a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005a)) {
            return false;
        }
        C1005a c1005a = (C1005a) obj;
        return Intrinsics.b(a(), c1005a.a()) && this.f3758b == c1005a.f3758b;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.f3758b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + a() + "', newCursorPosition=" + this.f3758b + ')';
    }
}
