package p294q6;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: q6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4070b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f51476e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f51477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51480d = -1;

    /* JADX INFO: renamed from: q6.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void b(AbstractC4070b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List arrayList = this.f51477a;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f51477a = arrayList;
        }
        arrayList.add(child);
        child.c(this);
    }

    public void c(AbstractC4070b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public void d(AbstractC4070b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public abstract String e();

    public final String f() {
        String str;
        List list = this.f51477a;
        String strS0 = list != null ? CollectionsKt.s0(list, " ", null, null, 0, null, null, 62, null) : null;
        String strE = e();
        if (strS0 == null || StringsKt.j0(strS0)) {
            str = "";
        } else {
            str = " children: " + strS0;
        }
        return strE + str;
    }

    public final void g(AbstractC4070b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List list = this.f51477a;
        if (list == null) {
            return;
        }
        child.d(this);
        list.remove(child);
    }

    public void h() {
    }
}
