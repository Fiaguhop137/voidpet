package p128h1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f42507b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f42508a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f42509a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f42508a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return a(localeArr);
    }

    public static i d() {
        return i(b.b());
    }

    public static i e() {
        return f42507b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i10) {
        return this.f42508a.get(i10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f42508a.equals(((i) obj).f42508a);
    }

    public boolean f() {
        return this.f42508a.isEmpty();
    }

    public int g() {
        return this.f42508a.size();
    }

    public String h() {
        return this.f42508a.a();
    }

    public int hashCode() {
        return this.f42508a.hashCode();
    }

    public String toString() {
        return this.f42508a.toString();
    }
}
