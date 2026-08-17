package Ic;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Parcelable, Serializable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5374c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    protected b(Parcel parcel) {
        this.f5372a = parcel.readString();
        this.f5373b = parcel.readString();
        this.f5374c = parcel.readByte() != 0;
    }

    public b(String str, String str2, boolean z10) {
        this.f5372a = str;
        this.f5373b = str2;
        this.f5374c = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f5372a;
    }

    public String getTitle() {
        return this.f5373b;
    }

    public boolean j() {
        return this.f5374c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5372a);
        parcel.writeString(this.f5373b);
        parcel.writeByte(this.f5374c ? (byte) 1 : (byte) 0);
    }
}
