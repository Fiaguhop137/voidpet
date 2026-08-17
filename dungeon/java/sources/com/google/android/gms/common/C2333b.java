package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p170j8.AbstractC3851p;

/* JADX INFO: renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2333b extends p188k8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f31873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f31875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2333b f31870f = new C2333b(0);

    @NonNull
    public static final Parcelable.Creator<C2333b> CREATOR = new C2352v();

    public C2333b(int i10) {
        this(i10, null, null);
    }

    C2333b(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f31871a = i10;
        this.f31872b = i11;
        this.f31873c = pendingIntent;
        this.f31874d = str;
        this.f31875e = num;
    }

    public C2333b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C2333b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }

    static String h4(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public Integer a4() {
        return this.f31875e;
    }

    public int b4() {
        return this.f31872b;
    }

    public String c4() {
        return this.f31874d;
    }

    public PendingIntent d4() {
        return this.f31873c;
    }

    public boolean e4() {
        return (this.f31872b == 0 || this.f31873c == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2333b)) {
            return false;
        }
        C2333b c2333b = (C2333b) obj;
        return this.f31872b == c2333b.f31872b && AbstractC3851p.a(this.f31873c, c2333b.f31873c) && AbstractC3851p.a(this.f31874d, c2333b.f31874d) && AbstractC3851p.a(this.f31875e, c2333b.f31875e);
    }

    public boolean f4() {
        return this.f31872b == 0;
    }

    public void g4(Activity activity, int i10) throws IntentSender.SendIntentException {
        if (e4()) {
            PendingIntent pendingIntent = this.f31873c;
            p170j8.r.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public int hashCode() {
        return AbstractC3851p.b(Integer.valueOf(this.f31872b), this.f31873c, this.f31874d, this.f31875e);
    }

    public String toString() {
        AbstractC3851p.a aVarC = AbstractC3851p.c(this);
        aVarC.a("statusCode", h4(this.f31872b));
        aVarC.a("resolution", this.f31873c);
        aVarC.a("message", this.f31874d);
        aVarC.a("clientMethodKey", this.f31875e);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f31871a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.n(parcel, 2, b4());
        p188k8.c.t(parcel, 3, d4(), i10, false);
        p188k8.c.u(parcel, 4, c4(), false);
        p188k8.c.q(parcel, 5, a4(), false);
        p188k8.c.b(parcel, iA);
    }
}
