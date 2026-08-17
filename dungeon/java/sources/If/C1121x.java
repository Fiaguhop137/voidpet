package If;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1121x extends AbstractC1113o {
    private final List r(Q q10, boolean z10) throws IOException {
        File file = q10.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.c(str);
                arrayList.add(q10.u(str));
            }
            CollectionsKt.z(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + q10);
        }
        throw new FileNotFoundException("no such file: " + q10);
    }

    private final void s(Q q10) throws IOException {
        if (j(q10)) {
            throw new IOException(q10 + " already exists.");
        }
    }

    private final void t(Q q10) throws IOException {
        if (j(q10)) {
            return;
        }
        throw new IOException(q10 + " doesn't exist.");
    }

    @Override // If.AbstractC1113o
    public Y b(Q file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            t(file);
        }
        return K.g(file.toFile(), true);
    }

    @Override // If.AbstractC1113o
    public void c(Q source, Q target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // If.AbstractC1113o
    public void g(Q dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C1112n c1112nM = m(dir);
        if (c1112nM == null || !c1112nM.f()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // If.AbstractC1113o
    public void i(Q path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // If.AbstractC1113o
    public List k(Q dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List listR = r(dir, true);
        Intrinsics.c(listR);
        return listR;
    }

    @Override // If.AbstractC1113o
    public C1112n m(Q path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new C1112n(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // If.AbstractC1113o
    public AbstractC1111m n(Q file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new C1120w(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // If.AbstractC1113o
    public Y p(Q file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            s(file);
        }
        return L.g(file.toFile(), false, 1, null);
    }

    @Override // If.AbstractC1113o
    public a0 q(Q file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return K.k(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
