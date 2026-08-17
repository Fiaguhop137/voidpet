package Cf;

import If.K;
import If.L;
import If.Y;
import If.a0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0043a f1979a = C0043a.f1981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1980b = new C0043a.C0044a();

    /* JADX INFO: renamed from: Cf.a$a, reason: collision with other inner class name */
    public static final class C0043a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0043a f1981a = new C0043a();

        /* JADX INFO: renamed from: Cf.a$a$a, reason: collision with other inner class name */
        private static final class C0044a implements a {
            @Override // Cf.a
            public void a(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        a(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // Cf.a
            public boolean b(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // Cf.a
            public Y c(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return K.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return K.a(file);
                }
            }

            @Override // Cf.a
            public long d(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // Cf.a
            public a0 e(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return K.k(file);
            }

            @Override // Cf.a
            public Y f(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return L.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return L.g(file, false, 1, null);
                }
            }

            @Override // Cf.a
            public void g(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                h(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // Cf.a
            public void h(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0043a() {
        }
    }

    void a(File file);

    boolean b(File file);

    Y c(File file);

    long d(File file);

    a0 e(File file);

    Y f(File file);

    void g(File file, File file2);

    void h(File file);
}
