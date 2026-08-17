package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f37233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f37234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f37235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f37236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f37237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f37238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f37239g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f37236d = i10;
        this.f37237e = i11;
        this.f37238f = i12;
        this.f37235c = i13;
        this.f37239g = k(i10);
        this.f37233a = new b(59);
        this.f37234b = new b(i13 == 1 ? 23 : 12);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String f(Resources resources, CharSequence charSequence) {
        return j(resources, charSequence, "%02d");
    }

    public static String j(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int k(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37236d == eVar.f37236d && this.f37237e == eVar.f37237e && this.f37235c == eVar.f37235c && this.f37238f == eVar.f37238f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37235c), Integer.valueOf(this.f37236d), Integer.valueOf(this.f37237e), Integer.valueOf(this.f37238f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f37236d);
        parcel.writeInt(this.f37237e);
        parcel.writeInt(this.f37238f);
        parcel.writeInt(this.f37235c);
    }
}
