package p287q;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f51024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f51025b;

    c(int i10, CharSequence charSequence) {
        this.f51024a = i10;
        this.f51025b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f51025b);
        String strA2 = a(charSequence);
        if (strA == null && strA2 == null) {
            return true;
        }
        return strA != null && strA.equals(strA2);
    }

    int b() {
        return this.f51024a;
    }

    CharSequence c() {
        return this.f51025b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f51024a == cVar.f51024a && d(cVar.f51025b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f51024a), a(this.f51025b)});
    }
}
