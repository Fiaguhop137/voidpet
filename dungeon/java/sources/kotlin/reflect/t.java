package kotlin.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class t implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f48413a;

    public t(p typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f48413a = typeParameter;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        return Intrinsics.b(getName(), typeVariable.getName()) && Intrinsics.b(getGenericDeclaration(), typeVariable.getGenericDeclaration());
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        List upperBounds = this.f48413a.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(u.c((o) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new Ad.o("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f48413a));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f48413a.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
