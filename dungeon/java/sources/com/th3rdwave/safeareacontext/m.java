package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f39392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f39393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f39394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f39395d;

    public m(l top, l right, l bottom, l left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.f39392a = top;
        this.f39393b = right;
        this.f39394c = bottom;
        this.f39395d = left;
    }

    public final l a() {
        return this.f39394c;
    }

    public final l b() {
        return this.f39395d;
    }

    public final l c() {
        return this.f39393b;
    }

    public final l d() {
        return this.f39392a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f39392a == mVar.f39392a && this.f39393b == mVar.f39393b && this.f39394c == mVar.f39394c && this.f39395d == mVar.f39395d;
    }

    public int hashCode() {
        return (((((this.f39392a.hashCode() * 31) + this.f39393b.hashCode()) * 31) + this.f39394c.hashCode()) * 31) + this.f39395d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f39392a + ", right=" + this.f39393b + ", bottom=" + this.f39394c + ", left=" + this.f39395d + ")";
    }
}
