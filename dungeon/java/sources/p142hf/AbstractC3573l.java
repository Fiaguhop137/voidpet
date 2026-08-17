package p142hf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3573l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f42939a = new C3571j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f42940b = new C3572k();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.b(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final InterfaceC3564c e(InterfaceC3564c interfaceC3564c) {
        return interfaceC3564c instanceof H ? interfaceC3564c : f(interfaceC3564c, f42939a, f42940b);
    }

    private static final InterfaceC3564c f(InterfaceC3564c interfaceC3564c, Function1 function1, Function2 function2) {
        if (interfaceC3564c instanceof C3563b) {
            C3563b c3563b = (C3563b) interfaceC3564c;
            if (c3563b.f42922b == function1 && c3563b.f42923c == function2) {
                return interfaceC3564c;
            }
        }
        return new C3563b(interfaceC3564c, function1, function2);
    }
}
