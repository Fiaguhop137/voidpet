package p410we;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p374ue.x;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f56910b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f56911c = new i(CollectionsKt.l());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56912a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(x table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.p() == 0) {
                return b();
            }
            List listQ = table.q();
            Intrinsics.checkNotNullExpressionValue(listQ, "getRequirementList(...)");
            return new i(listQ, null);
        }

        public final i b() {
            return i.f56911c;
        }
    }

    private i(List list) {
        this.f56912a = list;
    }

    public /* synthetic */ i(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
