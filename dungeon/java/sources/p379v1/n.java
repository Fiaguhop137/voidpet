package p379v1;

import Ad.r;
import Ed.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.d;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f55877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f55878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f55879c;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f55880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f55881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f55882c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55884e;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55882c = obj;
            this.f55884e |= Integer.MIN_VALUE;
            return n.i(n.this, this);
        }
    }

    public n(File file, A serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f55877a = file;
        this.f55878b = serializer;
        this.f55879c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [v1.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, v1.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [v1.n] */
    static /* synthetic */ Object i(n nVar, b bVar) throws IOException {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f55884e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f55884e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f55882c;
        Object objE = Fd.b.e();
        ?? r10 = aVar.f55884e;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    closeable2 = (Closeable) aVar.f55881b;
                    r10 = (n) aVar.f55880a;
                    try {
                        r.b(obj);
                        c.a(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            c.a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f55880a;
                try {
                    r.b(obj);
                    c.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        c.a(closeable, th);
                        throw th6;
                    }
                }
            }
            r.b(obj);
            nVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((n) nVar).f55877a);
                try {
                    A a10 = ((n) nVar).f55878b;
                    aVar.f55880a = nVar;
                    aVar.f55881b = fileInputStream;
                    aVar.f55884e = 1;
                    Object objB = a10.b(fileInputStream, aVar);
                    if (objB != objE) {
                        closeable2 = fileInputStream;
                        obj = objB;
                        c.a(closeable2, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r10 = nVar;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!((n) nVar).f55877a.exists()) {
                    return ((n) nVar).f55878b.a();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((n) nVar).f55877a);
                try {
                    A a11 = ((n) nVar).f55878b;
                    aVar.f55880a = fileInputStream2;
                    aVar.f55881b = null;
                    aVar.f55884e = 2;
                    Object objB2 = a11.b(fileInputStream2, aVar);
                    if (objB2 != objE) {
                        obj = objB2;
                        closeable = fileInputStream2;
                        c.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream2;
                    throw th;
                }
            }
            return objE;
        } catch (FileNotFoundException unused2) {
            nVar = r10;
        }
    }

    @Override // p379v1.InterfaceC4229c
    public void close() {
        this.f55879c.set(true);
    }

    @Override // p379v1.y
    public Object d(b bVar) {
        return i(this, bVar);
    }

    protected final void f() {
        if (this.f55879c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    protected final File g() {
        return this.f55877a;
    }

    protected final A h() {
        return this.f55878b;
    }
}
