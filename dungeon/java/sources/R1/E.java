package R1;

import U1.S;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class E implements Comparable, Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9907d = S.z0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f9908e = S.z0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9909f = S.z0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9912c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public E createFromParcel(Parcel parcel) {
            return new E(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public E[] newArray(int i10) {
            return new E[i10];
        }
    }

    public E(int i10, int i11, int i12) {
        this.f9910a = i10;
        this.f9911b = i11;
        this.f9912c = i12;
    }

    E(Parcel parcel) {
        this.f9910a = parcel.readInt();
        this.f9911b = parcel.readInt();
        this.f9912c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e10 = (E) obj;
            if (this.f9910a == e10.f9910a && this.f9911b == e10.f9911b && this.f9912c == e10.f9912c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9910a * 31) + this.f9911b) * 31) + this.f9912c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(E e10) {
        int i10 = this.f9910a - e10.f9910a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f9911b - e10.f9911b;
        return i11 == 0 ? this.f9912c - e10.f9912c : i11;
    }

    public String toString() {
        return this.f9910a + "." + this.f9911b + "." + this.f9912c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9910a);
        parcel.writeInt(this.f9911b);
        parcel.writeInt(this.f9912c);
    }
}
