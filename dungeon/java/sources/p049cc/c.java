package p049cc;

import Ad.j;
import Rb.d;
import Rb.h;
import Rb.z;
import Yb.b;
import android.os.Bundle;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p085ec.a;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z f27412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f27413b = j.b(new b(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lazy f27414c;

    private final b k() {
        return (b) this.f27413b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b n(c cVar) {
        return cVar.f().j(cVar);
    }

    public static /* synthetic */ void r(c cVar, String str, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEvent");
        }
        if ((i10 & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        cVar.p(str, bundle);
    }

    @Override // p085ec.a
    public d f() {
        z zVar = this.f27412a;
        d dVarB = zVar != null ? zVar.b() : null;
        if (dVarB != null) {
            return dVarB;
        }
        throw new IllegalArgumentException("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
    }

    public a0 i() {
        return null;
    }

    public abstract e j();

    public final z l() {
        z zVar = this.f27412a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the runtime context.");
    }

    public final z m() {
        return this.f27412a;
    }

    public final void o(Enum r10, Bundle bundle) {
        Intrinsics.checkNotNullParameter(r10, "enum");
        b bVarK = k();
        if (bVarK != null) {
            bVarK.a(h.a(r10), bundle);
        }
    }

    public final void p(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        b bVarK = k();
        if (bVarK != null) {
            bVarK.a(name, bundle);
        }
    }

    public final void q(String name, Map body) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        b bVarK = k();
        if (bVarK != null) {
            bVarK.b(name, body);
        }
    }

    public final void s(Lazy lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.f27414c = lazy;
    }

    public final void t(z zVar) {
        this.f27412a = zVar;
    }
}
