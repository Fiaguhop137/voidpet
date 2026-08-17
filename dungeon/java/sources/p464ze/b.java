package p464ze;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f58558d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f58559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f58560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58561c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String string, boolean z10) {
            String strI;
            String str;
            Intrinsics.checkNotNullParameter(string, "string");
            int iG0 = StringsKt.g0(string, '`', 0, false, 6, null);
            if (iG0 == -1) {
                iG0 = string.length();
            }
            int iN0 = StringsKt.n0(string, "/", iG0, false, 4, null);
            if (iN0 == -1) {
                strI = StringsKt.I(string, "`", "", false, 4, null);
                str = "";
            } else {
                String strSubstring = string.substring(0, iN0);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strH = StringsKt.H(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = string.substring(iN0 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strI = StringsKt.I(strSubstring2, "`", "", false, 4, null);
                str = strH;
            }
            return new b(new c(str), new c(strI), z10);
        }

        public final b c(c topLevelFqName) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            return new b(topLevelFqName.d(), topLevelFqName.f());
        }
    }

    public b(c packageFqName, c relativeClassName, boolean z10) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(relativeClassName, "relativeClassName");
        this.f58559a = packageFqName;
        this.f58560b = relativeClassName;
        this.f58561c = z10;
        relativeClassName.c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c packageFqName, f topLevelName) {
        this(packageFqName, c.f58562c.a(topLevelName), false);
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(topLevelName, "topLevelName");
    }

    private static final String c(c cVar) {
        String strA = cVar.a();
        if (!StringsKt.T(strA, '/', false, 2, null)) {
            return strA;
        }
        return '`' + strA + '`';
    }

    public static final b k(c cVar) {
        return f58558d.c(cVar);
    }

    public final c a() {
        if (this.f58559a.c()) {
            return this.f58560b;
        }
        return new c(this.f58559a.a() + '.' + this.f58560b.a());
    }

    public final String b() {
        if (this.f58559a.c()) {
            return c(this.f58560b);
        }
        return StringsKt.H(this.f58559a.a(), '.', '/', false, 4, null) + "/" + c(this.f58560b);
    }

    public final b d(f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(this.f58559a, this.f58560b.b(name), this.f58561c);
    }

    public final b e() {
        c cVarD = this.f58560b.d();
        if (cVarD.c()) {
            return null;
        }
        return new b(this.f58559a, cVarD, this.f58561c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.b(this.f58559a, bVar.f58559a) && Intrinsics.b(this.f58560b, bVar.f58560b) && this.f58561c == bVar.f58561c;
    }

    public final c f() {
        return this.f58559a;
    }

    public final c g() {
        return this.f58560b;
    }

    public final f h() {
        return this.f58560b.f();
    }

    public int hashCode() {
        return (((this.f58559a.hashCode() * 31) + this.f58560b.hashCode()) * 31) + Boolean.hashCode(this.f58561c);
    }

    public final boolean i() {
        return this.f58561c;
    }

    public final boolean j() {
        return !this.f58560b.d().c();
    }

    public String toString() {
        if (!this.f58559a.c()) {
            return b();
        }
        return '/' + b();
    }
}
