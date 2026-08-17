package M0;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6737b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f6738c = new j(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f6739d = new j(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f6740e = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6741a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f6740e;
        }

        public final j b() {
            return j.f6738c;
        }

        public final j c() {
            return j.f6739d;
        }
    }

    public j(int i10) {
        this.f6741a = i10;
    }

    public final boolean d(j jVar) {
        int i10 = this.f6741a;
        return (jVar.f6741a | i10) == i10;
    }

    public final int e() {
        return this.f6741a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f6741a == ((j) obj).f6741a;
    }

    public int hashCode() {
        return this.f6741a;
    }

    public String toString() {
        if (this.f6741a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f6741a & f6739d.f6741a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f6741a & f6740e.f6741a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + Q0.a.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
