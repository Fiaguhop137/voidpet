package p400w4;

import java.io.InputStream;
import java.net.URL;
import p382v4.h;
import p382v4.n;
import p382v4.o;
import p382v4.r;

/* JADX INFO: loaded from: classes.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56614a;

    public static class a implements o {
        @Override // p382v4.o
        public n d(r rVar) {
            return new g(rVar.d(h.class, InputStream.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public g(n nVar) {
        this.f56614a = nVar;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(URL url, int i10, int i11, p274p4.h hVar) {
        return this.f56614a.a(new h(url), i10, i11, hVar);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
