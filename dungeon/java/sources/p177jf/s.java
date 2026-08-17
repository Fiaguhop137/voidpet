package p177jf;

import Ed.b;
import Md.n;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import p142hf.InterfaceC3565d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f47432a;

    /* synthetic */ class a extends AbstractC3975l implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47433a = new a();

        a() {
            super(3, InterfaceC3565d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Md.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3565d interfaceC3565d, Object obj, b bVar) {
            return interfaceC3565d.emit(obj, bVar);
        }
    }

    static {
        a aVar = a.f47433a;
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f47432a = (n) K.e(aVar, 3);
    }
}
