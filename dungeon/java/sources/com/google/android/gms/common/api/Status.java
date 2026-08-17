package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C2333b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p135h8.k;
import p170j8.AbstractC3851p;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public final class Status extends p188k8.a implements k, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f31723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2333b f31724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f31713e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f31714f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f31715g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f31716h = new Status(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f31717i = new Status(15);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f31718j = new Status(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f31719k = new Status(17);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f31720l = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new b();

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }

    Status(int i10, String str, PendingIntent pendingIntent, C2333b c2333b) {
        this.f31721a = i10;
        this.f31722b = str;
        this.f31723c = pendingIntent;
        this.f31724d = c2333b;
    }

    public Status(C2333b c2333b, String str) {
        this(c2333b, str, 17);
    }

    public Status(C2333b c2333b, String str, int i10) {
        this(i10, str, c2333b.d4(), c2333b);
    }

    public C2333b a4() {
        return this.f31724d;
    }

    public PendingIntent b4() {
        return this.f31723c;
    }

    public int c4() {
        return this.f31721a;
    }

    public String d4() {
        return this.f31722b;
    }

    public boolean e4() {
        return this.f31723c != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f31721a == status.f31721a && AbstractC3851p.a(this.f31722b, status.f31722b) && AbstractC3851p.a(this.f31723c, status.f31723c) && AbstractC3851p.a(this.f31724d, status.f31724d);
    }

    public boolean f4() {
        return this.f31721a == 16;
    }

    public boolean g4() {
        return this.f31721a <= 0;
    }

    public int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f31721a), this.f31722b, this.f31723c, this.f31724d);
    }

    @Override // p135h8.k
    public Status t() {
        return this;
    }

    public String toString() {
        AbstractC3851p.a aVarC = AbstractC3851p.c(this);
        aVarC.a("statusCode", zza());
        aVarC.a("resolution", this.f31723c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, c4());
        c.u(parcel, 2, d4(), false);
        c.t(parcel, 3, this.f31723c, i10, false);
        c.t(parcel, 4, a4(), i10, false);
        c.b(parcel, iA);
    }

    public final String zza() {
        String str = this.f31722b;
        return str != null ? str : p135h8.c.a(this.f31721a);
    }
}
