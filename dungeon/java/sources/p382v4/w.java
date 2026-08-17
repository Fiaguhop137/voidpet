package p382v4;

import K4.c;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;

/* JADX INFO: loaded from: classes.dex */
public class w implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f56266a = new w();

    public static class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f56267a = new a();

        public static a a() {
            return f56267a;
        }

        @Override // p382v4.o
        public n d(r rVar) {
            return w.c();
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f56268a;

        b(Object obj) {
            this.f56268a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f56268a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public p274p4.a d() {
            return p274p4.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(h hVar, d.a aVar) {
            aVar.f(this.f56268a);
        }
    }

    public static w c() {
        return f56266a;
    }

    @Override // p382v4.n
    public n.a a(Object obj, int i10, int i11, p274p4.h hVar) {
        return new n.a(new c(obj), new b(obj));
    }

    @Override // p382v4.n
    public boolean b(Object obj) {
        return true;
    }
}
