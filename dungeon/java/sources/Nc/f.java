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
public final class f extends Nc.a implements Hc.e {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8068e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new f(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, int i10, int i11, int i12) {
        super(str);
        this.f8065b = str;
        this.f8066c = i10;
        this.f8067d = i11;
        this.f8068e = i12;
    }

    @Override // Nc.a, Hc.d
    public Bundle e2() {
        return f(v.a("type", "weekly"), v.a("weekday", Integer.valueOf(this.f8066c)), v.a("hour", Integer.valueOf(this.f8067d)), v.a("minute", Integer.valueOf(this.f8068e)));
    }

    @Override // Nc.a
    public String j() {
        return this.f8065b;
    }

    @Override // Hc.e
    public Date j1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, this.f8066c);
        calendar.set(11, this.f8067d);
        calendar.set(12, this.f8068e);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(8, 1);
        }
        return calendar.getTime();
    }

    @Override // Nc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8065b);
        dest.writeInt(this.f8066c);
        dest.writeInt(this.f8067d);
        dest.writeInt(this.f8068e);
    }
}
