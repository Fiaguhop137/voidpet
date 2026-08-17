package expo.modules.kotlin.sharedobjects;

import Rb.d;
import Rb.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/sharedobjects/SharedRef;", "RefType", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "ref", "LRb/z;", "runtimeContext", "<init>", "(Ljava/lang/Object;LRb/z;)V", "LRb/d;", "appContext", "(Ljava/lang/Object;LRb/d;)V", "c", "Ljava/lang/Object;", "u", "()Ljava/lang/Object;", "", "d", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "nativeRefType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class SharedRef<RefType> extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object ref;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String nativeRefType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedRef(Object obj, d appContext) {
        this(obj, appContext.u());
        Intrinsics.checkNotNullParameter(appContext, "appContext");
    }

    public SharedRef(Object obj, z zVar) {
        super(zVar);
        this.ref = obj;
        this.nativeRefType = "unknown";
    }

    public /* synthetic */ SharedRef(Object obj, z zVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : zVar);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public String getNativeRefType() {
        return this.nativeRefType;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Object getRef() {
        return this.ref;
    }
}
