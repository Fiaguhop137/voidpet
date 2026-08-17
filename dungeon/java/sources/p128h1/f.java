package p128h1;

import Ad.q;
import Ad.r;
import Ed.b;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class f extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f42505a;

    public f(b bVar) {
        super(false);
        this.f42505a = bVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            b bVar = this.f42505a;
            q.a aVar = q.f327b;
            bVar.resumeWith(q.b(r.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f42505a.resumeWith(q.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
