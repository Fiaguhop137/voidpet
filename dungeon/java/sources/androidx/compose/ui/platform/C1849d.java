package androidx.compose.ui.platform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1849d extends AbstractC1845b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C1849d f22005f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0.L0 f22008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22003d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22004e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final M0.h f22006g = M0.h.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final M0.h f22007h = M0.h.Ltr;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1849d a() {
            if (C1849d.f22005f == null) {
                C1849d.f22005f = new C1849d(null);
            }
            C1849d c1849d = C1849d.f22005f;
            Intrinsics.d(c1849d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c1849d;
        }
    }

    private C1849d() {
    }

    public /* synthetic */ C1849d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, M0.h hVar) {
        C0.L0 l10 = this.f22008c;
        C0.L0 l11 = null;
        if (l10 == null) {
            Intrinsics.r("layoutResult");
            l10 = null;
        }
        int iU = l10.u(i10);
        C0.L0 l12 = this.f22008c;
        if (l12 == null) {
            Intrinsics.r("layoutResult");
            l12 = null;
        }
        if (hVar != l12.x(iU)) {
            C0.L0 l13 = this.f22008c;
            if (l13 == null) {
                Intrinsics.r("layoutResult");
            } else {
                l11 = l13;
            }
            return l11.u(i10);
        }
        C0.L0 l14 = this.f22008c;
        if (l14 == null) {
            Intrinsics.r("layoutResult");
            l14 = null;
        }
        return C0.L0.p(l14, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1855g
    public int[] a(int i10) {
        int iQ;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            C0.L0 l10 = this.f22008c;
            if (l10 == null) {
                Intrinsics.r("layoutResult");
                l10 = null;
            }
            iQ = l10.q(0);
        } else {
            C0.L0 l11 = this.f22008c;
            if (l11 == null) {
                Intrinsics.r("layoutResult");
                l11 = null;
            }
            int iQ2 = l11.q(i10);
            iQ = i(iQ2, f22006g) == i10 ? iQ2 : iQ2 + 1;
        }
        C0.L0 l12 = this.f22008c;
        if (l12 == null) {
            Intrinsics.r("layoutResult");
            l12 = null;
        }
        if (iQ >= l12.n()) {
            return null;
        }
        return c(i(iQ, f22006g), i(iQ, f22007h) + 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1855g
    public int[] b(int i10) {
        int iQ;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            C0.L0 l10 = this.f22008c;
            if (l10 == null) {
                Intrinsics.r("layoutResult");
                l10 = null;
            }
            iQ = l10.q(d().length());
        } else {
            C0.L0 l11 = this.f22008c;
            if (l11 == null) {
                Intrinsics.r("layoutResult");
                l11 = null;
            }
            int iQ2 = l11.q(i10);
            iQ = i(iQ2, f22007h) + 1 == i10 ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f22006g), i(iQ, f22007h) + 1);
    }

    public final void j(String str, C0.L0 l10) {
        f(str);
        this.f22008c = l10;
    }
}
