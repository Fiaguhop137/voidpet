package p135h8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import java.util.Set;
import p170j8.AbstractC3839d;
import p170j8.C3840e;
import p170j8.InterfaceC3846k;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0496a f42645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f42646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42647c;

    /* JADX INFO: renamed from: h8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0496a extends e {
        public f a(Context context, Looper looper, C3840e c3840e, Object obj, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        public f b(Context context, Looper looper, C3840e c3840e, Object obj, h8.f.a aVar, h8.f.b bVar) {
            return a(context, looper, c3840e, obj, aVar, bVar);
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* JADX INFO: renamed from: B1, reason: collision with root package name */
        public static final C0497a f42648B1 = new C0497a(null);

        /* JADX INFO: renamed from: h8.a$d$a, reason: collision with other inner class name */
        public static final class C0497a implements d {
            /* synthetic */ C0497a(m mVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        boolean a();

        void b(String str);

        boolean c();

        String d();

        boolean e();

        boolean f();

        void h(AbstractC3839d.c cVar);

        void i(InterfaceC3846k interfaceC3846k, Set set);

        Set j();

        void k();

        int m();

        void n(AbstractC3839d.e eVar);

        C2335d[] o();

        String p();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0496a abstractC0496a, g gVar) {
        r.m(abstractC0496a, "Cannot construct an Api with a null ClientBuilder");
        r.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f42647c = str;
        this.f42645a = abstractC0496a;
        this.f42646b = gVar;
    }

    public final AbstractC0496a a() {
        return this.f42645a;
    }

    public final c b() {
        return this.f42646b;
    }

    public final String c() {
        return this.f42647c;
    }
}
