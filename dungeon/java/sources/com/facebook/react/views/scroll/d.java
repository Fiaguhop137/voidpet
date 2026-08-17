package com.facebook.react.views.scroll;

import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f30810f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f30813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f30814d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30811a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30812b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f30815e = -11;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float a() {
        return this.f30813c;
    }

    public final float b() {
        return this.f30814d;
    }

    public final boolean c(int i10, int i11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f30815e;
        boolean z10 = (jUptimeMillis - j10 <= 10 && this.f30811a == i10 && this.f30812b == i11) ? false : true;
        if (jUptimeMillis - j10 != 0) {
            this.f30813c = (i10 - this.f30811a) / (jUptimeMillis - j10);
            this.f30814d = (i11 - this.f30812b) / (jUptimeMillis - j10);
        }
        this.f30815e = jUptimeMillis;
        this.f30811a = i10;
        this.f30812b = i11;
        return z10;
    }
}
