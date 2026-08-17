package p037c0;

import Ad.n;
import android.graphics.Path;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26679a;

        static {
            int[] iArr = new int[o0.b.values().length];
            try {
                iArr[o0.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26679a = iArr;
        }
    }

    public static final o0 a() {
        return new L(null, 1, null);
    }

    public static final void c(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction d(o0.b bVar) {
        int i10 = a.f26679a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new n();
    }
}
