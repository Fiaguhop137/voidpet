package Tb;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public static final class a {
        public static /* synthetic */ Object b(c cVar, d dVar, e eVar, Ed.b bVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerForActivityResult");
            }
            if ((i10 & 2) != 0) {
                eVar = new b();
            }
            return cVar.a(dVar, eVar, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Serializable serializable, Object obj) {
            Intrinsics.checkNotNullParameter(serializable, "<unused var>");
        }
    }

    Object a(d dVar, e eVar, Ed.b bVar);
}
