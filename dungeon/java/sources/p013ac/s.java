package p013ac;

import Rb.d;
import Zb.m;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p157ic.C3594b;
import p157ic.X;
import p209lb.a;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X f19671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Function1 f19672h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String name, C3594b[] argTypes, X returnType, Function1 body) {
        super(name, argTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argTypes, "argTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f19671g = returnType;
        this.f19672h = body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(s sVar, String str, d dVar, Object[] args) throws m {
        CodedException unexpectedException;
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return sVar.f19671g.b(sVar.n(args, dVar));
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof a) {
                a aVar = (a) th;
                String strA = aVar.a();
                Intrinsics.checkNotNullExpressionValue(strA, "getCode(...)");
                unexpectedException = new CodedException(strA, aVar.getMessage(), aVar.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw new m(sVar.g(), str, unexpectedException);
        }
    }

    @Override // p013ac.a
    public void a(d appContext, JSDecoratorsBridgingObject jsObject, String moduleName) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(jsObject, "jsObject");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        jsObject.registerSyncFunction(g(), i(), j(), (ExpectedType[]) e().toArray(new ExpectedType[0]), o(moduleName, appContext));
    }

    public final Object n(Object[] args, d dVar) {
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f19672h.invoke(a.c(this, args, dVar, false, 4, null));
    }

    public final JNIFunctionBody o(String moduleName, d dVar) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return new r(this, moduleName, dVar);
    }
}
