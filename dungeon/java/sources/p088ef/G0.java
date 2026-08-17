package p088ef;

import kotlin.jvm.internal.Intrinsics;
import p195kf.C3937o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G0 extends C3937o implements InterfaceC3286g0, InterfaceC3317w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f40757d;

    @Override // p088ef.InterfaceC3317w0
    public boolean a() {
        return true;
    }

    @Override // p088ef.InterfaceC3317w0
    public M0 b() {
        return null;
    }

    @Override // p088ef.InterfaceC3286g0
    public void dispose() {
        u().I0(this);
    }

    @Override // p195kf.C3937o
    public String toString() {
        return T.a(this) + '@' + T.b(this) + "[job@" + T.b(u()) + ']';
    }

    public final H0 u() {
        H0 h10 = this.f40757d;
        if (h10 != null) {
            return h10;
        }
        Intrinsics.r("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th);

    public final void x(H0 h10) {
        this.f40757d = h10;
    }
}
