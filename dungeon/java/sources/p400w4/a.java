package p400w4;

import com.bumptech.glide.load.data.j;
import p274p4.g;
import p382v4.h;
import p382v4.m;
import p382v4.n;
import p382v4.o;
import p382v4.r;

/* JADX INFO: loaded from: classes.dex */
public class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f56590b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f56591a;

    /* JADX INFO: renamed from: w4.a$a, reason: collision with other inner class name */
    public static class C0724a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f56592a = new m(500);

        @Override // p382v4.o
        public n d(r rVar) {
            return new a(this.f56592a);
        }

        @Override // p382v4.o
        public void e() {
        }
    }

    public a(m mVar) {
        this.f56591a = mVar;
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(h hVar, int i10, int i11, p274p4.h hVar2) {
        m mVar = this.f56591a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f56591a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.c(f56590b)).intValue()));
    }

    @Override // p382v4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(h hVar) {
        return true;
    }
}
