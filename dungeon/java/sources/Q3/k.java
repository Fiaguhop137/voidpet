package Q3;

import If.AbstractC1113o;
import If.Q;
import android.os.StatFs;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final long a(AbstractC1113o abstractC1113o, Q q10) {
        File file = q10.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
