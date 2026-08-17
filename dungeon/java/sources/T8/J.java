package T8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends p188k8.a {
    public static final Parcelable.Creator<J> CREATOR = new K();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12349a;

    J(List list) {
        this.f12349a = list;
    }

    public static J a4(G... gArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(gArr[0].zza()));
        return new J(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f12349a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.p(parcel, 1, list, false);
        p188k8.c.b(parcel, iA);
    }
}
