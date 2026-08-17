package Jd;

import kotlin.random.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Id.a {

    /* JADX INFO: renamed from: Jd.a$a, reason: collision with other inner class name */
    private static final class C0113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0113a f5803a = new C0113a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f5804b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f5804b = num2;
        }

        private C0113a() {
        }
    }

    private final boolean d(int i10) {
        Integer num = C0113a.f5804b;
        return num == null || num.intValue() >= i10;
    }

    @Override // Hd.a
    public c b() {
        return d(34) ? new Qd.a() : super.b();
    }
}
