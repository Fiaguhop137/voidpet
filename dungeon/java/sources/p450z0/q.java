package p450z0;

import V.k;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f58296a = new AtomicInteger(0);

    public static final int a() {
        return f58296a.addAndGet(1);
    }

    public static final k b(k kVar, boolean z10, Function1 function1) {
        return kVar.then(new AppendedSemanticsElement(z10, function1));
    }

    public static /* synthetic */ k c(k kVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(kVar, z10, function1);
    }
}
