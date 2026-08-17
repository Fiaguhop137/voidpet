package p464ze;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f58566e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f58567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f58568g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f58570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient d f58571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient f f58572d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(f shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            String strG = shortName.g();
            Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
            return new d(strG, c.f58563d.i(), shortName, null);
        }
    }

    static {
        f fVarT = f.t("<root>");
        Intrinsics.checkNotNullExpressionValue(fVarT, "special(...)");
        f58567f = fVarT;
        Pattern patternCompile = Pattern.compile("\\.");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        f58568g = patternCompile;
    }

    public d(String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f58569a = fqName;
    }

    public d(String fqName, c safe) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(safe, "safe");
        this.f58569a = fqName;
        this.f58570b = safe;
    }

    private d(String str, d dVar, f fVar) {
        this.f58569a = str;
        this.f58571c = dVar;
        this.f58572d = fVar;
    }

    public /* synthetic */ d(String str, d dVar, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, fVar);
    }

    private final void c() {
        int iD = d(this.f58569a);
        if (iD < 0) {
            this.f58572d = f.o(this.f58569a);
            this.f58571c = c.f58563d.i();
            return;
        }
        String strSubstring = this.f58569a.substring(iD + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.f58572d = f.o(strSubstring);
        String strSubstring2 = this.f58569a.substring(0, iD);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        this.f58571c = new d(strSubstring2);
    }

    private final int d(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                return length;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List i(d dVar) {
        if (dVar.e()) {
            return new ArrayList();
        }
        List listI = i(dVar.g());
        listI.add(dVar.j());
        return listI;
    }

    public final String a() {
        return this.f58569a;
    }

    public final d b(f name) {
        String strG;
        Intrinsics.checkNotNullParameter(name, "name");
        if (e()) {
            strG = name.g();
        } else {
            strG = this.f58569a + '.' + name.g();
        }
        Intrinsics.c(strG);
        return new d(strG, this, name);
    }

    public final boolean e() {
        return this.f58569a.length() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.b(this.f58569a, ((d) obj).f58569a);
    }

    public final boolean f() {
        return this.f58570b != null || StringsKt.g0(a(), '<', 0, false, 6, null) < 0;
    }

    public final d g() {
        d dVar = this.f58571c;
        if (dVar != null) {
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        d dVar2 = this.f58571c;
        Intrinsics.c(dVar2);
        return dVar2;
    }

    public final List h() {
        return i(this);
    }

    public int hashCode() {
        return this.f58569a.hashCode();
    }

    public final f j() {
        f fVar = this.f58572d;
        if (fVar != null) {
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        f fVar2 = this.f58572d;
        Intrinsics.c(fVar2);
        return fVar2;
    }

    public final f k() {
        return e() ? f58567f : j();
    }

    public final boolean l(f segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (e()) {
            return false;
        }
        int iG0 = StringsKt.g0(this.f58569a, '.', 0, false, 6, null);
        if (iG0 == -1) {
            iG0 = this.f58569a.length();
        }
        int i10 = iG0;
        String strG = segment.g();
        Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
        return i10 == strG.length() && StringsKt.D(this.f58569a, 0, strG, 0, i10, false, 16, null);
    }

    public final c m() {
        c cVar = this.f58570b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f58570b = cVar2;
        return cVar2;
    }

    public String toString() {
        if (!e()) {
            return this.f58569a;
        }
        String strG = f58567f.g();
        Intrinsics.checkNotNullExpressionValue(strG, "asString(...)");
        return strG;
    }
}
