package M8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p188k8.a {
    public static final Parcelable.Creator<d> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f6989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f6990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f6991g;

    public d(String str, String str2, String str3, String str4, String str5, c cVar, c cVar2) {
        this.f6985a = str;
        this.f6986b = str2;
        this.f6987c = str3;
        this.f6988d = str4;
        this.f6989e = str5;
        this.f6990f = cVar;
        this.f6991g = cVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.u(parcel, 1, this.f6985a, false);
        p188k8.c.u(parcel, 2, this.f6986b, false);
        p188k8.c.u(parcel, 3, this.f6987c, false);
        p188k8.c.u(parcel, 4, this.f6988d, false);
        p188k8.c.u(parcel, 5, this.f6989e, false);
        p188k8.c.t(parcel, 6, this.f6990f, i10, false);
        p188k8.c.t(parcel, 7, this.f6991g, i10, false);
        p188k8.c.b(parcel, iA);
    }
}
