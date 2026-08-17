package p170j8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2333b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f46997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC3839d f46998h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(AbstractC3839d abstractC3839d, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC3839d, i10, bundle);
        Objects.requireNonNull(abstractC3839d);
        this.f46998h = abstractC3839d;
        this.f46997g = iBinder;
    }

    @Override // p170j8.Y
    protected final boolean e() {
        try {
            IBinder iBinder = this.f46997g;
            r.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC3839d abstractC3839d = this.f46998h;
            if (!abstractC3839d.E().equals(interfaceDescriptor)) {
                String strE = abstractC3839d.E();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strE).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(strE);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface iInterfaceS = abstractC3839d.s(this.f46997g);
            if (iInterfaceS == null || !(abstractC3839d.X(2, 4, iInterfaceS) || abstractC3839d.X(3, 4, iInterfaceS))) {
                return false;
            }
            abstractC3839d.g0(null);
            AbstractC3839d.a aVarD0 = abstractC3839d.d0();
            Bundle bundleX = abstractC3839d.x();
            if (aVarD0 == null) {
                return true;
            }
            abstractC3839d.d0().g(bundleX);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // p170j8.Y
    protected final void f(C2333b c2333b) {
        AbstractC3839d abstractC3839d = this.f46998h;
        if (abstractC3839d.e0() != null) {
            abstractC3839d.e0().k(c2333b);
        }
        abstractC3839d.L(c2333b);
    }
}
