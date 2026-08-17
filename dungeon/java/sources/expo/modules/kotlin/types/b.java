package expo.modules.kotlin.types;

import expo.modules.kotlin.jni.ExpectedType;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a {
        public static /* synthetic */ Object a(b bVar, Object obj, Rb.d dVar, boolean z10, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convert");
            }
            if ((i10 & 2) != 0) {
                dVar = null;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return bVar.a(obj, dVar, z10);
        }

        public static boolean b(b bVar) {
            return true;
        }
    }

    Object a(Object obj, Rb.d dVar, boolean z10);

    boolean b();

    ExpectedType c();
}
