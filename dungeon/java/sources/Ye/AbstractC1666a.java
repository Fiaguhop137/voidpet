package Ye;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ye.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1666a implements Iterable, Nd.a {

    /* JADX INFO: renamed from: Ye.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0230a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17824a;

        public AbstractC0230a(int i10) {
            this.f17824a = i10;
        }

        protected final Object c(AbstractC1666a thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.a().get(this.f17824a);
        }
    }

    protected abstract c a();

    protected abstract z c();

    protected abstract void e(String str, Object obj);

    protected final void g(kotlin.reflect.d tClass, Object value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String strN = tClass.n();
        Intrinsics.c(strN);
        e(strN, value);
    }

    public final boolean isEmpty() {
        return a().a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }
}
