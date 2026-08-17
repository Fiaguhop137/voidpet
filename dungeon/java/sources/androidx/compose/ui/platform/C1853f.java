package androidx.compose.ui.platform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1853f extends AbstractC1845b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22020c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22021d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static C1853f f22022e;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1853f a() {
            if (C1853f.f22022e == null) {
                C1853f.f22022e = new C1853f(null);
            }
            C1853f c1853f = C1853f.f22022e;
            Intrinsics.d(c1853f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c1853f;
        }
    }

    private C1853f() {
    }

    public /* synthetic */ C1853f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int i10) {
        if (i10 <= 0 || d().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == d().length() || d().charAt(i10) == '\n';
    }

    private final boolean j(int i10) {
        if (d().charAt(i10) != '\n') {
            return i10 == 0 || d().charAt(i10 - 1) == '\n';
        }
        return false;
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
        while (i10 < length && d().charAt(i10) == '\n' && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
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
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }
}
