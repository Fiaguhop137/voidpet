package expo.modules.kotlin.jni;

import Rb.d;
import Rb.u;
import expo.modules.kotlin.exception.CodedException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\t\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001fH\u0016¢\u0006\u0004\b \u0010!J+\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R$\u0010.\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00101R\u0018\u00104\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00103¨\u00065"}, d2 = {"Lexpo/modules/kotlin/jni/PromiseImpl;", "LRb/u;", "Lexpo/modules/kotlin/jni/JavaCallback;", "callback", "<init>", "(Lexpo/modules/kotlin/jni/JavaCallback;)V", "", "value", "", "resolve", "(Ljava/lang/Object;)V", "c", "()V", "", "result", "e", "(I)V", "", "d", "(Z)V", "", "f", "(D)V", "", "g", "(F)V", "", "(Ljava/lang/String;)V", "", "i", "(Ljava/util/Collection;)V", "", "h", "(Ljava/util/Map;)V", "code", "message", "", "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lexpo/modules/kotlin/jni/JavaCallback;", "a", "()Lexpo/modules/kotlin/jni/JavaCallback;", "Z", "b", "()Z", "wasSettled", "Ljava/lang/ref/WeakReference;", "LRb/d;", "Ljava/lang/ref/WeakReference;", "appContextHolder", "Ljava/lang/String;", "fullFunctionName", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PromiseImpl implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean wasSettled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference appContextHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String fullFunctionName;

    @NotNull
    private final JavaCallback callback;

    public PromiseImpl(@NotNull JavaCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final JavaCallback getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getWasSettled() {
        return this.wasSettled;
    }

    @Override // Rb.u
    public void c() throws Zb.u {
        d dVar;
        if (!this.wasSettled) {
            this.callback.b();
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }

    @Override // Rb.u
    public void d(boolean result) throws Zb.u {
        d dVar;
        if (!this.wasSettled) {
            this.callback.k(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }

    @Override // Rb.u
    public void e(int result) throws Zb.u {
        d dVar;
        if (!this.wasSettled) {
            this.callback.e(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }

    @Override // Rb.u
    public void f(double result) throws Zb.u {
        d dVar;
        if (!this.wasSettled) {
            this.callback.c(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }

    @Override // Rb.u
    public void g(float result) throws Zb.u {
        d dVar;
        if (!this.wasSettled) {
            this.callback.d(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }

    @Override // Rb.u
    public void h(Map result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.callback.j(result);
    }

    @Override // Rb.u
    public void i(Collection result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.callback.i(result);
    }

    @Override // Rb.u
    public void j(CodedException codedException) {
        u.a.a(this, codedException);
    }

    @Override // Rb.u
    public void reject(String code, String message, Throwable cause) throws Zb.u {
        d dVar;
        Intrinsics.checkNotNullParameter(code, "code");
        if (this.wasSettled) {
            String str = this.fullFunctionName;
            Zb.u uVar = new Zb.u(str != null ? str : "unknown");
            WeakReference weakReference = this.appContextHolder;
            if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
                throw uVar;
            }
            dVar.s();
            throw uVar;
        }
        JavaCallback javaCallback = this.callback;
        if (message == null) {
            message = cause != null ? cause.getMessage() : null;
            if (message == null) {
                message = "unknown";
            }
        }
        javaCallback.h(code, message);
        this.wasSettled = true;
    }

    @Override // Rb.u
    public void resolve(Object value) throws Zb.u {
        d dVar;
        if (!this.wasSettled) {
            this.callback.f(value);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }

    @Override // Rb.u
    public void resolve(String result) throws Zb.u {
        d dVar;
        Intrinsics.checkNotNullParameter(result, "result");
        if (!this.wasSettled) {
            this.callback.g(result);
            this.wasSettled = true;
            return;
        }
        String str = this.fullFunctionName;
        if (str == null) {
            str = "unknown";
        }
        Zb.u uVar = new Zb.u(str);
        WeakReference weakReference = this.appContextHolder;
        if (weakReference == null || (dVar = (d) weakReference.get()) == null) {
            throw uVar;
        }
        dVar.s();
        throw uVar;
    }
}
