package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p170j8.r;
import p188k8.a;
import p296q8.c;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class DriveId extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DriveId> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f31958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f31959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f31960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f31961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile String f31962e = null;

    public DriveId(String str, long j10, long j11, int i10) {
        this.f31958a = str;
        boolean z10 = true;
        r.a(!"".equals(str));
        if (str == null && j10 == -1) {
            z10 = false;
            j10 = -1;
        }
        r.a(z10);
        this.f31959b = j10;
        this.f31960c = j11;
        this.f31961d = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f31960c != this.f31960c) {
                return false;
            }
            long j10 = driveId.f31959b;
            if (j10 == -1) {
                if (this.f31959b == -1) {
                    return ((String) r.l(driveId.f31958a)).equals(this.f31958a);
                }
                j10 = -1;
            }
            String str2 = this.f31958a;
            if (str2 != null && (str = driveId.f31958a) != null) {
                return j10 == this.f31959b && str.equals(str2);
            }
            if (j10 == this.f31959b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31959b;
        if (j10 == -1) {
            String str = this.f31958a;
            r.l(str);
            return str.hashCode();
        }
        long j11 = this.f31960c;
        String strValueOf = String.valueOf(j10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + String.valueOf(strValueOf).length());
        sb2.append(j11);
        sb2.append(strValueOf);
        return sb2.toString().hashCode();
    }

    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f31958a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 2, str, false);
        p188k8.c.r(parcel, 3, this.f31959b);
        p188k8.c.r(parcel, 4, this.f31960c);
        p188k8.c.n(parcel, 5, this.f31961d);
        p188k8.c.b(parcel, iA);
    }
}
