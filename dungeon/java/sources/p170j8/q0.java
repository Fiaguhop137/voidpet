package p170j8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.Scope;
import p188k8.b;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements Parcelable.Creator {
    static void a(C3842g c3842g, Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, c3842g.f46963a);
        c.n(parcel, 2, c3842g.f46964b);
        c.n(parcel, 3, c3842g.f46965c);
        c.u(parcel, 4, c3842g.f46966d, false);
        c.m(parcel, 5, c3842g.f46967e, false);
        c.x(parcel, 6, c3842g.f46968f, i10, false);
        c.f(parcel, 7, c3842g.f46969g, false);
        c.t(parcel, 8, c3842g.f46970h, i10, false);
        c.x(parcel, 10, c3842g.f46971i, i10, false);
        c.x(parcel, 11, c3842g.f46972j, i10, false);
        c.c(parcel, 12, c3842g.f46973k);
        c.n(parcel, 13, c3842g.f46974l);
        c.c(parcel, 14, c3842g.f46975m);
        c.u(parcel, 15, c3842g.a4(), false);
        c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = b.C(parcel);
        Scope[] scopeArr = C3842g.f46961o;
        Bundle bundle = new Bundle();
        C2335d[] c2335dArr = C3842g.f46962p;
        C2335d[] c2335dArr2 = c2335dArr;
        String strH = null;
        IBinder iBinderV = null;
        Account account = null;
        String strH2 = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        boolean zO = false;
        int iW4 = 0;
        boolean zO2 = false;
        while (parcel.dataPosition() < iC) {
            int iU = b.u(parcel);
            switch (b.n(iU)) {
                case 1:
                    iW = b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = b.w(parcel, iU);
                    break;
                case 3:
                    iW3 = b.w(parcel, iU);
                    break;
                case 4:
                    strH = b.h(parcel, iU);
                    break;
                case 5:
                    iBinderV = b.v(parcel, iU);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.k(parcel, iU, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.b(parcel, iU);
                    break;
                case 8:
                    account = (Account) b.g(parcel, iU, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.B(parcel, iU);
                    break;
                case 10:
                    c2335dArr = (C2335d[]) b.k(parcel, iU, C2335d.CREATOR);
                    break;
                case 11:
                    c2335dArr2 = (C2335d[]) b.k(parcel, iU, C2335d.CREATOR);
                    break;
                case 12:
                    zO = b.o(parcel, iU);
                    break;
                case 13:
                    iW4 = b.w(parcel, iU);
                    break;
                case 14:
                    zO2 = b.o(parcel, iU);
                    break;
                case 15:
                    strH2 = b.h(parcel, iU);
                    break;
            }
        }
        b.m(parcel, iC);
        return new C3842g(iW, iW2, iW3, strH, iBinderV, scopeArr, bundle, account, c2335dArr, c2335dArr2, zO, iW4, zO2, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3842g[i10];
    }
}
