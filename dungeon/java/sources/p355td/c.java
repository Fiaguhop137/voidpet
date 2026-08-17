package p355td;

import Ad.v;
import java.util.Date;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f54642a;

    public c(Date commitTime) {
        Intrinsics.checkNotNullParameter(commitTime, "commitTime");
        this.f54642a = commitTime;
    }

    public final String a() {
        String str = b.f54625p.a().format(this.f54642a);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final Map b() {
        return N.f(v.a("commitTime", a()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.b(this.f54642a, ((c) obj).f54642a);
    }

    public int hashCode() {
        return this.f54642a.hashCode();
    }

    public String toString() {
        return "UpdatesStateContextRollback(commitTime=" + this.f54642a + ")";
    }
}
