package p265od;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p263ob.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50587b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f50588a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(File filesDirectory) {
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        this.f50588a = new l("dev.expo.updates", filesDirectory);
    }

    private final long b(Date date) {
        return Long.max(date.getTime(), new Date().getTime() - ((long) 86400));
    }

    private final boolean d(String str, long j10) {
        c cVarA = c.f50576i.a(str);
        return cVarA != null && cVarA.g() >= j10;
    }

    public static /* synthetic */ void f(e eVar, Date date, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = new Date(new Date().getTime() - ((long) 86400));
        }
        eVar.e(date, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(e eVar, long j10, String entryString) {
        Intrinsics.checkNotNullParameter(entryString, "entryString");
        return eVar.d(entryString, j10);
    }

    public final List c(Date newerThan) {
        Intrinsics.checkNotNullParameter(newerThan, "newerThan");
        long jB = b(newerThan);
        List listM = this.f50588a.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (d((String) obj, jB)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void e(Date olderThan, Function1 completionHandler) {
        Intrinsics.checkNotNullParameter(olderThan, "olderThan");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        this.f50588a.k(new d(this, b(olderThan)), completionHandler);
    }
}
