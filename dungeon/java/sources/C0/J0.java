package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements C0819d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1092a;

    private /* synthetic */ J0(String str) {
        this.f1092a = str;
    }

    public static final /* synthetic */ J0 a(String str) {
        return new J0(str);
    }

    public static String b(String str) {
        return str;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof J0) && Intrinsics.b(str, ((J0) obj).f());
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f1092a, obj);
    }

    public final /* synthetic */ String f() {
        return this.f1092a;
    }

    public int hashCode() {
        return d(this.f1092a);
    }

    public String toString() {
        return e(this.f1092a);
    }
}
