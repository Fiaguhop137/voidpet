package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f36617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f36618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f36619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f36620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f36621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f36622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f36623g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.r(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = t.c(calendar);
        this.f36617a = calendarC;
        this.f36618b = calendarC.get(2);
        this.f36619c = calendarC.get(1);
        this.f36620d = calendarC.getMaximum(7);
        this.f36621e = calendarC.getActualMaximum(5);
        this.f36622f = calendarC.getTimeInMillis();
    }

    static m r(int i10, int i11) {
        Calendar calendarI = t.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new m(calendarI);
    }

    static m t(long j10) {
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j10);
        return new m(calendarI);
    }

    static m u() {
        return new m(t.g());
    }

    m A(int i10) {
        Calendar calendarC = t.c(this.f36617a);
        calendarC.add(2, i10);
        return new m(calendarC);
    }

    int B(m mVar) {
        if (this.f36617a instanceof GregorianCalendar) {
            return ((mVar.f36619c - this.f36619c) * 12) + (mVar.f36618b - this.f36618b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f36618b == mVar.f36618b && this.f36619c == mVar.f36619c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36618b), Integer.valueOf(this.f36619c)});
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f36617a.compareTo(mVar.f36617a);
    }

    int v(int i10) {
        int i11 = this.f36617a.get(7);
        if (i10 <= 0) {
            i10 = this.f36617a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f36620d : i12;
    }

    long w(int i10) {
        Calendar calendarC = t.c(this.f36617a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f36619c);
        parcel.writeInt(this.f36618b);
    }

    int x(long j10) {
        Calendar calendarC = t.c(this.f36617a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String y() {
        if (this.f36623g == null) {
            this.f36623g = e.f(this.f36617a.getTimeInMillis());
        }
        return this.f36623g;
    }

    long z() {
        return this.f36617a.getTimeInMillis();
    }
}
