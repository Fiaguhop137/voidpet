package Q4;

import V4.n;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class h implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f9447f = h.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f9449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P4.a f9451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile a f9452e = new a(null, null);

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f9453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f9454b;

        a(File file, f fVar) {
            this.f9453a = fVar;
            this.f9454b = file;
        }
    }

    public h(int i10, n nVar, String str, P4.a aVar) {
        this.f9448a = i10;
        this.f9451d = aVar;
        this.f9449b = nVar;
        this.f9450c = str;
    }

    private void j() throws U4.c.a {
        File file = new File((File) this.f9449b.get(), this.f9450c);
        i(file);
        this.f9452e = new a(file, new Q4.a(file, this.f9448a, this.f9451d));
    }

    private boolean m() {
        File file;
        a aVar = this.f9452e;
        return aVar.f9453a == null || (file = aVar.f9454b) == null || !file.exists();
    }

    @Override // Q4.f
    public void a() {
        l().a();
    }

    @Override // Q4.f
    public void b() {
        try {
            l().b();
        } catch (IOException e10) {
            W4.a.j(f9447f, "purgeUnexpectedResources", e10);
        }
    }

    @Override // Q4.f
    public long c(f.a aVar) {
        return l().c(aVar);
    }

    @Override // Q4.f
    public boolean d(String str, Object obj) {
        return l().d(str, obj);
    }

    @Override // Q4.f
    public f.b e(String str, Object obj) {
        return l().e(str, obj);
    }

    @Override // Q4.f
    public boolean f(String str, Object obj) {
        return l().f(str, obj);
    }

    @Override // Q4.f
    public O4.a g(String str, Object obj) {
        return l().g(str, obj);
    }

    @Override // Q4.f
    public Collection h() {
        return l().h();
    }

    void i(File file) throws U4.c.a {
        try {
            U4.c.a(file);
            W4.a.a(f9447f, "Created cache directory %s", file.getAbsolutePath());
        } catch (U4.c.a e10) {
            this.f9451d.a(P4.a.EnumC0147a.WRITE_CREATE_DIR, f9447f, "createRootDirectoryIfNecessary", e10);
            throw e10;
        }
    }

    @Override // Q4.f
    public boolean isExternal() {
        try {
            return l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    void k() {
        if (this.f9452e.f9453a == null || this.f9452e.f9454b == null) {
            return;
        }
        U4.a.b(this.f9452e.f9454b);
    }

    synchronized f l() {
        try {
            if (m()) {
                k();
                j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) V4.k.g(this.f9452e.f9453a);
    }

    @Override // Q4.f
    public long remove(String str) {
        return l().remove(str);
    }
}
