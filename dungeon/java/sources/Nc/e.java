package Nc;

import Ad.v;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends Nc.a implements Hc.e {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f8064e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new e(parcel.readString(), parcel.readLong(), parcel.readInt() != 0, (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, long j10, boolean z10, Date triggerDate) {
        super(str);
        Intrinsics.checkNotNullParameter(triggerDate, "triggerDate");
        this.f8061b = str;
        this.f8062c = j10;
        this.f8063d = z10;
        this.f8064e = triggerDate;
    }

    public /* synthetic */ e(String str, long j10, boolean z10, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, z10, (i10 & 8) != 0 ? new Date(System.currentTimeMillis() + (((long) 1000) * j10)) : date);
    }

    @Override // Nc.a, Hc.d
    public Bundle e2() {
        return f(v.a("type", "timeInterval"), v.a("repeats", Boolean.valueOf(this.f8063d)), v.a("seconds", Long.valueOf(this.f8062c)));
    }

    @Override // Nc.a
    public String j() {
        return this.f8061b;
    }

    @Override // Hc.e
    public Date j1() {
        Date date = new Date();
        if (this.f8063d && this.f8064e.before(date)) {
            long j10 = this.f8062c * ((long) 1000);
            this.f8064e.setTime(date.getTime() + (j10 - ((date.getTime() - this.f8064e.getTime()) % j10)));
        }
        if (this.f8064e.before(date)) {
            return null;
        }
        return this.f8064e;
    }

    @Override // Nc.a, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f8061b);
        dest.writeLong(this.f8062c);
        dest.writeInt(this.f8063d ? 1 : 0);
        dest.writeSerializable(this.f8064e);
    }
}
