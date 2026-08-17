package p170j8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C2335d;
import com.google.android.gms.common.api.Scope;
import p188k8.a;

/* JADX INFO: renamed from: j8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3842g extends a {

    @NonNull
    public static final Parcelable.Creator<C3842g> CREATOR = new q0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Scope[] f46961o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final C2335d[] f46962p = new C2335d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f46963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f46964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f46965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f46966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f46967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f46968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f46969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f46970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    C2335d[] f46971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    C2335d[] f46972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f46973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f46974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f46975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46976n;

    C3842g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2335d[] c2335dArr, C2335d[] c2335dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f46961o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c2335dArr = c2335dArr == null ? f46962p : c2335dArr;
        c2335dArr2 = c2335dArr2 == null ? f46962p : c2335dArr2;
        this.f46963a = i10;
        this.f46964b = i11;
        this.f46965c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f46966d = "com.google.android.gms";
        } else {
            this.f46966d = str;
        }
        if (i10 < 2) {
            this.f46970h = iBinder != null ? AbstractBinderC3834a.k(InterfaceC3846k.a.h(iBinder)) : null;
        } else {
            this.f46967e = iBinder;
            this.f46970h = account;
        }
        this.f46968f = scopeArr;
        this.f46969g = bundle;
        this.f46971i = c2335dArr;
        this.f46972j = c2335dArr2;
        this.f46973k = z10;
        this.f46974l = i13;
        this.f46975m = z11;
        this.f46976n = str2;
    }

    public String a4() {
        return this.f46976n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        q0.a(this, parcel, i10);
    }
}
