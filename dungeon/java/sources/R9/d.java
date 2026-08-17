package R9;

import P9.f;
import P9.g;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Q9.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final P9.d f10899e = new R9.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f10900f = new R9.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f10901g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f10902h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10903a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10904b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P9.d f10905c = f10899e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10906d = false;

    class a implements P9.a {
        a() {
        }

        @Override // P9.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f10903a, d.this.f10904b, d.this.f10905c, d.this.f10906d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    private static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f10908a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f10908a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // P9.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.c(f10908a.format(date));
        }
    }

    public d() {
        m(String.class, f10900f);
        m(Boolean.class, f10901g);
        m(Date.class, f10902h);
    }

    public static /* synthetic */ void c(Object obj, P9.e eVar) {
        throw new P9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public P9.a i() {
        return new a();
    }

    public d j(Q9.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f10906d = z10;
        return this;
    }

    @Override // Q9.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, P9.d dVar) {
        this.f10903a.put(cls, dVar);
        this.f10904b.remove(cls);
        return this;
    }

    public d m(Class cls, f fVar) {
        this.f10904b.put(cls, fVar);
        this.f10903a.remove(cls);
        return this;
    }
}
