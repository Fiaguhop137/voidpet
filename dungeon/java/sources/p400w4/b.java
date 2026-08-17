package p400w4;

import K4.c;
import android.content.Context;
import android.net.Uri;
import p274p4.h;
import p382v4.n;
import p382v4.o;
import p382v4.r;

/* JADX INFO: loaded from: classes.dex */
public class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f56593a;

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f56594a;

        public a(Context context) {
            this.f56594a = context;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return new b(this.f56594a);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public b(Context context) {
        this.f56593a = context.getApplicationContext();
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, h hVar) {
        if (p292q4.b.e(i10, i11)) {
            return new n.a(new c(uri), p292q4.c.f(this.f56593a, uri));
        }
        return null;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return p292q4.b.b(uri);
    }
}
