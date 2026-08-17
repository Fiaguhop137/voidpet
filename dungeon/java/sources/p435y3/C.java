package p435y3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f57778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f57779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f57780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f57781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f57782g;

    public C(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f57776a = str;
        this.f57777b = str2;
        this.f57778c = str3;
        this.f57779d = str4;
        this.f57780e = str5;
        this.f57781f = str6;
        this.f57782g = str7;
    }

    public final String a() {
        return this.f57779d;
    }

    public final String b() {
        return this.f57780e;
    }

    public final String c() {
        return this.f57778c;
    }

    public final String d() {
        return this.f57777b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && Intrinsics.b(((C) obj).f57776a, this.f57776a);
    }

    public int hashCode() {
        return this.f57776a.hashCode();
    }

    public String toString() {
        return this.f57776a;
    }
}
