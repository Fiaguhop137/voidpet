package U;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12621b;

    public v(String str) {
        this.f12620a = str;
    }

    public static /* synthetic */ void b(v vVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        vVar.a(i10);
    }

    public final void a(int i10) {
        this.f12621b += i10;
    }

    public final boolean c() {
        return this.f12621b >= this.f12620a.length();
    }

    public final char d() {
        return this.f12620a.charAt(this.f12621b);
    }

    public final void e(char c10) throws t {
        if (h(c10)) {
            return;
        }
        m("expected " + c10);
        throw new Ad.g();
    }

    public final String f() {
        return this.f12620a;
    }

    public final int g() {
        return this.f12621b;
    }

    public final boolean h(char c10) {
        return this.f12621b < this.f12620a.length() && this.f12620a.charAt(this.f12621b) == c10;
    }

    public final void i(String str) {
        while (this.f12621b < this.f12620a.length() && !StringsKt.T(str, this.f12620a.charAt(this.f12621b), false, 2, null)) {
            this.f12621b++;
        }
    }

    public final int j(String str) throws t {
        Integer intOrNull = StringsKt.toIntOrNull(k(str));
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        m("expected int");
        throw new Ad.g();
    }

    public final String k(String str) {
        int i10 = this.f12621b;
        i(str);
        int i11 = this.f12621b;
        if (i11 <= i10) {
            return "";
        }
        String strSubstring = this.f12620a.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String l() {
        String str = this.f12620a;
        String strSubstring = str.substring(this.f12621b, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final Void m(String str) throws t {
        int iMin = Math.min(this.f12621b, this.f12620a.length());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while parsing source information: ");
        sb2.append(str);
        sb2.append(" at ");
        String strSubstring = this.f12620a.substring(0, iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append('|');
        String strSubstring2 = this.f12620a.substring(iMin);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        throw new t(sb2.toString());
    }
}
