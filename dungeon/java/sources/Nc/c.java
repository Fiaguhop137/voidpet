package Nc;

import Ad.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Nc.a implements Hc.e {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8056c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new c(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, long j10) {
        super(str);
        this.f8055b = str;
        this.f8056c = j10;
    }

    @Override // Nc.a, Hc.d
    public Bundle e2() {
        return f(v.a("type", "date"), v.a("repeats", Boolean.FALSE), v.a("value", Long.valueOf(this.f8056c)));
    }

    @Override // Nc.a
    public String j() {
        return this.f8055b;
    }

    @Override // Hc.e
    public Date j1() {
        Date date = new Date();
        Date date2 = new Date(this.f8056c);
        if (date2.before(date)) {
            return null;
        }
        return date2;
    }

    @Override // Nc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8055b);
        dest.writeLong(this.f8056c);
    }
}
