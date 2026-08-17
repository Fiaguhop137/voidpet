package I;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Q.q f4562a = new Q.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Q.q f4563b = new Q.q();

    public static final K.c b() {
        Q.q qVar = f4563b;
        K.c cVar = (K.c) qVar.a();
        if (cVar != null) {
            return cVar;
        }
        K.c cVar2 = new K.c(new V[0], 0);
        qVar.b(cVar2);
        return cVar2;
    }

    public static final d2 c(S1 s10, Function0 function0) {
        return new T(function0, s10);
    }

    public static final d2 d(Function0 function0) {
        return new T(function0, null);
    }
}
