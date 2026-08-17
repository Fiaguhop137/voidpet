package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p081e8.b;
import p081e8.y;
import p170j8.r;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInConfiguration extends p188k8.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f31648b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f31647a = r.f(str);
        this.f31648b = googleSignInOptions;
    }

    public final GoogleSignInOptions a4() {
        return this.f31648b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f31647a.equals(signInConfiguration.f31647a)) {
            GoogleSignInOptions googleSignInOptions = this.f31648b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f31648b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f31647a).a(this.f31648b).b();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31647a;
        int iA = c.a(parcel);
        c.u(parcel, 2, str, false);
        c.t(parcel, 5, this.f31648b, i10, false);
        c.b(parcel, iA);
    }
}
