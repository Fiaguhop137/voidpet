package p157ic;

import Ad.w;
import Rb.d;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import expo.modules.kotlin.types.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    private static final AbstractC3613v c(Object obj, boolean z10, b bVar, ExpectedType expectedType, d dVar) {
        Object objF;
        for (SingleType singleType : expectedType.getInnerPossibleTypes()) {
            if (z10) {
                return new k0(obj, bVar, dVar);
            }
            if ((singleType.getExpectedCppType().g().i(obj) || (obj instanceof Dynamic)) && (objF = f(bVar, obj, dVar)) != null) {
                return new C3606n(objF);
            }
        }
        return I.f43870a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(Object obj, d dVar, List list, List list2) {
        ArrayList arrayList = new ArrayList(CollectionsKt.w(list, 10));
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC3613v abstractC3613vC = c(obj, z10, (b) pair.getSecond(), (ExpectedType) pair.getFirst(), dVar);
            if (abstractC3613vC instanceof C3606n) {
                z10 = true;
            }
            arrayList.add(abstractC3613vC);
        }
        if (z10) {
            return arrayList;
        }
        throw new w("Cannot cast '" + obj + "' to 'Either<" + CollectionsKt.s0(list2, ", ", null, null, 0, null, new B(), 30, null) + ">'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    private static final Object f(b bVar, Object obj, d dVar) {
        try {
            return (!bVar.b() || (obj instanceof Dynamic)) ? bVar.a(obj, dVar, true) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
