package Ia;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5355f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f5356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f5357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f5358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f5359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f5360e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair b(double d10, double d11) {
            double dAtan;
            double dAtan2;
            if (d10 < 1.0E-9d) {
                dAtan = 1.5707963267948966d;
                double d12 = (d11 < 1.0E-9d || Math.abs(d11 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d13 = d11 - 1.5707963267948966d;
                double d14 = Math.abs(d13) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d15 = d11 - 3.141592653589793d;
                dAtan2 = -1.5707963267948966d;
                if (Math.abs(d15) < 1.0E-9d) {
                    d12 = -1.5707963267948966d;
                }
                double d16 = d11 - 4.71238898038469d;
                if (Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                }
                if (d11 > 1.0E-9d && Math.abs(d13) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = 1.5707963267948966d;
                }
                if (Math.abs(d13) > 1.0E-9d && Math.abs(d15) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d15) > 1.0E-9d && Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d16) <= 1.0E-9d || Math.abs(d11 - 6.283185307179586d) >= 1.0E-9d) {
                    dAtan2 = d14;
                    dAtan = d12;
                }
            } else {
                double dTan = Math.tan(d10);
                dAtan = Math.atan(Math.cos(d11) / dTan);
                dAtan2 = Math.atan(Math.sin(d11) / dTan);
            }
            return new Pair(Double.valueOf(Math.rint(dAtan * 57.29577951308232d)), Double.valueOf(Math.rint(dAtan2 * 57.29577951308232d)));
        }

        public final z a(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            double axisValue = 1.5707963267948966d - ((double) event.getAxisValue(25));
            double pressure = event.getPressure(0);
            double orientation = (((double) event.getOrientation(0)) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d10 = orientation;
            Pair pairB = b(axisValue, d10);
            return new z(((Number) pairB.c()).doubleValue(), ((Number) pairB.d()).doubleValue(), axisValue, d10, pressure);
        }
    }

    public z(double d10, double d11, double d12, double d13, double d14) {
        this.f5356a = d10;
        this.f5357b = d11;
        this.f5358c = d12;
        this.f5359d = d13;
        this.f5360e = d14;
    }

    public /* synthetic */ z(double d10, double d11, double d12, double d13, double d14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? 0.0d : d12, (i10 & 8) != 0 ? 0.0d : d13, (i10 & 16) != 0 ? -1.0d : d14);
    }

    public final double a() {
        return this.f5360e;
    }

    public final ReadableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("tiltX", this.f5356a);
        writableMapCreateMap.putDouble("tiltY", this.f5357b);
        writableMapCreateMap.putDouble("altitudeAngle", this.f5358c);
        writableMapCreateMap.putDouble("azimuthAngle", this.f5359d);
        writableMapCreateMap.putDouble("pressure", this.f5360e);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Double.compare(this.f5356a, zVar.f5356a) == 0 && Double.compare(this.f5357b, zVar.f5357b) == 0 && Double.compare(this.f5358c, zVar.f5358c) == 0 && Double.compare(this.f5359d, zVar.f5359d) == 0 && Double.compare(this.f5360e, zVar.f5360e) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f5356a) * 31) + Double.hashCode(this.f5357b)) * 31) + Double.hashCode(this.f5358c)) * 31) + Double.hashCode(this.f5359d)) * 31) + Double.hashCode(this.f5360e);
    }

    public String toString() {
        return "StylusData(tiltX=" + this.f5356a + ", tiltY=" + this.f5357b + ", altitudeAngle=" + this.f5358c + ", azimuthAngle=" + this.f5359d + ", pressure=" + this.f5360e + ")";
    }
}
