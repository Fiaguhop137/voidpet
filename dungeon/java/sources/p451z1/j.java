package p451z1;

import Ad.r;
import Ed.b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function2;
import p379v1.InterfaceC4235i;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    static final class a extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f58392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f58394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, b bVar) {
            super(2, bVar);
            this.f58394c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final b create(Object obj, b bVar) {
            a aVar = new a(this.f58394c, bVar);
            aVar.f58393b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, b bVar) {
            return ((a) create(fVar, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f58392a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f58393b;
                r.b(obj);
                return cVar;
            }
            r.b(obj);
            c cVarC = ((f) this.f58393b).c();
            Function2 function2 = this.f58394c;
            this.f58393b = cVarC;
            this.f58392a = 1;
            return function2.invoke(cVarC, this) == objE ? objE : cVarC;
        }
    }

    public static final Object a(InterfaceC4235i interfaceC4235i, Function2 function2, b bVar) {
        return interfaceC4235i.a(new a(function2, null), bVar);
    }
}
