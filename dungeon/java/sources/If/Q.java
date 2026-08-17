package If;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5447b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5448c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1109k f5449a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Q d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ Q e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ Q f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final Q a(File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return b(string, z10);
        }

        public final Q b(String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return Jf.d.k(str, z10);
        }

        public final Q c(Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f5448c = separator;
    }

    public Q(C1109k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f5449a = bytes;
    }

    public static /* synthetic */ Q v(Q q10, Q q11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q10.t(q11, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(Q other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return g().compareTo(other.g());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Q) && Intrinsics.b(((Q) obj).g(), g());
    }

    public final C1109k g() {
        return this.f5449a;
    }

    public final Q h() {
        int iO = Jf.d.o(this);
        if (iO == -1) {
            return null;
        }
        return new Q(g().O(0, iO));
    }

    public int hashCode() {
        return g().hashCode();
    }

    public final List i() {
        ArrayList arrayList = new ArrayList();
        int iO = Jf.d.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < g().M() && g().r(iO) == 92) {
            iO++;
        }
        int iM = g().M();
        int i10 = iO;
        while (iO < iM) {
            if (g().r(iO) == 47 || g().r(iO) == 92) {
                arrayList.add(g().O(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < g().M()) {
            arrayList.add(g().O(i10, g().M()));
        }
        return arrayList;
    }

    public final boolean isAbsolute() {
        return Jf.d.o(this) != -1;
    }

    public final String o() {
        return p().S();
    }

    public final C1109k p() {
        int iL = Jf.d.l(this);
        if (iL != -1) {
            return C1109k.P(g(), iL + 1, 0, 2, null);
        }
        return (x() == null || g().M() != 2) ? g() : C1109k.f5524e;
    }

    public final Q r() {
        if (Intrinsics.b(g(), Jf.d.f5812d) || Intrinsics.b(g(), Jf.d.f5809a) || Intrinsics.b(g(), Jf.d.f5810b) || Jf.d.n(this)) {
            return null;
        }
        int iL = Jf.d.l(this);
        if (iL == 2 && x() != null) {
            if (g().M() == 3) {
                return null;
            }
            return new Q(C1109k.P(g(), 0, 3, 1, null));
        }
        if (iL == 1 && g().N(Jf.d.f5810b)) {
            return null;
        }
        if (iL != -1 || x() == null) {
            if (iL == -1) {
                return new Q(Jf.d.f5812d);
            }
            return iL == 0 ? new Q(C1109k.P(g(), 0, 1, 1, null)) : new Q(C1109k.P(g(), 0, iL, 1, null));
        }
        if (g().M() == 2) {
            return null;
        }
        return new Q(C1109k.P(g(), 0, 2, 1, null));
    }

    public final Q s(Q other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.b(h(), other.h())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listI = i();
        List listI2 = other.i();
        int iMin = Math.min(listI.size(), listI2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.b(listI.get(i10), listI2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && g().M() == other.g().M()) {
            return a.e(f5447b, ".", false, 1, null);
        }
        if (listI2.subList(i10, listI2.size()).indexOf(Jf.d.f5813e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.b(other.g(), Jf.d.f5812d)) {
            return this;
        }
        C1106h c1106h = new C1106h();
        C1109k c1109kM = Jf.d.m(other);
        if (c1109kM == null && (c1109kM = Jf.d.m(this)) == null) {
            c1109kM = Jf.d.s(f5448c);
        }
        int size = listI2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c1106h.C2(Jf.d.f5813e);
            c1106h.C2(c1109kM);
        }
        int size2 = listI.size();
        while (i10 < size2) {
            c1106h.C2((C1109k) listI.get(i10));
            c1106h.C2(c1109kM);
            i10++;
        }
        return Jf.d.q(c1106h, false);
    }

    public final Q t(Q child, boolean z10) {
        Intrinsics.checkNotNullParameter(child, "child");
        return Jf.d.j(this, child, z10);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return g().S();
    }

    public final Q u(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return Jf.d.j(this, Jf.d.q(new C1106h().Z0(child), false), false);
    }

    public final Path w() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character x() {
        if (C1109k.z(g(), Jf.d.f5809a, 0, 2, null) != -1 || g().M() < 2 || g().r(1) != 58) {
            return null;
        }
        char cR = (char) g().r(0);
        if (('a' > cR || cR >= '{') && ('A' > cR || cR >= '[')) {
            return null;
        }
        return Character.valueOf(cR);
    }
}
