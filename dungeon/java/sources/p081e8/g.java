package p081e8;

import Q1.a;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC2324q;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p135h8.f;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a implements InterfaceC2324q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Semaphore f40671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f40672p;

    public g(Context context, Set set) {
        super(context);
        this.f40671o = new Semaphore(0);
        this.f40672p = set;
    }

    @Override // Q1.a
    public final /* bridge */ /* synthetic */ Object C() {
        Iterator it = this.f40672p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((f) it.next()).e(this)) {
                i10++;
            }
        }
        try {
            this.f40671o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // Q1.b
    protected final void p() {
        this.f40671o.drainPermits();
        h();
    }
}
