package p382v4;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public class y implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f56274b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f56275a;

    public static class a implements o {
        @Override // p382v4.o
        public n d(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public y(n nVar) {
        this.f56275a = nVar;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, h hVar) {
        return this.f56275a.a(new h(uri.toString()), i10, i11, hVar);
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f56274b.contains(uri.getScheme());
    }
}
