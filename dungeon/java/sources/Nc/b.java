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
public final class b extends Nc.a implements Hc.e {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8054d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new b(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, int i10, int i11) {
        super(str);
        this.f8052b = str;
        this.f8053c = i10;
        this.f8054d = i11;
    }

    @Override // Nc.a, Hc.d
    public Bundle e2() {
        return f(v.a("type", "daily"), v.a("hour", Integer.valueOf(this.f8053c)), v.a("minute", Integer.valueOf(this.f8054d)));
    }

    @Override // Nc.a
    public String j() {
        return this.f8052b;
    }

    @Override // Hc.e
    public Date j1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, this.f8053c);
        calendar.set(12, this.f8054d);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(5, 1);
        }
        return calendar.getTime();
    }

    @Override // Nc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8052b);
        dest.writeInt(this.f8053c);
        dest.writeInt(this.f8054d);
    }
}
