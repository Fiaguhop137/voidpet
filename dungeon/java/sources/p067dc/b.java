package p067dc;

import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p157ic.M;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f39901b;

    public b(String name, Function0 getter) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(getter, "getter");
        this.f39900a = name;
        this.f39901b = getter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(b bVar) {
        return M.b(M.f43874a, bVar.f39901b.invoke(), null, false, 6, null);
    }

    public final void b(JSDecoratorsBridgingObject jsObject) {
        Intrinsics.checkNotNullParameter(jsObject, "jsObject");
        jsObject.registerConstant(this.f39900a, new a(this));
    }
}
