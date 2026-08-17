package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0400a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f36507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f36508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f36509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f36510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f36511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f36512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f36513g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0400a implements Parcelable.Creator {
        C0400a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f36514f = t.a(m.r(1900, 0).f36622f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f36515g = t.a(m.r(2100, 11).f36622f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f36516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f36518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f36519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f36520e;

        b(a aVar) {
            this.f36516a = f36514f;
            this.f36517b = f36515g;
            this.f36520e = f.f(Long.MIN_VALUE);
            this.f36516a = aVar.f36507a.f36622f;
            this.f36517b = aVar.f36508b.f36622f;
            this.f36518c = Long.valueOf(aVar.f36510d.f36622f);
            this.f36519d = aVar.f36511e;
            this.f36520e = aVar.f36509c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f36520e);
            m mVarT = m.t(this.f36516a);
            m mVarT2 = m.t(this.f36517b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f36518c;
            return new a(mVarT, mVarT2, cVar, l10 == null ? null : m.t(l10.longValue()), this.f36519d, null);
        }

        public b b(long j10) {
            this.f36518c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean v1(long j10);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f36507a = mVar;
        this.f36508b = mVar2;
        this.f36510d = mVar3;
        this.f36511e = i10;
        this.f36509c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f36513g = mVar.B(mVar2) + 1;
        this.f36512f = (mVar2.f36619c - mVar.f36619c) + 1;
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C0400a c0400a) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36507a.equals(aVar.f36507a) && this.f36508b.equals(aVar.f36508b) && p199l1.c.a(this.f36510d, aVar.f36510d) && this.f36511e == aVar.f36511e && this.f36509c.equals(aVar.f36509c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36507a, this.f36508b, this.f36510d, Integer.valueOf(this.f36511e), this.f36509c});
    }

    public c n() {
        return this.f36509c;
    }

    m o() {
        return this.f36508b;
    }

    int q() {
        return this.f36511e;
    }

    int r() {
        return this.f36513g;
    }

    m t() {
        return this.f36510d;
    }

    m u() {
        return this.f36507a;
    }

    int v() {
        return this.f36512f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f36507a, 0);
        parcel.writeParcelable(this.f36508b, 0);
        parcel.writeParcelable(this.f36510d, 0);
        parcel.writeParcelable(this.f36509c, 0);
        parcel.writeInt(this.f36511e);
    }
}
