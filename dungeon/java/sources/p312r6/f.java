package p312r6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f52411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f52413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f52414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f52415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SensorManager f52416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f52417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f52418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f52419i;

    public interface a {
        void a();
    }

    public f(a shakeListener, int i10) {
        Intrinsics.checkNotNullParameter(shakeListener, "shakeListener");
        this.f52411a = shakeListener;
        this.f52412b = i10;
    }

    private final boolean a(float f10) {
        return Math.abs(f10) > 13.042845f;
    }

    private final void b(long j10) {
        if (this.f52418h >= this.f52412b * 8) {
            d();
            this.f52411a.a();
        }
        if (j10 - this.f52419i > g.f52421b) {
            d();
        }
    }

    private final void c(long j10) {
        this.f52419i = j10;
        this.f52418h++;
    }

    private final void d() {
        this.f52418h = 0;
        this.f52413c = 0.0f;
        this.f52414d = 0.0f;
        this.f52415e = 0.0f;
    }

    public final void e(SensorManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.f52416f = manager;
        this.f52417g = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.f52419i = 0L;
        d();
    }

    public final void f() {
        SensorManager sensorManager = this.f52416f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f52416f = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Intrinsics.checkNotNullParameter(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.f52417g < g.f52420a) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2] - 9.80665f;
        this.f52417g = sensorEvent.timestamp;
        if (a(f10) && this.f52413c * f10 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f52413c = f10;
        } else if (a(f11) && this.f52414d * f11 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f52414d = f11;
        } else if (a(f12) && this.f52415e * f12 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f52415e = f12;
        }
        b(sensorEvent.timestamp);
    }
}
