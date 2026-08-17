package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class p extends n {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48324a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) throws IOException {
            Intrinsics.checkNotNullParameter(file, "<unused var>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    public static String A(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.e1(name, ".", null, 2, null);
    }

    private static final List B(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            if (Intrinsics.b(name, ".")) {
                Unit unit = Unit.f48228a;
            } else if (!Intrinsics.b(name, "..")) {
                arrayList.add(file);
            } else if (arrayList.isEmpty() || Intrinsics.b(((File) CollectionsKt.u0(arrayList)).getName(), "..")) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private static final g C(g gVar) {
        return new g(gVar.a(), B(gVar.b()));
    }

    public static final String D(File file, File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strE = E(file, base);
        if (strE != null) {
            return strE;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String E(File file, File file2) throws IOException {
        g gVarC = C(k.b(file));
        g gVarC2 = C(k.b(file2));
        if (!Intrinsics.b(gVarC.a(), gVarC2.a())) {
            return null;
        }
        int iC = gVarC2.c();
        int iC2 = gVarC.c();
        int iMin = Math.min(iC2, iC);
        int i10 = 0;
        while (i10 < iMin && Intrinsics.b(gVarC.b().get(i10), gVarC2.b().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = iC - 1;
        if (i10 <= i11) {
            while (!Intrinsics.b(((File) gVarC2.b().get(i11)).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < iC2) {
            if (i10 < iC) {
                sb2.append(File.separatorChar);
            }
            List listD0 = CollectionsKt.d0(gVarC.b(), i10);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            CollectionsKt___CollectionsKt.p0(listD0, sb2, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }

    public static final boolean t(File file, File target, boolean z10, Function2 onError) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new r(file, null, "The source file doesn't exist.", 2, null)) != s.TERMINATE;
        }
        try {
            for (File file2 : n.r(file).h(new o(onError))) {
                if (file2.exists()) {
                    File file3 = new File(target, D(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z10) {
                            if (file3.isDirectory()) {
                                if (!y(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new f(file2, file3, "The destination file already exists.")) == s.TERMINATE) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z11 = z10;
                        if (x(file2, file3, z11, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == s.TERMINATE) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else if (onError.invoke(file2, new r(file2, null, "The source file doesn't exist.", 2, null)) == s.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (t unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean u(File file, File file2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function2 = a.f48324a;
        }
        return t(file, file2, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function2 function2, File f10, IOException e10) throws t {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (function2.invoke(f10, e10) != s.TERMINATE) {
            return Unit.f48228a;
        }
        throw new t(f10);
    }

    public static final File w(File file, File target, boolean z10, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new r(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new f(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new f(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new h(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                b.a(fileInputStream, fileOutputStream, i10);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
                return target;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                c.a(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static /* synthetic */ File x(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return w(file, file2, z10, i10);
    }

    public static boolean y(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : n.q(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static String z(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.T0(name, '.', "");
    }
}
