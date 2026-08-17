package De;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1787a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final Collection b(Collection collection, Function1 descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        p034bf.k kVarA = p034bf.k.f26638c.a();
        while (!linkedList.isEmpty()) {
            Object objJ0 = CollectionsKt.j0(linkedList);
            p034bf.k kVarA2 = p034bf.k.f26638c.a();
            Collection collectionQ = o.q(objJ0, linkedList, descriptorByHandle, new q(kVarA2));
            Intrinsics.checkNotNullExpressionValue(collectionQ, "extractMembersOverridableInBothWays(...)");
            if (collectionQ.size() == 1 && kVarA2.isEmpty()) {
                Object objE0 = CollectionsKt.E0(collectionQ);
                Intrinsics.checkNotNullExpressionValue(objE0, "single(...)");
                kVarA.add(objE0);
            } else {
                Object objL = o.L(collectionQ, descriptorByHandle);
                InterfaceC1787a interfaceC1787a = (InterfaceC1787a) descriptorByHandle.invoke(objL);
                for (Object obj : collectionQ) {
                    Intrinsics.c(obj);
                    if (!o.B(interfaceC1787a, (InterfaceC1787a) descriptorByHandle.invoke(obj))) {
                        kVarA2.add(obj);
                    }
                }
                if (!kVarA2.isEmpty()) {
                    kVarA.addAll(kVarA2);
                }
                kVarA.add(objL);
            }
        }
        return kVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(p034bf.k kVar, Object obj) {
        Intrinsics.c(obj);
        kVar.add(obj);
        return Unit.f48228a;
    }
}
