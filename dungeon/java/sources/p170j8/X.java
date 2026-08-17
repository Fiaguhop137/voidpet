package p170j8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import p314r8.b;
import p314r8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final X f46898c = new X();

    private X() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) throws c.a {
        X x10 = f46898c;
        try {
            return (View) b.k(((K) x10.b(context)).d1(b.c1(context), new V(1, i10, i11, null)));
        } catch (Exception e10) {
            throw new c.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    @Override // p314r8.c
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof K ? (K) iInterfaceQueryLocalInterface : new K(iBinder);
    }
}
