package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends p188k8.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f31642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f31643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f31644c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f31643b = googleSignInAccount;
        this.f31642a = r.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f31644c = r.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount a4() {
        return this.f31643b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31642a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 4, str, false);
        p188k8.c.t(parcel, 7, this.f31643b, i10, false);
        p188k8.c.u(parcel, 8, this.f31644c, false);
        p188k8.c.b(parcel, iA);
    }
}
