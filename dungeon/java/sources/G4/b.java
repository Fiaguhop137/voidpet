package G4;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3932a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f3932a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f3932a;
    }
}
