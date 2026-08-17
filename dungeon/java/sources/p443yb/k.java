package p443yb;

import Rb.d;
import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public interface k {
    OutputStream X();

    InputStream Y();

    boolean delete();

    Uri e();

    boolean exists();

    Uri g(d dVar);

    Long getCreationTime();

    String getFileName();

    String getType();

    k h(String str, String str2);

    Sequence i();

    boolean isDirectory();

    boolean isFile();

    long length();

    k o(String str);

    List p();

    boolean r();

    Long s();
}
