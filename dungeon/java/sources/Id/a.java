package Id;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Hd.a {

    /* JADX INFO: renamed from: Id.a$a, reason: collision with other inner class name */
    private static final class C0108a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0108a f5413a = new C0108a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f5414b;

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
            f5414b = num2;
        }

        private C0108a() {
        }
    }

    private final boolean d(int i10) {
        Integer num = C0108a.f5414b;
        return num == null || num.intValue() >= i10;
    }

    @Override // Hd.a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (d(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // Hd.a
    public List c(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (!d(19)) {
            return super.c(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return AbstractC3952n.e(suppressed);
    }
}
