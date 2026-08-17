package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1847c extends AbstractC1845b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21990d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21991e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C1847c f21992f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BreakIterator f21993c;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1847c a(Locale locale) {
            if (C1847c.f21992f == null) {
                C1847c.f21992f = new C1847c(locale, null);
            }
            C1847c c1847c = C1847c.f21992f;
            Intrinsics.d(c1847c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c1847c;
        }
    }

    private C1847c(Locale locale) {
        i(locale);
    }

    public /* synthetic */ C1847c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f21993c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1855g
    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f21993c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f21993c;
                if (breakIterator2 == null) {
                    Intrinsics.r("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f21993c;
            if (breakIterator3 == null) {
                Intrinsics.r("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f21993c;
            if (breakIterator == null) {
                Intrinsics.r("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f21993c;
                if (breakIterator2 == null) {
                    Intrinsics.r("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f21993c;
            if (breakIterator3 == null) {
                Intrinsics.r("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC1845b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f21993c;
        if (breakIterator == null) {
            Intrinsics.r("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}
