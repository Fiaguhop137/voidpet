package p062d7;

import Ad.n;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.C2275s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends p062d7.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f39833g = new a(null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39834a;

        static {
            int[] iArr = new int[p062d7.b.values().length];
            try {
                iArr[p062d7.b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p062d7.b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p062d7.b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p062d7.b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39834a = iArr;
        }
    }

    static {
        p348t6.b.a("BaseLayoutAnimation", p348t6.a.ERROR);
    }

    @Override // p062d7.a
    public Animation c(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        p062d7.b bVarD = d();
        if (bVarD == null) {
            throw new C2275s("Missing animated property from animation config");
        }
        int i14 = b.f39834a[bVarD.ordinal()];
        if (i14 == 1) {
            return new m(view, i() ? view.getAlpha() : 0.0f, i() ? 0.0f : view.getAlpha());
        }
        if (i14 == 2) {
            float f10 = i() ? 1.0f : 0.0f;
            float f11 = i() ? 0.0f : 1.0f;
            return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
        }
        if (i14 == 3) {
            return new ScaleAnimation(i() ? 1.0f : 0.0f, i() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i14 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, i() ? 1.0f : 0.0f, i() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new n();
    }

    @Override // p062d7.a
    public boolean g() {
        return e() > 0 && d() != null;
    }

    public abstract boolean i();
}
