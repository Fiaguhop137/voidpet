package io.sentry.android.replay.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p037c0.Z;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f45590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45591b;

    private p(Z z10, boolean z11) {
        this.f45590a = z10;
        this.f45591b = z11;
    }

    public /* synthetic */ p(Z z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    public final Z a() {
        return this.f45590a;
    }

    public final boolean b() {
        return this.f45591b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.b(this.f45590a, pVar.f45590a) && this.f45591b == pVar.f45591b;
    }

    public int hashCode() {
        Z z10 = this.f45590a;
        return ((z10 == null ? 0 : Z.s(z10.u())) * 31) + Boolean.hashCode(this.f45591b);
    }

    public String toString() {
        return "TextAttributes(color=" + this.f45590a + ", hasFillModifier=" + this.f45591b + ')';
    }
}
