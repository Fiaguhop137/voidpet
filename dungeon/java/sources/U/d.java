package U;

import Ad.AbstractC0793c;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r9
      0x0034: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:5:0x0021, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(StringBuilder sb2, List list) {
        List listC = CollectionsKt.c();
        List listR = CollectionsKt.R(list);
        int size = listR.size();
        String str = null;
        String str2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) listR.get(i10);
            w wVarD = cVar.d();
            String strA = wVarD.a();
            if (strA != null) {
                str = strA;
            } else {
                strA = wVarD.e() ? "<lambda>" : null;
                if (strA != null) {
                    str = strA;
                } else if (str == null) {
                    str = "<unknown function>";
                }
            }
            String strD = wVarD.d();
            if (strD != null) {
                str2 = strD;
            } else if (str2 == null) {
                str2 = "<unknown file>";
            }
            List listB = wVarD.b();
            String str3 = str + '(' + str2 + ':' + ((cVar.c() == null || cVar.c().intValue() >= listB.size()) ? "<unknown line>" : String.valueOf(((p) listB.get(cVar.c().intValue())).a())) + ')';
            Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
            if (!wVarD.e()) {
            }
            if (!Intrinsics.b(wVarD.a(), "rememberCompositionContext") || !Intrinsics.b(wVarD.c(), "9igjgp")) {
                listC.add(str3);
            }
        }
        List listR2 = CollectionsKt.R(CollectionsKt.a(listC));
        int size2 = listR2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            sb2.append("\tat " + ((String) listR2.get(i11)));
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        }
    }

    public static final Throwable b(Throwable th, Function0 function0) {
        c(th, function0);
        return th;
    }

    public static final boolean c(Throwable th, Function0 function0) {
        m mVar;
        List listB = AbstractC0793c.b(th);
        boolean z10 = false;
        if (listB == null || !listB.isEmpty()) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof m) {
                    return false;
                }
            }
        }
        try {
            List list = (List) function0.invoke();
            boolean zIsEmpty = list.isEmpty();
            z10 = !zIsEmpty;
            mVar = !zIsEmpty ? new m(list) : null;
        } catch (Throwable th2) {
            mVar = th2;
        }
        if (mVar != null) {
            AbstractC0793c.a(th, mVar);
        }
        return z10;
    }
}
