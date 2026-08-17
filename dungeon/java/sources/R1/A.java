package R1;

import U1.S;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9869d = S.z0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f9870e = S.z0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9871f = S.z0(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f9872g = S.z0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f9873h = S.z0(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f9874i = S.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f9877c;

    protected A(String str, Throwable th, int i10, Bundle bundle, long j10) {
        super(str, th);
        this.f9875a = i10;
        this.f9877c = bundle;
        this.f9876b = j10;
    }
}
