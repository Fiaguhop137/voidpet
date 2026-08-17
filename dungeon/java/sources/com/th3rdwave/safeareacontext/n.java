package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f39396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f39397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f39398c;

    public n(a insets, o mode, m edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f39396a = insets;
        this.f39397b = mode;
        this.f39398c = edges;
    }

    public final m a() {
        return this.f39398c;
    }

    public final a b() {
        return this.f39396a;
    }

    public final o c() {
        return this.f39397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.b(this.f39396a, nVar.f39396a) && this.f39397b == nVar.f39397b && Intrinsics.b(this.f39398c, nVar.f39398c);
    }

    public int hashCode() {
        return (((this.f39396a.hashCode() * 31) + this.f39397b.hashCode()) * 31) + this.f39398c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f39396a + ", mode=" + this.f39397b + ", edges=" + this.f39398c + ")";
    }
}
