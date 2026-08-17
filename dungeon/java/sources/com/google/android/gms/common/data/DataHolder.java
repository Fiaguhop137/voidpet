package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public final class DataHolder extends p188k8.a implements Closeable {

    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f31889k = new b(new String[0], null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f31891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Bundle f31892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CursorWindow[] f31893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f31895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f31896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f31897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f31898i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f31899j = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f31900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f31901b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f31902c = new HashMap();

        /* synthetic */ a(String[] strArr, String str, p153i8.b bVar) {
            this.f31900a = (String[]) r.l(strArr);
        }
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f31890a = i10;
        this.f31891b = strArr;
        this.f31893d = cursorWindowArr;
        this.f31894e = i11;
        this.f31895f = bundle;
    }

    public Bundle a4() {
        return this.f31895f;
    }

    public int b4() {
        return this.f31894e;
    }

    public final void c4() {
        this.f31892c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f31891b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f31892c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f31896g = new int[this.f31893d.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f31893d;
            if (i10 >= cursorWindowArr.length) {
                this.f31897h = numRows;
                return;
            }
            this.f31896g[i10] = numRows;
            numRows += this.f31893d[i10].getNumRows() - (numRows - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (!this.f31898i) {
                    this.f31898i = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f31893d;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f31899j && this.f31893d.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f31898i;
        }
        return z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f31891b;
        int iA = p188k8.c.a(parcel);
        p188k8.c.v(parcel, 1, strArr, false);
        p188k8.c.x(parcel, 2, this.f31893d, i10, false);
        p188k8.c.n(parcel, 3, b4());
        p188k8.c.f(parcel, 4, a4(), false);
        p188k8.c.n(parcel, 1000, this.f31890a);
        p188k8.c.b(parcel, iA);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
