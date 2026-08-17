package p170j8;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C2341j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p135h8.a;
import p135h8.f;

/* JADX INFO: renamed from: j8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3843h extends AbstractC3839d implements a.f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final C3840e f46978F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Set f46979G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Account f46980H;

    protected AbstractC3843h(Context context, Looper looper, int i10, C3840e c3840e, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        this(context, looper, AbstractC3844i.b(context), C2341j.o(), i10, c3840e, (InterfaceC2313f) r.l(interfaceC2313f), (InterfaceC2321n) r.l(interfaceC2321n));
    }

    protected AbstractC3843h(Context context, Looper looper, int i10, C3840e c3840e, f.a aVar, f.b bVar) {
        this(context, looper, i10, c3840e, (InterfaceC2313f) aVar, (InterfaceC2321n) bVar);
    }

    protected AbstractC3843h(Context context, Looper looper, AbstractC3844i abstractC3844i, C2341j c2341j, int i10, C3840e c3840e, InterfaceC2313f interfaceC2313f, InterfaceC2321n interfaceC2321n) {
        super(context, looper, abstractC3844i, c2341j, i10, interfaceC2313f == null ? null : new H(interfaceC2313f), interfaceC2321n != null ? new I(interfaceC2321n) : null, c3840e.l());
        this.f46978F = c3840e;
        this.f46980H = c3840e.a();
        this.f46979G = l0(c3840e.d());
    }

    private final Set l0(Set set) {
        Set setK0 = k0(set);
        Iterator it = setK0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setK0;
    }

    @Override // p170j8.AbstractC3839d
    protected final Set C() {
        return this.f46979G;
    }

    @Override // h8.a.f
    public Set j() {
        return f() ? this.f46979G : Collections.EMPTY_SET;
    }

    protected final C3840e j0() {
        return this.f46978F;
    }

    protected Set k0(Set set) {
        return set;
    }

    @Override // p170j8.AbstractC3839d
    public final Account u() {
        return this.f46980H;
    }

    @Override // p170j8.AbstractC3839d
    protected Executor w() {
        return null;
    }
}
