package p310r4;

import M4.b;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import p274p4.a;
import p274p4.f;
import p382v4.n;

/* JADX INFO: loaded from: classes.dex */
class c implements f, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f52173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f52174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f52175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f52177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f52178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n.a f52180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f52181i;

    c(List list, g gVar, f.a aVar) {
        this.f52176d = -1;
        this.f52173a = list;
        this.f52174b = gVar;
        this.f52175c = aVar;
    }

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f52179g < this.f52178f.size();
    }

    @Override // p310r4.f
    public boolean a() {
        b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f52178f != null && b()) {
                    this.f52180h = null;
                    while (!z10 && b()) {
                        List list = this.f52178f;
                        int i10 = this.f52179g;
                        this.f52179g = i10 + 1;
                        this.f52180h = ((n) list.get(i10)).a(this.f52181i, this.f52174b.t(), this.f52174b.f(), this.f52174b.k());
                        if (this.f52180h != null && this.f52174b.u(this.f52180h.f56232c.a())) {
                            this.f52180h.f56232c.e(this.f52174b.l(), this);
                            z10 = true;
                        }
                    }
                    b.e();
                    return z10;
                }
                int i11 = this.f52176d + 1;
                this.f52176d = i11;
                if (i11 >= this.f52173a.size()) {
                    b.e();
                    return false;
                }
                f fVar = (f) this.f52173a.get(this.f52176d);
                File fileA = this.f52174b.d().a(new d(fVar, this.f52174b.p()));
                this.f52181i = fileA;
                if (fileA != null) {
                    this.f52177e = fVar;
                    this.f52178f = this.f52174b.j(fileA);
                    this.f52179g = 0;
                }
            } catch (Throwable th) {
                b.e();
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f52175c.g(this.f52177e, exc, this.f52180h.f56232c, a.DATA_DISK_CACHE);
    }

    @Override // p310r4.f
    public void cancel() {
        n.a aVar = this.f52180h;
        if (aVar != null) {
            aVar.f56232c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f52175c.e(this.f52177e, obj, this.f52180h.f56232c, a.DATA_DISK_CACHE, this.f52177e);
    }
}
