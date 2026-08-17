package Q4;

import V4.n;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f9397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f9398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f9399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f9400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f9401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final P4.a f9402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P4.c f9403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final S4.b f9404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f9405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f9406l;

    class a implements n {
        a() {
        }

        @Override // V4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            V4.k.g(d.this.f9405k);
            return d.this.f9405k.getApplicationContext().getCacheDir();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f9410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f9412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f9413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f9414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private P4.a f9415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private P4.c f9416i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private S4.b f9417j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f9418k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Context f9419l;

        private b(Context context) {
            this.f9408a = 1;
            this.f9409b = "image_cache";
            this.f9411d = 41943040L;
            this.f9412e = 10485760L;
            this.f9413f = 2097152L;
            this.f9414g = new c();
            this.f9419l = context;
        }

        /* synthetic */ b(Context context, e eVar) {
            this(context);
        }

        public d n() {
            return new d(this);
        }
    }

    protected d(b bVar) {
        Context context = bVar.f9419l;
        this.f9405k = context;
        V4.k.j((bVar.f9410c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f9410c == null && context != null) {
            bVar.f9410c = new a();
        }
        this.f9395a = bVar.f9408a;
        this.f9396b = (String) V4.k.g(bVar.f9409b);
        this.f9397c = (n) V4.k.g(bVar.f9410c);
        this.f9398d = bVar.f9411d;
        this.f9399e = bVar.f9412e;
        this.f9400f = bVar.f9413f;
        this.f9401g = (j) V4.k.g(bVar.f9414g);
        this.f9402h = bVar.f9415h == null ? P4.g.b() : bVar.f9415h;
        this.f9403i = bVar.f9416i == null ? P4.h.i() : bVar.f9416i;
        this.f9404j = bVar.f9417j == null ? S4.c.b() : bVar.f9417j;
        this.f9406l = bVar.f9418k;
    }

    public static b m(Context context) {
        return new b(context, null);
    }

    public String b() {
        return this.f9396b;
    }

    public n c() {
        return this.f9397c;
    }

    public P4.a d() {
        return this.f9402h;
    }

    public P4.c e() {
        return this.f9403i;
    }

    public long f() {
        return this.f9398d;
    }

    public S4.b g() {
        return this.f9404j;
    }

    public j h() {
        return this.f9401g;
    }

    public boolean i() {
        return this.f9406l;
    }

    public long j() {
        return this.f9399e;
    }

    public long k() {
        return this.f9400f;
    }

    public int l() {
        return this.f9395a;
    }
}
