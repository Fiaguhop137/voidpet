package p091f0;

import kotlin.jvm.internal.Intrinsics;
import p037c0.h0;
import p323s.P;
import p323s.c0;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3404a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3406c f41597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3406c f41598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P f41599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P f41600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41601e;

    public final boolean i(C3406c c3406c) {
        if (!this.f41601e) {
            h0.a("Only add dependencies during a tracking");
        }
        P p10 = this.f41599c;
        if (p10 != null) {
            Intrinsics.c(p10);
            p10.h(c3406c);
        } else if (this.f41597a != null) {
            P pB = c0.b();
            C3406c c3406c2 = this.f41597a;
            Intrinsics.c(c3406c2);
            pB.h(c3406c2);
            pB.h(c3406c);
            this.f41599c = pB;
            this.f41597a = null;
        } else {
            this.f41597a = c3406c;
        }
        P p11 = this.f41600d;
        if (p11 != null) {
            Intrinsics.c(p11);
            return !p11.y(c3406c);
        }
        if (this.f41598b != c3406c) {
            return true;
        }
        this.f41598b = null;
        return false;
    }
}
