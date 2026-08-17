package Ic;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f5395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ic.a f5396b;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(b bVar, Ic.a aVar) {
        this.f5395a = bVar;
        this.f5396b = aVar;
    }

    protected h(Parcel parcel) {
        this.f5395a = (b) parcel.readParcelable(getClass().getClassLoader());
        this.f5396b = (Ic.a) parcel.readParcelable(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b f() {
        return this.f5395a;
    }

    public String j() {
        return this.f5395a.f();
    }

    public Ic.a k() {
        return this.f5396b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5395a, 0);
        parcel.writeParcelable(this.f5396b, 0);
    }
}
