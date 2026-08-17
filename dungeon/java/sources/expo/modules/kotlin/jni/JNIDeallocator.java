package expo.modules.kotlin.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u001b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0018\u00010\u001cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "", "shouldCreateDestructorThread", "<init>", "(Z)V", "Ljava/lang/Thread;", "", "c", "(Ljava/lang/Thread;)V", "Lexpo/modules/kotlin/jni/Destructible;", "destructible", "addReference", "(Lexpo/modules/kotlin/jni/Destructible;)V", "b", "()Lkotlin/Unit;", "close", "()V", "Ljava/lang/ref/ReferenceQueue;", "a", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "", "Ljava/lang/ref/PhantomReference;", "Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "destructorMap", "Lexpo/modules/kotlin/jni/JNIDeallocator$a;", "Lexpo/modules/kotlin/jni/JNIDeallocator$a;", "destructorThread", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JNIDeallocator implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReferenceQueue referenceQueue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map destructorMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a destructorThread;

    private final class a extends Thread {
        public a() {
            super("Expo JNI deallocator");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            JNIDeallocator.this.c(this);
        }
    }

    public JNIDeallocator() {
        this(false, 1, null);
    }

    public JNIDeallocator(boolean z10) {
        a aVar;
        this.referenceQueue = new ReferenceQueue();
        this.destructorMap = new LinkedHashMap();
        if (z10) {
            aVar = new a();
            aVar.start();
        } else {
            aVar = null;
        }
        this.destructorThread = aVar;
    }

    public /* synthetic */ JNIDeallocator(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Thread thread) {
        while (!thread.isInterrupted()) {
            try {
                Reference referenceRemove = this.referenceQueue.remove();
                synchronized (this) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void addReference(@NotNull Destructible destructible) {
        Intrinsics.checkNotNullParameter(destructible, "destructible");
        synchronized (this) {
            WeakReference weakReference = new WeakReference(destructible);
            this.destructorMap.put(new PhantomReference(destructible, this.referenceQueue), weakReference);
            Unit unit = Unit.f48228a;
        }
    }

    public final Unit b() {
        Unit unit;
        synchronized (this) {
            try {
                Iterator it = this.destructorMap.values().iterator();
                while (it.hasNext()) {
                    Destructible destructible = (Destructible) ((WeakReference) it.next()).get();
                    if (destructible != null) {
                        destructible.a();
                    }
                }
                this.destructorMap.clear();
                a aVar = this.destructorThread;
                if (aVar != null) {
                    aVar.interrupt();
                    unit = Unit.f48228a;
                } else {
                    unit = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        b();
    }
}
