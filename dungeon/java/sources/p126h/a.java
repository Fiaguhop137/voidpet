package p126h;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: h.a$a, reason: collision with other inner class name */
    public static final class C0490a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f42495a;

        public C0490a(Object obj) {
            this.f42495a = obj;
        }

        public final Object a() {
            return this.f42495a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0490a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
