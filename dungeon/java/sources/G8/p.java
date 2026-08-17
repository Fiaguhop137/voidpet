package G8;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.C2342k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2326t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends p135h8.e implements AppSetIdClient {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final h8.a.g f3962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p135h8.a.AbstractC0496a f3963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final p135h8.a f3964o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f3965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C2342k f3966l;

    static {
        h8.a.g gVar = new h8.a.g();
        f3962m = gVar;
        n nVar = new n();
        f3963n = nVar;
        f3964o = new p135h8.a("AppSet.API", nVar, gVar);
    }

    p(Context context, C2342k c2342k) {
        super(context, f3964o, h8.a.d.f42648B1, h8.e.a.f42660c);
        this.f3965k = context;
        this.f3966l = c2342k;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        return this.f3966l.h(this.f3965k, 212800000) == 0 ? i(AbstractC2326t.a().d(zze.zza).b(new m(this)).c(false).e(27601).a()) : Tasks.forException(new p135h8.b(new Status(17)));
    }
}
