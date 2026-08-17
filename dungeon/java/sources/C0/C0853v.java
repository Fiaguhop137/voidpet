package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0853v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0854w f1189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1191c;

    public C0853v(InterfaceC0854w interfaceC0854w, int i10, int i11) {
        this.f1189a = interfaceC0854w;
        this.f1190b = i10;
        this.f1191c = i11;
    }

    public final int a() {
        return this.f1191c;
    }

    public final InterfaceC0854w b() {
        return this.f1189a;
    }

    public final int c() {
        return this.f1190b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0853v)) {
            return false;
        }
        C0853v c0853v = (C0853v) obj;
        return Intrinsics.b(this.f1189a, c0853v.f1189a) && this.f1190b == c0853v.f1190b && this.f1191c == c0853v.f1191c;
    }

    public int hashCode() {
        return (((this.f1189a.hashCode() * 31) + Integer.hashCode(this.f1190b)) * 31) + Integer.hashCode(this.f1191c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f1189a + ", startIndex=" + this.f1190b + ", endIndex=" + this.f1191c + ')';
    }
}
