package p135h8;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.b;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.AbstractC2311d;
import com.google.android.gms.common.api.internal.AbstractC2326t;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC2320m;
import com.google.android.gms.common.api.internal.C2308a;
import com.google.android.gms.common.api.internal.C2309b;
import com.google.android.gms.common.api.internal.C2314g;
import com.google.android.gms.common.api.internal.C2331y;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.common.api.internal.L;
import com.google.android.gms.common.api.internal.X;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import p170j8.AbstractC3839d;
import p170j8.C3840e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f42650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p135h8.a f42652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h8.a.d f42653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2309b f42654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f42655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f42656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f42657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r f42658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final C2314g f42659j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f42660c = new C0498a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f42661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f42662b;

        /* JADX INFO: renamed from: h8.e$a$a, reason: collision with other inner class name */
        public static class C0498a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private r f42663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f42664b;

            public a a() {
                if (this.f42663a == null) {
                    this.f42663a = new C2308a();
                }
                if (this.f42664b == null) {
                    this.f42664b = Looper.getMainLooper();
                }
                return new a(this.f42663a, null, this.f42664b, null);
            }

            public C0498a b(Looper looper) {
                p170j8.r.m(looper, "Looper must not be null.");
                this.f42664b = looper;
                return this;
            }

            public C0498a c(r rVar) {
                p170j8.r.m(rVar, "StatusExceptionMapper must not be null.");
                this.f42663a = rVar;
                return this;
            }
        }

        private a(r rVar, Account account, Looper looper) {
            this.f42661a = rVar;
            this.f42662b = looper;
        }

        /* synthetic */ a(r rVar, Account account, Looper looper, n nVar) {
            this(rVar, null, looper);
        }
    }

    public e(Activity activity, p135h8.a aVar, h8.a.d dVar, r rVar) {
        a.C0498a c0498a = new a.C0498a();
        c0498a.c(rVar);
        c0498a.b(activity.getMainLooper());
        this(activity, aVar, dVar, c0498a.a());
    }

    public e(Activity activity, p135h8.a aVar, h8.a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private e(Context context, Activity activity, p135h8.a aVar, h8.a.d dVar, a aVar2) {
        p170j8.r.m(context, "Null context is not permitted.");
        p170j8.r.m(aVar, "Api must not be null.");
        p170j8.r.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) p170j8.r.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f42650a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : l(context);
        this.f42651b = attributionTag;
        this.f42652c = aVar;
        this.f42653d = dVar;
        this.f42655f = aVar2.f42662b;
        C2309b c2309bA = C2309b.a(aVar, dVar, attributionTag);
        this.f42654e = c2309bA;
        this.f42657h = new L(this);
        C2314g c2314gU = C2314g.u(context2);
        this.f42659j = c2314gU;
        this.f42656g = c2314gU.l();
        this.f42658i = aVar2.f42661a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C2331y.j(activity, c2314gU, c2309bA);
        }
        c2314gU.F(this);
    }

    public e(Context context, p135h8.a aVar, h8.a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }

    private final AbstractC2311d u(int i10, AbstractC2311d abstractC2311d) {
        abstractC2311d.k();
        this.f42659j.A(this, i10, abstractC2311d);
        return abstractC2311d;
    }

    private final Task v(int i10, AbstractC2326t abstractC2326t) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f42659j.B(this, i10, abstractC2326t, taskCompletionSource, this.f42658i);
        return taskCompletionSource.getTask();
    }

    public f e() {
        return this.f42657h;
    }

    protected C3840e.a f() {
        C3840e.a aVar = new C3840e.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f42650a.getClass().getName());
        aVar.b(this.f42650a.getPackageName());
        return aVar;
    }

    public Task g(AbstractC2326t abstractC2326t) {
        return v(2, abstractC2326t);
    }

    public AbstractC2311d h(AbstractC2311d abstractC2311d) {
        u(0, abstractC2311d);
        return abstractC2311d;
    }

    public Task i(AbstractC2326t abstractC2326t) {
        return v(0, abstractC2326t);
    }

    public AbstractC2311d j(AbstractC2311d abstractC2311d) {
        u(1, abstractC2311d);
        return abstractC2311d;
    }

    public Task k(AbstractC2326t abstractC2326t) {
        return v(1, abstractC2326t);
    }

    protected String l(Context context) {
        return null;
    }

    public final C2309b m() {
        return this.f42654e;
    }

    public h8.a.d n() {
        return this.f42653d;
    }

    public Context o() {
        return this.f42650a;
    }

    protected String p() {
        return this.f42651b;
    }

    public Looper q() {
        return this.f42655f;
    }

    public final int r() {
        return this.f42656g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h8.a.f s(Looper looper, G g10) {
        C3840e c3840eA = f().a();
        h8.a.f fVarB = ((p135h8.a.AbstractC0496a) p170j8.r.l(this.f42652c.a())).b(this.f42650a, looper, c3840eA, this.f42653d, g10, g10);
        String strP = p();
        if (strP != null && (fVarB instanceof AbstractC3839d)) {
            ((AbstractC3839d) fVarB).P(strP);
        }
        if (strP == null || !(fVarB instanceof AbstractServiceConnectionC2320m)) {
            return fVarB;
        }
        b.a(fVarB);
        throw null;
    }

    public final X t(Context context, Handler handler) {
        return new X(context, handler, f().a());
    }
}
