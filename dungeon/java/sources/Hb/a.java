package Hb;

import java.util.Iterator;
import kotlin.collections.AbstractC3952n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    NONE(p274p4.a.LOCAL, p274p4.a.REMOTE),
    DISK(p274p4.a.DATA_DISK_CACHE, p274p4.a.RESOURCE_DISK_CACHE),
    MEMORY(p274p4.a.MEMORY_CACHE);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p274p4.a[] f4285a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f4284g = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0095a f4279b = new C0095a(null);

    /* JADX INFO: renamed from: Hb.a$a, reason: collision with other inner class name */
    public static final class C0095a {
        private C0095a() {
        }

        public /* synthetic */ C0095a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(p274p4.a value) {
            Object next;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it = a.h().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC3952n.M(((a) next).f4285a, value));
            a aVar = (a) next;
            return aVar == null ? a.NONE : aVar;
        }
    }

    a(p274p4.a... aVarArr) {
        this.f4285a = aVarArr;
    }

    public static EnumEntries h() {
        return f4284g;
    }
}
