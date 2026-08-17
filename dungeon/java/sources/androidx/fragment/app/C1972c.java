package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1972c implements Parcelable {
    public static final Parcelable.Creator<C1972c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f23933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f23934b;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1972c createFromParcel(Parcel parcel) {
            return new C1972c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1972c[] newArray(int i10) {
            return new C1972c[i10];
        }
    }

    C1972c(Parcel parcel) {
        this.f23933a = parcel.createStringArrayList();
        this.f23934b = parcel.createTypedArrayList(C1971b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f23933a);
        parcel.writeTypedList(this.f23934b);
    }
}
