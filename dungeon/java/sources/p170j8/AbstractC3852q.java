package p170j8;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p135h8.h;
import p135h8.k;

/* JADX INFO: renamed from: j8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3852q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f47018a = new M();

    /* JADX INFO: renamed from: j8.q$a */
    public interface a {
        Object a(k kVar);
    }

    public static Task a(h hVar, a aVar) {
        P p10 = f47018a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.c(new N(hVar, taskCompletionSource, aVar, p10));
        return taskCompletionSource.getTask();
    }

    public static Task b(h hVar) {
        return a(hVar, new O());
    }
}
