package Ke;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    public static final class a {
        public static /* synthetic */ Collection a(n nVar, d dVar, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                dVar = d.f6198o;
            }
            if ((i10 & 2) != 0) {
                function1 = k.f6224a.c();
            }
            return nVar.e(dVar, function1);
        }
    }

    Collection e(d dVar, Function1 function1);

    InterfaceC1794h f(p464ze.f fVar, p159ie.b bVar);
}
