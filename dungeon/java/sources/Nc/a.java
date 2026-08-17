package Nc;

import Ad.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Hc.d, Serializable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0138a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8051a;

    /* JADX INFO: renamed from: Nc.a$a, reason: collision with other inner class name */
    public static final class C0138a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str) {
        this.f8051a = str;
    }

    @Override // Hc.d
    public String W2() {
        return j();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Hc.d
    public Bundle e2() {
        return f(new Pair[0]);
    }

    protected final Bundle f(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        I i10 = new I(2);
        i10.a(v.a("channelId", j()));
        i10.b(pairs);
        return p128h1.c.a((Pair[]) i10.d(new Pair[i10.c()]));
    }

    public String j() {
        return this.f8051a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8051a);
    }
}
