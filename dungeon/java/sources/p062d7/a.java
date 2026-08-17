package p062d7;

import Ad.v;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C2275s;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p348t6.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0439a f39820e = new C0439a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f39821f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Interpolator f39822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f39824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39825d;

    /* JADX INFO: renamed from: d7.a$a, reason: collision with other inner class name */
    public static final class C0439a {
        private C0439a() {
        }

        public /* synthetic */ C0439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Interpolator a(d type, ReadableMap params) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(params, "params");
            Interpolator oVar = type == d.SPRING ? new o(o.f39872b.a(params)) : (Interpolator) a.f39821f.get(type);
            if (oVar != null) {
                return oVar;
            }
            throw new IllegalArgumentException(("Missing interpolator for type : " + type).toString());
        }
    }

    static {
        b.a("AbstractLayoutAnimation", p348t6.a.ERROR);
        f39821f = N.l(v.a(d.LINEAR, new LinearInterpolator()), v.a(d.EASE_IN, new AccelerateInterpolator()), v.a(d.EASE_OUT, new DecelerateInterpolator()), v.a(d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator()));
    }

    public final Animation b(View view, int i10, int i11, int i12, int i13) {
        Animation animationC;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!g() || (animationC = c(view, i10, i11, i12, i13)) == null) {
            return null;
        }
        animationC.setDuration(this.f39825d);
        animationC.setStartOffset(this.f39823b);
        animationC.setInterpolator(this.f39822a);
        return animationC;
    }

    public abstract Animation c(View view, int i10, int i11, int i12, int i13);

    public final b d() {
        return this.f39824c;
    }

    public final int e() {
        return this.f39825d;
    }

    public final void f(ReadableMap data, int i10) {
        b bVarA;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.hasKey("property")) {
            b.a aVar = b.f39826a;
            String string = data.getString("property");
            if (string == null) {
                string = "";
            }
            bVarA = aVar.a(string);
        } else {
            bVarA = null;
        }
        this.f39824c = bVarA;
        if (data.hasKey("duration")) {
            i10 = data.getInt("duration");
        }
        this.f39825d = i10;
        this.f39823b = data.hasKey("delay") ? data.getInt("delay") : 0;
        if (!data.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        C0439a c0439a = f39820e;
        d.a aVar2 = d.f39835a;
        String string2 = data.getString("type");
        this.f39822a = c0439a.a(aVar2.a(string2 != null ? string2 : ""), data);
        if (g()) {
            return;
        }
        throw new C2275s("Invalid layout animation : " + data);
    }

    public abstract boolean g();

    public final void h() {
        this.f39824c = null;
        this.f39825d = 0;
        this.f39823b = 0;
        this.f39822a = null;
    }
}
