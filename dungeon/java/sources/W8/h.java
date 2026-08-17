package W8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends p188k8.a implements p135h8.k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14965b;

    public h(List list, String str) {
        this.f14964a = list;
        this.f14965b = str;
    }

    @Override // p135h8.k
    public final Status t() {
        return this.f14965b != null ? Status.f31714f : Status.f31718j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f14964a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.w(parcel, 1, list, false);
        p188k8.c.u(parcel, 2, this.f14965b, false);
        p188k8.c.b(parcel, iA);
    }
}
