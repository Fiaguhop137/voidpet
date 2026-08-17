package p142hf;

import Ed.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: hf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3567f {

    /* JADX INFO: renamed from: hf.f$a */
    public static final class a implements InterfaceC3564c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f42930a;

        public a(Object obj) {
            this.f42930a = obj;
        }

        @Override // p142hf.InterfaceC3564c
        public Object collect(InterfaceC3565d interfaceC3565d, b bVar) {
            Object objEmit = interfaceC3565d.emit(this.f42930a, bVar);
            return objEmit == Fd.b.e() ? objEmit : Unit.f48228a;
        }
    }

    public static final InterfaceC3564c a(Function2 function2) {
        return new w(function2);
    }

    public static final InterfaceC3564c b(Object obj) {
        return new a(obj);
    }
}
