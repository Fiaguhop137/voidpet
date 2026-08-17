package p382v4;

import L4.k;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
public class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f56202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f56203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f56204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f56205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f56206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f56207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f56208h;

    public h(String str) {
        this(str, i.f56210b);
    }

    public h(String str, i iVar) {
        this.f56203c = null;
        this.f56204d = k.b(str);
        this.f56202b = (i) k.d(iVar);
    }

    public h(URL url) {
        this(url, i.f56210b);
    }

    public h(URL url, i iVar) {
        this.f56203c = (URL) k.d(url);
        this.f56204d = null;
        this.f56202b = (i) k.d(iVar);
    }

    private byte[] d() {
        if (this.f56207g == null) {
            this.f56207g = c().getBytes(f.f50778a);
        }
        return this.f56207g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f56205e)) {
            String string = this.f56204d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) k.d(this.f56203c)).toString();
            }
            this.f56205e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f56205e;
    }

    private URL g() {
        if (this.f56206f == null) {
            this.f56206f = new URL(f());
        }
        return this.f56206f;
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f56204d;
        return str != null ? str : ((URL) k.d(this.f56203c)).toString();
    }

    public Map e() {
        return this.f56202b.a();
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f56202b.equals(hVar.f56202b)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return f();
    }

    @Override // p274p4.f
    public int hashCode() {
        if (this.f56208h == 0) {
            int iHashCode = c().hashCode();
            this.f56208h = iHashCode;
            this.f56208h = (iHashCode * 31) + this.f56202b.hashCode();
        }
        return this.f56208h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }
}
