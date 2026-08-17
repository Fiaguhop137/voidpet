package W1;

import R1.InterfaceC1350j;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface f extends InterfaceC1350j {

    public interface a {
        f a();
    }

    void close();

    Uri e();

    default Map f() {
        return Collections.EMPTY_MAP;
    }

    void j(x xVar);

    long m(j jVar);
}
