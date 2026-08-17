package p062d7;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39872b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39873a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(ReadableMap params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params.getType("springDamping") == ReadableType.Number) {
                return (float) params.getDouble("springDamping");
            }
            return 0.5f;
        }
    }

    static {
        b.a("SimpleSpringInterpolator", p348t6.a.ERROR);
    }

    public o(float f10) {
        this.f39873a = f10;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        double dPow = Math.pow(2.0d, (-10) * f10);
        float f11 = this.f39873a;
        return (float) (((double) 1) + (dPow * Math.sin(((((double) (f10 - (f11 / 4))) * 3.141592653589793d) * ((double) 2)) / ((double) f11))));
    }
}
