package p263ob;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.c;
import kotlin.io.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50539b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final n f50540c = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50541a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l(String category, File filesDirectory) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        this.f50541a = filesDirectory.getPath() + "/dev.expo.modules.core.logging." + category;
    }

    public static /* synthetic */ void e(l lVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new i();
        }
        lVar.d(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Error error) {
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(l lVar, String str, Function1 function1) {
        try {
            lVar.i();
            if (lVar.j() != 0) {
                str = "\n" + str;
            }
            lVar.h(str);
            function1.invoke(null);
        } catch (IOException e10) {
            function1.invoke(new Error(e10));
        } catch (Error e11) {
            function1.invoke(e11);
        }
        return Unit.f48228a;
    }

    private final void h(String str) {
        File file = new File(this.f50541a);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        j.d(file, str, charsetDefaultCharset);
    }

    private final void i() throws IOException {
        File file = new File(this.f50541a);
        if (file.exists() || file.createNewFile()) {
            return;
        }
        throw new IOException("Unable to create file at path " + this.f50541a);
    }

    private final long j() {
        File file = new File(this.f50541a);
        if (!file.exists()) {
            return 0L;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                long size = fileInputStream.getChannel().size();
                c.a(fileInputStream, null);
                return size;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(l lVar, Function1 function1, Function1 function2) {
        try {
            lVar.i();
            List listN = lVar.n();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            lVar.o(arrayList);
            function2.invoke(null);
        } catch (Throwable th) {
            function2.invoke(new Exception(th));
        }
        return Unit.f48228a;
    }

    private final List n() {
        File file = new File(this.f50541a);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        List listI = j.i(file, charsetDefaultCharset);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void o(List list) {
        File file = new File(this.f50541a);
        String strS0 = CollectionsKt.s0(list, "\n", null, null, 0, null, null, 62, null);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        j.m(file, strS0, charsetDefaultCharset);
    }

    public final void d(String entry, Function1 completionHandler) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        f50540c.b(new k(this, entry, completionHandler));
    }

    public final void k(Function1 filter, Function1 completionHandler) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        f50540c.b(new j(this, filter, completionHandler));
    }

    public final List m() {
        return 0 == j() ? CollectionsKt.l() : n();
    }
}
