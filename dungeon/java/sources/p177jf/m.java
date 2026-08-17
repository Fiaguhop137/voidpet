package p177jf;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import p142hf.InterfaceC3564c;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends InterfaceC3564c {

    public static final class a {
        public static /* synthetic */ InterfaceC3564c a(m mVar, CoroutineContext coroutineContext, int i10, p124gf.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = e.f48283a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = p124gf.a.SUSPEND;
            }
            return mVar.a(coroutineContext, i10, aVar);
        }
    }

    InterfaceC3564c a(CoroutineContext coroutineContext, int i10, p124gf.a aVar);
}
