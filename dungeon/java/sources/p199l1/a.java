package p199l1;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f48586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f48587c;

    public a(File file) {
        this.f48585a = file;
        this.f48586b = new File(file.getPath() + ".new");
        this.f48587c = new File(file.getPath() + ".bak");
    }

    private static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    private static boolean e(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        if (this.f48586b.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.f48586b);
    }

    public void b(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!e(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        c(this.f48586b, this.f48585a);
    }

    public FileOutputStream d() throws IOException {
        if (this.f48587c.exists()) {
            c(this.f48587c, this.f48585a);
        }
        try {
            return new FileOutputStream(this.f48586b);
        } catch (FileNotFoundException unused) {
            if (!this.f48586b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f48586b);
            }
            try {
                return new FileOutputStream(this.f48586b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f48586b, e10);
            }
        }
    }
}
