package Ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends AbstractC1666a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f17830a;

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f17843a;
        Intrinsics.d(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }

    protected e(c arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f17830a = arrayMap;
    }

    private final String h(c cVar, int i10, String str) {
        Object next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(cVar.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map mapB = c().b();
        sb4.append("[");
        sb4.append('\n');
        ArrayList arrayList = new ArrayList(CollectionsKt.w(cVar, 10));
        int i11 = 0;
        for (Object obj : cVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.v();
            }
            Iterator it = mapB.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Number) ((Map.Entry) next).getValue()).intValue() != i11);
            sb4.append("  " + ((Map.Entry) next) + '[' + i11 + "]: " + obj);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append("]");
        sb4.append('\n');
        sb2.append("Content: " + sb4.toString());
        sb2.append('\n');
        return sb2.toString();
    }

    @Override // Ye.AbstractC1666a
    protected final c a() {
        return this.f17830a;
    }

    @Override // Ye.AbstractC1666a
    protected final void e(String keyQualifiedName, Object value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int iE = c().e(keyQualifiedName);
        int iA = this.f17830a.a();
        if (iA == 0) {
            c cVar = this.f17830a;
            if (!(cVar instanceof i)) {
                throw new IllegalStateException(h(cVar, 0, "EmptyArrayMap"));
            }
            this.f17830a = new o(value, iE);
            return;
        }
        if (iA == 1) {
            c cVar2 = this.f17830a;
            try {
                Intrinsics.d(cVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                o oVar = (o) cVar2;
                if (oVar.e() == iE) {
                    this.f17830a = new o(value, iE);
                    return;
                } else {
                    d dVar = new d();
                    dVar.c(oVar.e(), oVar.g());
                    this.f17830a = dVar;
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException(h(cVar2, 1, "OneElementArrayMap"), e10);
            }
        }
        this.f17830a.c(iE, value);
    }
}
