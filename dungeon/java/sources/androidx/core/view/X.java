package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f23156a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f23157b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23158c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23159d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23160e = 0;

    X() {
    }

    private void b() {
        this.f23159d = 0;
        this.f23158c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f23159d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f23160e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f23157b[i11];
        while (true) {
            jArr = this.f23157b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f23159d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f23159d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            long j12 = jArr[i14];
            if (j10 == j12) {
                return 0.0f;
            }
            return this.f23156a[i14] / (j12 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f23159d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f23157b;
            long j13 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j13) {
                i15++;
                float f10 = f(fAbs);
                float f11 = this.f23156a[i18] / (this.f23157b[i18] - j13);
                fAbs += (f11 - f10) * Math.abs(f11);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f23159d != 0 && eventTime - this.f23157b[this.f23160e] > 40) {
            b();
        }
        int i10 = (this.f23160e + 1) % 20;
        this.f23160e = i10;
        int i11 = this.f23159d;
        if (i11 != 20) {
            this.f23159d = i11 + 1;
        }
        this.f23156a[i10] = motionEvent.getAxisValue(26);
        this.f23157b[this.f23160e] = eventTime;
    }

    void c(int i10, float f10) {
        float fE = e() * i10;
        this.f23158c = fE;
        if (fE < (-Math.abs(f10))) {
            this.f23158c = -Math.abs(f10);
        } else if (this.f23158c > Math.abs(f10)) {
            this.f23158c = Math.abs(f10);
        }
    }

    float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f23158c;
    }
}
