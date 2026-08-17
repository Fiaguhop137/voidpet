package Ic;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Parcelable, Serializable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f5376b;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (d) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    private c(Parcel parcel) {
        this.f5375a = parcel.readString();
        this.f5376b = parcel.readArrayList(b.class.getClassLoader());
    }

    /* synthetic */ c(Parcel parcel, d dVar) {
        this(parcel);
    }

    public c(String str, List list) {
        this.f5375a = str;
        this.f5376b = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List f() {
        List list = this.f5376b;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public String j() {
        return this.f5375a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5375a);
        parcel.writeList(this.f5376b);
    }
}
