package V;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f13731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f13732c;

    static final class a extends kotlin.jvm.internal.o implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13733a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, k.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public f(k kVar, k kVar2) {
        this.f13731b = kVar;
        this.f13732c = kVar2;
    }

    @Override // V.k
    public boolean all(Function1 function1) {
        return this.f13731b.all(function1) && this.f13732c.all(function1);
    }

    public final k c() {
        return this.f13732c;
    }

    public final k d() {
        return this.f13731b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(this.f13731b, fVar.f13731b) && Intrinsics.b(this.f13732c, fVar.f13732c);
    }

    @Override // V.k
    public Object foldIn(Object obj, Function2 function2) {
        return this.f13732c.foldIn(this.f13731b.foldIn(obj, function2), function2);
    }

    public int hashCode() {
        return this.f13731b.hashCode() + (this.f13732c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", a.f13733a)) + ']';
    }
}
