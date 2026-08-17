package A5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: A5.a$a, reason: collision with other inner class name */
    public static final class C0004a {
        public static void a(a aVar) {
        }

        public static Z4.a b(a aVar, int i10, int i11, int i12) {
            return null;
        }

        public static void c(a aVar) {
        }

        public static void d(a aVar, int i10, int i11, Function0 function0) {
        }

        public static void e(a aVar, b bitmapFramePreparer, p437y5.b bitmapFrameCache, p419x5.a animationBackend, int i10, Function0 function0) {
            Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        }

        public static /* synthetic */ void f(a aVar, b bVar, p437y5.b bVar2, p419x5.a aVar2, int i10, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i11 & 16) != 0) {
                function0 = null;
            }
            aVar.e(bVar, bVar2, aVar2, i10, function0);
        }
    }

    void a();

    void b(int i10, int i11, Function0 function0);

    Z4.a c(int i10, int i11, int i12);

    void d();

    void e(b bVar, p437y5.b bVar2, p419x5.a aVar, int i10, Function0 function0);
}
