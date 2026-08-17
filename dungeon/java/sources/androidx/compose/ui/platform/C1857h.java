package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1857h extends AbstractC1845b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22032d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22033e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C1857h f22034f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f22035c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1857h a(Locale locale) {
            if (C1857h.f22034f == null) {
                C1857h.f22034f = new C1857h(locale, null);
            }
            C1857h c1857h = C1857h.f22034f;
            Intrinsics.d(c1857h, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c1857h;
        }
    }

    private C1857h(Locale locale) {
        l(locale);
    }

    public /* synthetic */ C1857h(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || !j(i10 - 1)) {
            return false;
        }
        return i10 == d().length() || !j(i10);
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        if (j(i10)) {
            return i10 == 0 || !j(i10 - 1);
        }
        return false;
    }

    private final void l(Locale locale) {
        this.f22035c = BreakIterator.getWordInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1855g
    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f22035c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f22035c;
        if (breakIterator2 == null) {
            Intrinsics.r("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i10, iFollowing);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1855g
    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f22035c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f22035c;
        if (breakIterator2 == null) {
            Intrinsics.r("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i10);
    }

    @Override // androidx.compose.ui.platform.AbstractC1845b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f22035c;
        if (breakIterator == null) {
            Intrinsics.r("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
