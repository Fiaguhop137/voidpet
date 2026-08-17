package p216m0;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import p019b0.e;

/* JADX INFO: renamed from: m0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3985h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f48871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseLongArray f48872b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f48873c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f48874d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48875e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48876f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f48872b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f48872b;
                long j10 = this.f48871a;
                this.f48871a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f48872b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f48872b;
            long j11 = this.f48871a;
            this.f48871a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f48873c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f48875e && source == this.f48876f) {
            return;
        }
        this.f48875e = toolType;
        this.f48876f = source;
        this.f48873c.clear();
        this.f48872b.clear();
    }

    private final C d(O o10, MotionEvent motionEvent, int i10, boolean z10) {
        long jA;
        long jA2;
        int iE;
        long jC;
        int i11;
        long jF = f(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        float x10 = motionEvent.getX(i10);
        char c10 = ' ';
        long j10 = 4294967295L;
        long jE = e.e((((long) Float.floatToRawIntBits(motionEvent.getY(i10))) & 4294967295L) | (((long) Float.floatToRawIntBits(x10)) << 32));
        long jG = e.g(jE, 0.0f, 0.0f, 3, null);
        if (i10 == 0) {
            float rawX = motionEvent.getRawX();
            jA2 = e.e((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(rawX)) << 32));
            jA = o10.A(jA2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jA2 = C3988k.f48877a.a(motionEvent, i10);
            jA = o10.A(jA2);
        } else {
            long jZ = o10.z(jE);
            jA = jE;
            jA2 = jZ;
        }
        int toolType = motionEvent.getToolType(i10);
        if (toolType == 0) {
            iE = N.f48810a.e();
        } else if (toolType == 1) {
            iE = N.f48810a.d();
        } else if (toolType == 2) {
            iE = N.f48810a.c();
        } else if (toolType != 3) {
            iE = toolType != 4 ? N.f48810a.e() : N.f48810a.a();
        } else {
            iE = N.f48810a.b();
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i12 = 0;
        while (i12 < historySize) {
            float historicalX = motionEvent.getHistoricalX(i10, i12);
            float historicalY = motionEvent.getHistoricalY(i10, i12);
            char c11 = c10;
            long j11 = j10;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i11 = i12;
            } else {
                long jE2 = e.e((((long) Float.floatToRawIntBits(historicalX)) << c11) | (((long) Float.floatToRawIntBits(historicalY)) & j11));
                i11 = i12;
                arrayList.add(new C3981d(motionEvent.getHistoricalEventTime(i11), jE2, jE2, null));
            }
            i12 = i11 + 1;
            c10 = c11;
            j10 = j11;
        }
        char c12 = c10;
        long j12 = j10;
        if (motionEvent.getActionMasked() == 8) {
            float axisValue = motionEvent.getAxisValue(10);
            jC = e.e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j12) | (((long) Float.floatToRawIntBits(axisValue)) << c12));
        } else {
            jC = e.f25805b.c();
        }
        long j13 = jC;
        return new C(jF, motionEvent.getEventTime(), jA2, jA, z10, pressure, iE, this.f48873c.get(motionEvent.getPointerId(i10), false), arrayList, j13, jG, null);
    }

    private final long f(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f48872b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f48872b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f48871a;
            this.f48871a = 1 + jValueAt;
            this.f48872b.put(i10, jValueAt);
        }
        return y.a(jValueAt);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f48873c.get(pointerId, false)) {
                this.f48872b.delete(pointerId);
                this.f48873c.delete(pointerId);
            }
        }
        if (this.f48872b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f48872b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f48872b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f48872b.removeAt(size);
                    this.f48873c.delete(iKeyAt);
                }
            }
        }
    }

    public final B c(MotionEvent motionEvent, O o10) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f48872b.clear();
            this.f48873c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f48873c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.f48874d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f48874d.add(d(o10, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        h(motionEvent);
        return new B(motionEvent.getEventTime(), this.f48874d, motionEvent);
    }

    public final void e(int i10) {
        this.f48873c.delete(i10);
        this.f48872b.delete(i10);
    }
}
