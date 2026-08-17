package P5;

import T4.g;
import U5.n;
import W5.InterfaceC1613p;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8838a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f8839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f8840c;

    private b() {
    }

    public static final a a(T5.d dVar, InterfaceC1613p interfaceC1613p, n nVar, boolean z10, boolean z11, int i10, int i11, ExecutorService executorService) {
        if (!f8839b) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(T5.d.class, InterfaceC1613p.class, n.class, cls, cls, cls2, cls2, g.class).newInstance(dVar, interfaceC1613p, nVar, Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(i10), Integer.valueOf(i11), executorService);
                Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                f8840c = (a) objNewInstance;
            } catch (Throwable unused) {
            }
            if (f8840c != null) {
                f8839b = true;
            }
        }
        return f8840c;
    }
}
