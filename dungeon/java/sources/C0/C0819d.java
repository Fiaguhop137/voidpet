package C0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p323s.AbstractC4113m;

/* JADX INFO: renamed from: C0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0819d implements CharSequence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f1134e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final R.i f1135f = y0.L0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f1136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1139d;

    /* JADX INFO: renamed from: C0.d$a */
    public interface a {
    }

    /* JADX INFO: renamed from: C0.d$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: C0.d$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f1142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f1143d;

        public c(Object obj, int i10, int i11) {
            this(obj, i10, i11, "");
        }

        public c(Object obj, int i10, int i11, String str) {
            this.f1140a = obj;
            this.f1141b = i10;
            this.f1142c = i11;
            this.f1143d = str;
            if (i10 <= i11) {
                return;
            }
            H0.a.a("Reversed range is not supported");
        }

        public static /* synthetic */ c e(c cVar, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = cVar.f1140a;
            }
            if ((i12 & 2) != 0) {
                i10 = cVar.f1141b;
            }
            if ((i12 & 4) != 0) {
                i11 = cVar.f1142c;
            }
            if ((i12 & 8) != 0) {
                str = cVar.f1143d;
            }
            return cVar.d(obj, i10, i11, str);
        }

        public final Object a() {
            return this.f1140a;
        }

        public final int b() {
            return this.f1141b;
        }

        public final int c() {
            return this.f1142c;
        }

        public final c d(Object obj, int i10, int i11, String str) {
            return new c(obj, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f1140a, cVar.f1140a) && this.f1141b == cVar.f1141b && this.f1142c == cVar.f1142c && Intrinsics.b(this.f1143d, cVar.f1143d);
        }

        public final int f() {
            return this.f1142c;
        }

        public final Object g() {
            return this.f1140a;
        }

        public final int h() {
            return this.f1141b;
        }

        public int hashCode() {
            Object obj = this.f1140a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f1141b)) * 31) + Integer.hashCode(this.f1142c)) * 31) + this.f1143d.hashCode();
        }

        public final String i() {
            return this.f1143d;
        }

        public String toString() {
            return "Range(item=" + this.f1140a + ", start=" + this.f1141b + ", end=" + this.f1142c + ", tag=" + this.f1143d + ')';
        }
    }

    /* JADX INFO: renamed from: C0.d$d, reason: collision with other inner class name */
    public static final class C0026d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Cd.a.d(Integer.valueOf(((c) obj).h()), Integer.valueOf(((c) obj2).h()));
        }
    }

    public C0819d(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ C0819d(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.l() : list);
    }

    public C0819d(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f1136a = list;
        this.f1137b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) list.get(i10);
                if (cVar.g() instanceof G0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(cVar);
                } else if (cVar.g() instanceof C0857z) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.d(cVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f1138c = arrayList;
        this.f1139d = arrayList2;
        List listK0 = arrayList2 != null ? CollectionsKt.K0(arrayList2, new C0026d()) : null;
        if (listK0 == null || listK0.isEmpty()) {
            return;
        }
        p323s.E eB = AbstractC4113m.b(((c) CollectionsKt.j0(listK0)).f());
        int size2 = listK0.size();
        for (int i11 = 1; i11 < size2; i11++) {
            c cVar2 = (c) listK0.get(i11);
            while (eB.f52736b != 0) {
                int iE = eB.e();
                if (cVar2.h() < iE) {
                    if (!(cVar2.f() <= iE)) {
                        H0.a.a("Paragraph overlap not allowed, end " + cVar2.f() + " should be less than or equal to " + iE);
                        break;
                    }
                    break;
                }
                eB.j(eB.f52736b - 1);
            }
            eB.f(cVar2.f());
        }
    }

    public char a(int i10) {
        return this.f1137b.charAt(i10);
    }

    public final List b() {
        return this.f1136a;
    }

    public int c() {
        return this.f1137b.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List d(int i10, int i11) {
        List listL;
        List list = this.f1136a;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof AbstractC0829i) && AbstractC0823f.f(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = CollectionsKt.l();
        }
        Intrinsics.d(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listL;
    }

    public final List e() {
        return this.f1139d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0819d)) {
            return false;
        }
        C0819d c0819d = (C0819d) obj;
        return Intrinsics.b(this.f1137b, c0819d.f1137b) && Intrinsics.b(this.f1136a, c0819d.f1136a);
    }

    public final List f() {
        return this.f1138c;
    }

    public final String g() {
        return this.f1137b;
    }

    public final List h(int i10, int i11) {
        List listL;
        List list = this.f1136a;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof R0) && AbstractC0823f.f(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = CollectionsKt.l();
        }
        Intrinsics.d(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listL;
    }

    public int hashCode() {
        int iHashCode = this.f1137b.hashCode() * 31;
        List list = this.f1136a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final List i(int i10, int i11) {
        List listL;
        List list = this.f1136a;
        if (list != null) {
            listL = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                c cVar = (c) obj;
                if ((cVar.g() instanceof S0) && AbstractC0823f.f(i10, i11, cVar.h(), cVar.f())) {
                    listL.add(obj);
                }
            }
        } else {
            listL = CollectionsKt.l();
        }
        Intrinsics.d(listL, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listL;
    }

    public final boolean j(C0819d c0819d) {
        return Intrinsics.b(this.f1136a, c0819d.f1136a);
    }

    public final boolean k(int i10, int i11) {
        List list = this.f1136a;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = (c) list.get(i12);
                if ((cVar.g() instanceof AbstractC0829i) && AbstractC0823f.f(i10, i11, cVar.h(), cVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0819d subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            H0.a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        if (i10 == 0 && i11 == this.f1137b.length()) {
            return this;
        }
        String strSubstring = this.f1137b.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new C0819d(AbstractC0823f.d(this.f1136a, i10, i11), strSubstring);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final C0819d m(long j10) {
        return subSequence(N0.j(j10), N0.i(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1137b;
    }
}
