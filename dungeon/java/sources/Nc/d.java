package Nc;

import Ad.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Nc.a implements Hc.e {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8060e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new d(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, int i10, int i11, int i12) {
        super(str);
        this.f8057b = str;
        this.f8058c = i10;
        this.f8059d = i11;
        this.f8060e = i12;
    }

    @Override // Nc.a, Hc.d
    public Bundle e2() {
        return f(v.a("type", "monthly"), v.a("day", Integer.valueOf(this.f8058c)), v.a("hour", Integer.valueOf(this.f8059d)), v.a("minute", Integer.valueOf(this.f8060e)));
    }

    @Override // Nc.a
    public String j() {
        return this.f8057b;
    }

    @Override // Hc.e
    public Date j1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, this.f8058c);
        calendar.set(11, this.f8059d);
        calendar.set(12, this.f8060e);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(2, 1);
        }
        return calendar.getTime();
    }

    @Override // Nc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8057b);
        dest.writeInt(this.f8058c);
        dest.writeInt(this.f8059d);
        dest.writeInt(this.f8060e);
    }
}
