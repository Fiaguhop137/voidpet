package p157ic;

import Rb.d;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import expo.modules.kotlin.types.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p139hc.j;

/* JADX INFO: renamed from: ic.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3599g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f43923a;

    public AbstractC3599g(Function1 typedArrayWrapper) {
        Intrinsics.checkNotNullParameter(typedArrayWrapper, "typedArrayWrapper");
        this.f43923a = typedArrayWrapper;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return false;
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return new ExpectedType(p031bc.a.f26466o);
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j d(Object value, d dVar, boolean z10) {
        Intrinsics.checkNotNullParameter(value, "value");
        return f((JavaScriptTypedArray) value);
    }

    public final j f(JavaScriptTypedArray value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (j) this.f43923a.invoke(value);
    }
}
