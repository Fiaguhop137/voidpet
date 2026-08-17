package Ic;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0107a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f5371b;

    /* JADX INFO: renamed from: Ic.a$a, reason: collision with other inner class name */
    class C0107a implements Parcelable.Creator {
        C0107a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(g gVar) {
        this(gVar, new Date());
    }

    public a(g gVar, Date date) {
        this.f5370a = gVar;
        this.f5371b = date;
    }

    protected a(Parcel parcel) {
        this.f5370a = (g) parcel.readParcelable(getClass().getClassLoader());
        this.f5371b = new Date(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public g f() {
        return this.f5370a;
    }

    public Date j() {
        return this.f5371b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5370a, 0);
        parcel.writeLong(this.f5371b.getTime());
    }
}
