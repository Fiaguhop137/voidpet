package p176je;

import Ad.j;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f47222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f47223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f47224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f47225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47226e;

    public G(O globalLevel, O o10, Map userDefinedLevelForSpecificAnnotation) {
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f47222a = globalLevel;
        this.f47223b = o10;
        this.f47224c = userDefinedLevelForSpecificAnnotation;
        this.f47225d = j.b(new F(this));
        O o11 = O.IGNORE;
        this.f47226e = globalLevel == o11 && o10 == o11 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public /* synthetic */ G(O o10, O o11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? null : o11, (i10 & 4) != 0 ? N.i() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(G g10) {
        List listC = CollectionsKt.c();
        listC.add(g10.f47222a.g());
        O o10 = g10.f47223b;
        if (o10 != null) {
            listC.add("under-migration:" + o10.g());
        }
        for (Map.Entry entry : g10.f47224c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + ((O) entry.getValue()).g());
        }
        return (String[]) CollectionsKt.a(listC).toArray(new String[0]);
    }

    public final O c() {
        return this.f47222a;
    }

    public final O d() {
        return this.f47223b;
    }

    public final Map e() {
        return this.f47224c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f47222a == g10.f47222a && this.f47223b == g10.f47223b && Intrinsics.b(this.f47224c, g10.f47224c);
    }

    public final boolean f() {
        return this.f47226e;
    }

    public int hashCode() {
        int iHashCode = this.f47222a.hashCode() * 31;
        O o10 = this.f47223b;
        return ((iHashCode + (o10 == null ? 0 : o10.hashCode())) * 31) + this.f47224c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f47222a + ", migrationLevel=" + this.f47223b + ", userDefinedLevelForSpecificAnnotation=" + this.f47224c + ')';
    }
}
