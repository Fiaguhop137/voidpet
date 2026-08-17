package p170j8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p188k8.a;
import p188k8.c;

/* JADX INFO: renamed from: j8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3856v extends a {

    @NonNull
    public static final Parcelable.Creator<C3856v> CREATOR = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f47051b;

    public C3856v(int i10, List list) {
        this.f47050a = i10;
        this.f47051b = list;
    }

    public final int a4() {
        return this.f47050a;
    }

    public final List b4() {
        return this.f47051b;
    }

    public final void c4(C3850o c3850o) {
        if (this.f47051b == null) {
            this.f47051b = new ArrayList();
        }
        this.f47051b.add(c3850o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.f47050a);
        c.y(parcel, 2, this.f47051b, false);
        c.b(parcel, iA);
    }
}
