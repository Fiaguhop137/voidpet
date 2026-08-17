package Ic;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5411d;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    private j(Parcel parcel) {
        super(parcel);
        this.f5411d = parcel.readString();
    }

    /* synthetic */ j(Parcel parcel, k kVar) {
        this(parcel);
    }

    public j(String str, String str2, boolean z10, String str3) {
        super(str, str2, z10);
        this.f5411d = str3;
    }

    public String k() {
        return this.f5411d;
    }

    @Override // Ic.b, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f5411d);
    }
}
