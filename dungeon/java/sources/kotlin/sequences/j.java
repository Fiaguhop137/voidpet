package kotlin.sequences;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public abstract Object b(Object obj, Ed.b bVar);

    public abstract Object c(Iterator it, Ed.b bVar);

    public final Object d(Sequence sequence, Ed.b bVar) {
        Object objC = c(sequence.iterator(), bVar);
        return objC == Fd.b.e() ? objC : Unit.f48228a;
    }
}
