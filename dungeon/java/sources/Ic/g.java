package Ic;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Parcelable, Serializable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Hc.a f5393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Hc.d f5394c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    protected g(Parcel parcel) {
        this.f5392a = parcel.readString();
        this.f5393b = (Hc.a) parcel.readParcelable(getClass().getClassLoader());
        this.f5394c = (Hc.d) parcel.readParcelable(getClass().getClassLoader());
    }

    public g(String str, Hc.a aVar, Hc.d dVar) {
        this.f5392a = str;
        this.f5393b = aVar;
        this.f5394c = dVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Hc.a f() {
        return this.f5393b;
    }

    public String j() {
        return this.f5392a;
    }

    public Hc.d k() {
        return this.f5394c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5392a);
        parcel.writeParcelable(this.f5393b, 0);
        parcel.writeParcelable(this.f5394c, 0);
    }
}
