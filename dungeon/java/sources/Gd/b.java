package Gd;

import java.io.Serializable;
import kotlin.collections.AbstractC3942d;
import kotlin.collections.AbstractC3952n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class b extends AbstractC3942d implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f3994b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f3994b = entries;
    }

    @Override // kotlin.collections.AbstractC3940b
    public int c() {
        return this.f3994b.length;
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return false;
    }

    public boolean g(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) AbstractC3952n.a0(this.f3994b, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC3942d.f48249a.b(i10, this.f3994b.length);
        return this.f3994b[i10];
    }

    public int i(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC3952n.a0(this.f3994b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }

    public int k(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return i(element);
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }
}
