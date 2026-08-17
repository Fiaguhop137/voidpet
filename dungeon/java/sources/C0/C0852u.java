package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0852u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0850t f1182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f1187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f1188g;

    public C0852u(InterfaceC0850t interfaceC0850t, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f1182a = interfaceC0850t;
        this.f1183b = i10;
        this.f1184c = i11;
        this.f1185d = i12;
        this.f1186e = i13;
        this.f1187f = f10;
        this.f1188g = f11;
    }

    public final float a() {
        return this.f1188g;
    }

    public final int b() {
        return this.f1184c;
    }

    public final int c() {
        return this.f1186e;
    }

    public final int d() {
        return this.f1184c - this.f1183b;
    }

    public final InterfaceC0850t e() {
        return this.f1182a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0852u)) {
            return false;
        }
        C0852u c0852u = (C0852u) obj;
        return Intrinsics.b(this.f1182a, c0852u.f1182a) && this.f1183b == c0852u.f1183b && this.f1184c == c0852u.f1184c && this.f1185d == c0852u.f1185d && this.f1186e == c0852u.f1186e && Float.compare(this.f1187f, c0852u.f1187f) == 0 && Float.compare(this.f1188g, c0852u.f1188g) == 0;
    }

    public final int f() {
        return this.f1183b;
    }

    public final int g() {
        return this.f1185d;
    }

    public final float h() {
        return this.f1187f;
    }

    public int hashCode() {
        return (((((((((((this.f1182a.hashCode() * 31) + Integer.hashCode(this.f1183b)) * 31) + Integer.hashCode(this.f1184c)) * 31) + Integer.hashCode(this.f1185d)) * 31) + Integer.hashCode(this.f1186e)) * 31) + Float.hashCode(this.f1187f)) * 31) + Float.hashCode(this.f1188g);
    }

    public final p019b0.g i(p019b0.g gVar) {
        float f10 = this.f1187f;
        return gVar.n(p019b0.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
    }

    public final int j(int i10) {
        return i10 + this.f1183b;
    }

    public final int k(int i10) {
        return i10 + this.f1185d;
    }

    public final float l(float f10) {
        return f10 + this.f1187f;
    }

    public final int m(int i10) {
        return kotlin.ranges.e.m(i10, this.f1183b, this.f1184c) - this.f1183b;
    }

    public final int n(int i10) {
        return i10 - this.f1185d;
    }

    public final float o(float f10) {
        return f10 - this.f1187f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f1182a + ", startIndex=" + this.f1183b + ", endIndex=" + this.f1184c + ", startLineIndex=" + this.f1185d + ", endLineIndex=" + this.f1186e + ", top=" + this.f1187f + ", bottom=" + this.f1188g + ')';
    }
}
