package p146i1;

import android.util.Base64;
import java.util.List;
import p199l1.g;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f43522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f43523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f43524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f43525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f43526h;

    public f(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        this.f43519a = (String) g.g(str);
        this.f43520b = (String) g.g(str2);
        this.f43521c = (String) g.g(str3);
        this.f43522d = (List) g.g(list);
        this.f43523e = 0;
        this.f43524f = str4;
        this.f43525g = str5;
        this.f43526h = a(str, str2, str3, str4, str5);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f43522d;
    }

    public int c() {
        return this.f43523e;
    }

    String d() {
        return this.f43526h;
    }

    public String e() {
        return this.f43519a;
    }

    public String f() {
        return this.f43520b;
    }

    public String g() {
        return this.f43521c;
    }

    public String h() {
        return this.f43524f;
    }

    public String i() {
        return this.f43525g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f43519a + ", mProviderPackage: " + this.f43520b + ", mQuery: " + this.f43521c + ", mSystemFont: " + this.f43524f + ", mVariationSettings: " + this.f43525g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f43522d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f43522d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f43523e);
        return sb2.toString();
    }
}
