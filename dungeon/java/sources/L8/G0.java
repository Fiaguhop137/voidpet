package L8;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC2326t;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class G0 extends p135h8.e implements C0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final h8.a.g f6418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p135h8.a.AbstractC0496a f6419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p135h8.a f6420m;

    static {
        h8.a.g gVar = new h8.a.g();
        f6418k = gVar;
        D0 d10 = new D0();
        f6419l = d10;
        f6420m = new p135h8.a("GamesConnect.API", d10, gVar);
    }

    G0(Context context, v0 v0Var) {
        super(context, f6420m, v0Var, h8.e.a.f42660c);
    }

    @Override // L8.C0
    public final Task a(I0 i10, boolean z10) {
        AbstractC2326t abstractC2326tA = AbstractC2326t.a().b(new F0(this, i10)).e(6737).c(z10).a();
        return z10 ? k(abstractC2326tA) : g(abstractC2326tA);
    }
}
