package app.rive.core;

import app.rive.RiveLog;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lapp/rive/core/RCPointer;", "Lapp/rive/core/RefCounted;", "cppPointer", "", "label", "", "onDispose", "Lkotlin/Function1;", "", "(JLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDisposed", "", "()Z", "getLabel", "()Ljava/lang/String;", "pointer", "getPointer", "()J", "refCount", "", "getRefCount", "()I", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "acquire", "source", "release", "reason", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RCPointer implements RefCounted {

    @NotNull
    private static final String TAG = "Rive/RCPointer";
    private final long cppPointer;

    @NotNull
    private AtomicBoolean disposed;

    @NotNull
    private final String label;

    @NotNull
    private final Function1<Long, Unit> onDispose;

    @NotNull
    private AtomicInteger referenceCount;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.core.RCPointer$acquire$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2 extends o implements Function0<String> {
        final /* synthetic */ int $current;
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, int i10) {
            super(0);
            this.$source = str;
            this.$current = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Acquiring " + RCPointer.this.getLabel() + " (source: " + this.$source + "; ref count before acquire: " + this.$current + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RCPointer$release$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends o implements Function0<String> {
        final /* synthetic */ String $reasonLog;
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2) {
            super(0);
            this.$source = str;
            this.$reasonLog = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Releasing " + RCPointer.this.getLabel() + " (source: " + this.$source + this.$reasonLog + "; ref count before release: " + RCPointer.this.referenceCount.get() + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RCPointer$release$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass3 extends o implements Function0<String> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Disposing " + RCPointer.this.getLabel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RCPointer(long j10, @NotNull String label, @NotNull Function1<? super Long, Unit> onDispose) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onDispose, "onDispose");
        this.cppPointer = j10;
        this.label = label;
        this.onDispose = onDispose;
        this.referenceCount = new AtomicInteger(1);
        this.disposed = new AtomicBoolean(false);
    }

    @Override // app.rive.core.RefCounted
    public void acquire(@NotNull String source) throws IllegalStateException {
        int i10;
        Intrinsics.checkNotNullParameter(source, "source");
        do {
            i10 = this.referenceCount.get();
            if (i10 <= 0) {
                throw new IllegalStateException(("Attempting to acquire a null RCPointer (" + this.label + ").").toString());
            }
        } while (!this.referenceCount.compareAndSet(i10, i10 + 1));
        RiveLog.INSTANCE.getLogger().v("Rive/RCPointer", new AnonymousClass2(source, i10));
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final long getPointer() {
        if (this.referenceCount.get() > 0) {
            return this.cppPointer;
        }
        throw new IllegalStateException(("Attempting to access a disposed RCPointer (" + this.label + ")").toString());
    }

    @Override // app.rive.core.RefCounted
    public int getRefCount() {
        return this.referenceCount.get();
    }

    @Override // app.rive.core.RefCounted
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // app.rive.core.RefCounted
    public void release(@NotNull String source, @NotNull String reason) throws IllegalStateException {
        String str;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason.length() == 0) {
            str = "";
        } else {
            str = "; reason: " + reason;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(source, str);
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().v("Rive/RCPointer", anonymousClass1);
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            if (iDecrementAndGet == 0) {
                riveLog.getLogger().d("Rive/RCPointer", new AnonymousClass3());
                this.onDispose.invoke(Long.valueOf(this.cppPointer));
                this.disposed.set(true);
                return;
            }
            return;
        }
        throw new IllegalStateException(("RCPointer " + this.label + " (source: " + source + str + ") released too many times.").toString());
    }
}
