package Db;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Db.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0937a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f2261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2263c;

    public C0937a(Uri uri, int i10, int i11) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f2261a = uri;
        this.f2262b = i10;
        this.f2263c = i11;
    }

    @Override // Db.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Eb.f a() {
        return new Eb.f(this.f2261a, this.f2262b, this.f2263c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0937a)) {
            return false;
        }
        C0937a c0937a = (C0937a) obj;
        return Intrinsics.b(this.f2261a, c0937a.f2261a) && this.f2262b == c0937a.f2262b && this.f2263c == c0937a.f2263c;
    }

    public int hashCode() {
        return (((this.f2261a.hashCode() * 31) + Integer.hashCode(this.f2262b)) * 31) + Integer.hashCode(this.f2263c);
    }

    public String toString() {
        return "BlurhashModelProvider(uri=" + this.f2261a + ", width=" + this.f2262b + ", height=" + this.f2263c + ")";
    }
}
