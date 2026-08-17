package p014ad;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final File a(File dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (!dir.isDirectory()) {
            if (dir.isFile()) {
                throw new IOException("Path '" + dir + "' points to a file, but must point to a directory.");
            }
            if (!dir.mkdirs()) {
                String str = dir.exists() ? "Path already points to a non-normal file." : "";
                if (dir.getParentFile() == null) {
                    str = "Parent directory is null.";
                }
                throw new IOException("Couldn't create directory '" + dir + "'. " + str);
            }
        }
        return dir;
    }
}
