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
public final class g extends Nc.a implements Hc.e {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8073f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new g(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(String str, int i10, int i11, int i12, int i13) {
        super(str);
        this.f8069b = str;
        this.f8070c = i10;
        this.f8071d = i11;
        this.f8072e = i12;
        this.f8073f = i13;
    }

    @Override // Nc.a, Hc.d
    public Bundle e2() {
        return f(v.a("type", "yearly"), v.a("day", Integer.valueOf(this.f8070c)), v.a("month", Integer.valueOf(this.f8071d)), v.a("hour", Integer.valueOf(this.f8072e)), v.a("minute", Integer.valueOf(this.f8073f)));
    }

    @Override // Nc.a
    public String j() {
        return this.f8069b;
    }

    @Override // Hc.e
    public Date j1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, this.f8070c);
        calendar.set(2, this.f8071d);
        calendar.set(11, this.f8072e);
        calendar.set(12, this.f8073f);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(1, 1);
        }
        return calendar.getTime();
    }

    @Override // Nc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8069b);
        dest.writeInt(this.f8070c);
        dest.writeInt(this.f8071d);
        dest.writeInt(this.f8072e);
        dest.writeInt(this.f8073f);
    }
}
