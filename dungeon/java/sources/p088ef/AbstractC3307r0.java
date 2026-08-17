package p088ef;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ef.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3307r0 extends K implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40865c = new a(null);

    /* JADX INFO: renamed from: ef.r0$a */
    public static final class a extends b {
        private a() {
            super(K.f40782b, new C3306q0());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC3307r0 d(CoroutineContext.Element element) {
            if (element instanceof AbstractC3307r0) {
                return (AbstractC3307r0) element;
            }
            return null;
        }
    }

    public abstract Executor r0();
}
