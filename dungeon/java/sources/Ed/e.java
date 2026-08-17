package Ed;

import Ad.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements b, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f2772b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2773c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f2774a;

    @Nullable
    private volatile Object result;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(b delegate) {
        this(delegate, Fd.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    public e(b delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2774a = delegate;
        this.result = obj;
    }

    public final Object b() throws Throwable {
        Object obj = this.result;
        Fd.a aVar = Fd.a.UNDECIDED;
        if (obj == aVar) {
            if (androidx.concurrent.futures.b.a(f2773c, this, aVar, Fd.b.e())) {
                return Fd.b.e();
            }
            obj = this.result;
        }
        if (obj == Fd.a.RESUMED) {
            return Fd.b.e();
        }
        if (obj instanceof q.b) {
            throw ((q.b) obj).f329a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        b bVar = this.f2774a;
        if (bVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) bVar;
        }
        return null;
    }

    @Override // Ed.b
    public CoroutineContext getContext() {
        return this.f2774a.getContext();
    }

    @Override // Ed.b
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            Fd.a aVar = Fd.a.UNDECIDED;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.b.a(f2773c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != Fd.b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f2773c, this, Fd.b.e(), Fd.a.RESUMED)) {
                    this.f2774a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f2774a;
    }
}
