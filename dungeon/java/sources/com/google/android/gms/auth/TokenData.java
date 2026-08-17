package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p170j8.AbstractC3851p;
import p170j8.r;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public class TokenData extends p188k8.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f31592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f31595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31596g;

    TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f31590a = i10;
        this.f31591b = r.f(str);
        this.f31592c = l10;
        this.f31593d = z10;
        this.f31594e = z11;
        this.f31595f = list;
        this.f31596g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f31591b, tokenData.f31591b) && AbstractC3851p.a(this.f31592c, tokenData.f31592c) && this.f31593d == tokenData.f31593d && this.f31594e == tokenData.f31594e && AbstractC3851p.a(this.f31595f, tokenData.f31595f) && AbstractC3851p.a(this.f31596g, tokenData.f31596g);
    }

    public final int hashCode() {
        return AbstractC3851p.b(this.f31591b, this.f31592c, Boolean.valueOf(this.f31593d), Boolean.valueOf(this.f31594e), this.f31595f, this.f31596g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f31590a);
        c.u(parcel, 2, this.f31591b, false);
        c.s(parcel, 3, this.f31592c, false);
        c.c(parcel, 4, this.f31593d);
        c.c(parcel, 5, this.f31594e);
        c.w(parcel, 6, this.f31595f, false);
        c.u(parcel, 7, this.f31596g, false);
        c.b(parcel, iA);
    }

    public final String zza() {
        return this.f31591b;
    }
}
