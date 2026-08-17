package Z1;

import U1.AbstractC1459a;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class P extends R1.A {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f18021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final R1.r f18023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n2.D.b f18025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f18026p;

    private P(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, null, false);
    }

    private P(int i10, Throwable th, String str, int i11, String str2, int i12, R1.r rVar, int i13, n2.D.b bVar, boolean z10) {
        this(e(i10, str, str2, i12, rVar, i13), th, i11, i10, str2, i12, rVar, i13, bVar, SystemClock.elapsedRealtime(), z10);
    }

    private P(String str, Throwable th, int i10, int i11, String str2, int i12, R1.r rVar, int i13, n2.D.b bVar, long j10, boolean z10) {
        super(str, th, i10, Bundle.EMPTY, j10);
        AbstractC1459a.a(!z10 || i11 == 1);
        AbstractC1459a.a(th != null || i11 == 3);
        this.f18020j = i11;
        this.f18021k = str2;
        this.f18022l = i12;
        this.f18023m = rVar;
        this.f18024n = i13;
        this.f18025o = bVar;
        this.f18026p = z10;
    }

    public static P b(Throwable th, String str, int i10, R1.r rVar, int i11, n2.D.b bVar, boolean z10, int i12) {
        if (rVar == null) {
            i11 = 4;
        }
        return new P(1, th, null, i12, str, i10, rVar, i11, bVar, z10);
    }

    public static P c(IOException iOException, int i10) {
        return new P(0, iOException, i10);
    }

    public static P d(RuntimeException runtimeException, int i10) {
        return new P(2, runtimeException, i10);
    }

    private static String e(int i10, String str, String str2, int i11, R1.r rVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + rVar + ", format_supported=" + U1.S.c0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    P a(n2.D.b bVar) {
        return new P((String) U1.S.i(getMessage()), getCause(), this.f9875a, this.f18020j, this.f18021k, this.f18022l, this.f18023m, this.f18024n, bVar, this.f9876b, this.f18026p);
    }
}
