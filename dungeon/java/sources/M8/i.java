package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends p188k8.a {
    public static final Parcelable.Creator<i> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7025g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7019a = str;
        this.f7020b = str2;
        this.f7021c = str3;
        this.f7022d = str4;
        this.f7023e = str5;
        this.f7024f = str6;
        this.f7025g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, this.f7019a, false);
        p188k8.c.u(parcel, 2, this.f7020b, false);
        p188k8.c.u(parcel, 3, this.f7021c, false);
        p188k8.c.u(parcel, 4, this.f7022d, false);
        p188k8.c.u(parcel, 5, this.f7023e, false);
        p188k8.c.u(parcel, 6, this.f7024f, false);
        p188k8.c.u(parcel, 7, this.f7025g, false);
        p188k8.c.b(parcel, iA);
    }
}
