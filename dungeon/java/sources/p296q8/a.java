package p296q8;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.drive.DriveId;
import p188k8.c;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p188k8.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ParcelFileDescriptor f51609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f51610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f51611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final DriveId f51612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f51613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f51614f;

    public a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, DriveId driveId, boolean z10, String str) {
        this.f51609a = parcelFileDescriptor;
        this.f51610b = i10;
        this.f51611c = i11;
        this.f51612d = driveId;
        this.f51613e = z10;
        this.f51614f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor = this.f51609a;
        int iA = c.a(parcel);
        c.t(parcel, 2, parcelFileDescriptor, i10, false);
        c.n(parcel, 3, this.f51610b);
        c.n(parcel, 4, this.f51611c);
        c.t(parcel, 5, this.f51612d, i10, false);
        c.c(parcel, 7, this.f51613e);
        c.u(parcel, 8, this.f51614f, false);
        c.b(parcel, iA);
    }
}
