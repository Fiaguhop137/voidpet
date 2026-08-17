package p009a8;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.AbstractBinderC2384k0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f19544b;

    g(String str, Bundle bundle) {
        this.f19543a = str;
        this.f19544b = bundle;
    }

    @Override // p009a8.h
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws a, IOException {
        Bundle bundleT = AbstractBinderC2384k0.h(iBinder).T(this.f19543a, this.f19544b);
        i.f(bundleT);
        String string = bundleT.getString("Error");
        if (bundleT.getBoolean("booleanResult")) {
            return null;
        }
        throw new a(string);
    }
}
