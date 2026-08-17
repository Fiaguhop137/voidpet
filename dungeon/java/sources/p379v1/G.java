package p379v1;

import Ad.r;
import Ed.b;
import Md.n;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    static final class a extends m implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f55694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f55695b;

        a(b bVar) {
            super(3, bVar);
        }

        public final Object i(y yVar, boolean z10, b bVar) {
            a aVar = new a(bVar);
            aVar.f55695b = yVar;
            return aVar.invokeSuspend(Unit.f48228a);
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((y) obj, ((Boolean) obj2).booleanValue(), (b) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f55694a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            y yVar = (y) this.f55695b;
            this.f55694a = 1;
            Object objD = yVar.d(this);
            return objD == objE ? objE : objD;
        }
    }

    public static final Object a(F f10, b bVar) {
        return f10.c(new a(null), bVar);
    }
}
