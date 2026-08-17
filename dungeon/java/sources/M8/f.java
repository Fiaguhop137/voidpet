package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends p188k8.a {
    public static final Parcelable.Creator<f> CREATOR = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f7006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f7007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f7008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f7009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f7010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f7011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7012n;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f6999a = str;
        this.f7000b = str2;
        this.f7001c = str3;
        this.f7002d = str4;
        this.f7003e = str5;
        this.f7004f = str6;
        this.f7005g = str7;
        this.f7006h = str8;
        this.f7007i = str9;
        this.f7008j = str10;
        this.f7009k = str11;
        this.f7010l = str12;
        this.f7011m = str13;
        this.f7012n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, this.f6999a, false);
        p188k8.c.u(parcel, 2, this.f7000b, false);
        p188k8.c.u(parcel, 3, this.f7001c, false);
        p188k8.c.u(parcel, 4, this.f7002d, false);
        p188k8.c.u(parcel, 5, this.f7003e, false);
        p188k8.c.u(parcel, 6, this.f7004f, false);
        p188k8.c.u(parcel, 7, this.f7005g, false);
        p188k8.c.u(parcel, 8, this.f7006h, false);
        p188k8.c.u(parcel, 9, this.f7007i, false);
        p188k8.c.u(parcel, 10, this.f7008j, false);
        p188k8.c.u(parcel, 11, this.f7009k, false);
        p188k8.c.u(parcel, 12, this.f7010l, false);
        p188k8.c.u(parcel, 13, this.f7011m, false);
        p188k8.c.u(parcel, 14, this.f7012n, false);
        p188k8.c.b(parcel, iA);
    }
}
