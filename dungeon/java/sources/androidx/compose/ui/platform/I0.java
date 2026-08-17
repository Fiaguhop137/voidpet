package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f21887a = a.f21889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21888b;

    static final class a extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21889a = new a();

        a() {
            super(1);
        }

        public final void a(J0 j10) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
            return Unit.f48228a;
        }
    }

    public static final Function1 a() {
        return f21887a;
    }

    public static final boolean b() {
        return f21888b;
    }
}
