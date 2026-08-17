package X3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f15278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f15279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f15280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f15281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f15282f;

    public d(List list, char c10, double d10, double d11, String str, String str2) {
        this.f15277a = list;
        this.f15278b = c10;
        this.f15279c = d10;
        this.f15280d = d11;
        this.f15281e = str;
        this.f15282f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f15277a;
    }

    public double b() {
        return this.f15280d;
    }

    public int hashCode() {
        return c(this.f15278b, this.f15282f, this.f15281e);
    }
}
