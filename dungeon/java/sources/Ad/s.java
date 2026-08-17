package Ad;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class s implements Lazy, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f330d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f331e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Function0 f332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f334c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public s(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f332a = initializer;
        A a10 = A.f303a;
        this.f333b = a10;
        this.f334c = a10;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f333b;
        A a10 = A.f303a;
        if (obj != a10) {
            return obj;
        }
        Function0 function0 = this.f332a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            if (androidx.concurrent.futures.b.a(f331e, this, a10, objInvoke)) {
                this.f332a = null;
                return objInvoke;
            }
        }
        return this.f333b;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f333b != A.f303a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
