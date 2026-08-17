package L9;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements W9.b {
    @Override // W9.b
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }
}
