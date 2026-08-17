package p183k3;

import Ad.j;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f47952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f47953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f47954c;

    static final class a extends o implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return w.this.d();
        }
    }

    public w(q database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f47952a = database;
        this.f47953b = new AtomicBoolean(false);
        this.f47954c = j.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k d() {
        return this.f47952a.f(e());
    }

    private final k f() {
        return (k) this.f47954c.getValue();
    }

    private final k g(boolean z10) {
        return z10 ? f() : d();
    }

    public k b() {
        c();
        return g(this.f47953b.compareAndSet(false, true));
    }

    protected void c() {
        this.f47952a.c();
    }

    protected abstract String e();

    public void h(k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == f()) {
            this.f47953b.set(false);
        }
    }
}
