package expo.modules.kotlin.sharedobjects;

import Rb.B;
import Rb.d;
import Rb.f;
import Rb.z;
import expo.modules.kotlin.jni.JNIUtils;
import expo.modules.kotlin.jni.JSIContext;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p121gc.c;
import p157ic.M;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0011\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u000bR\"\u0010\"\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010!R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedObject;", "", "LRb/z;", "runtimeContext", "<init>", "(LRb/z;)V", "LRb/d;", "appContext", "(LRb/d;)V", "", "getSharedObjectId", "()I", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "e", "()Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "", "eventName", "", "args", "", "b", "(Ljava/lang/String;[Ljava/lang/Object;)V", "m", "(Ljava/lang/String;)V", "o", "s", "()V", "a", "c", "Lgc/c;", "I", "k", "r", "(I)V", "sharedObjectId", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "i", "()Ljava/lang/ref/WeakReference;", "p", "(Ljava/lang/ref/WeakReference;)V", "runtimeContextHolder", "h", "()LRb/z;", "d", "()LRb/d;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SharedObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int sharedObjectId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private WeakReference runtimeContextHolder;

    public SharedObject() {
        this(null, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedObject(d appContext) {
        this(appContext.u());
        Intrinsics.checkNotNullParameter(appContext, "appContext");
    }

    public SharedObject(z zVar) {
        this.sharedObjectId = c.b(0);
        this.runtimeContextHolder = B.a(zVar);
    }

    public /* synthetic */ SharedObject(z zVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : zVar);
    }

    private final JavaScriptWeakObject e() {
        int iB = c.b(this.sharedObjectId);
        z zVarH = h();
        if (zVarH == null) {
            return null;
        }
        return c.i(iB, zVarH);
    }

    private final int getSharedObjectId() {
        return this.sharedObjectId;
    }

    private final z h() {
        return (z) this.runtimeContextHolder.get();
    }

    public void a() {
    }

    public final void b(String eventName, Object... args) {
        z zVarH;
        JSIContext jSIContextF;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(args, "args");
        JavaScriptWeakObject javaScriptWeakObjectE = e();
        if (javaScriptWeakObjectE == null || (zVarH = h()) == null || (jSIContextF = zVarH.f()) == null) {
            return;
        }
        try {
            JNIUtils.Companion aVar = JNIUtils.INSTANCE;
            ArrayList arrayList = new ArrayList(args.length);
            for (Object obj : args) {
                arrayList.add(M.b(M.f43874a, obj, null, false, 6, null));
            }
            aVar.b(javaScriptWeakObjectE, jSIContextF, eventName, arrayList.toArray(new Object[0]));
        } catch (Throwable th) {
            f.a().b("Unable to send event '" + eventName + "' by shared object of type " + getClass().getSimpleName(), th);
        }
    }

    public int c() {
        return 0;
    }

    public final d d() {
        z zVarH = h();
        if (zVarH != null) {
            return zVarH.b();
        }
        return null;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final WeakReference getRuntimeContextHolder() {
        return this.runtimeContextHolder;
    }

    public final int k() {
        return this.sharedObjectId;
    }

    public void m(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public void o(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void p(WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.runtimeContextHolder = weakReference;
    }

    public final void r(int i10) {
        this.sharedObjectId = i10;
    }

    public void s() {
        a();
    }
}
