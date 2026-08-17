package p379v1;

import Ad.r;
import Ed.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n implements K {

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f55912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f55913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f55914c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55916e;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55914c = obj;
            this.f55916e |= Integer.MIN_VALUE;
            return q.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, A serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p379v1.K
    public Object a(Object obj, b bVar) throws IOException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f55916e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f55916e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj2 = aVar.f55914c;
        Object objE = Fd.b.e();
        int i11 = aVar.f55916e;
        if (i11 == 0) {
            r.b(obj2);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                A aH = h();
                I i12 = new I(fileOutputStream2);
                aVar.f55912a = fileOutputStream2;
                aVar.f55913b = fileOutputStream2;
                aVar.f55916e = 1;
                if (aH.c(obj, i12, aVar) == objE) {
                    return objE;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f55913b;
            closeable = (Closeable) aVar.f55912a;
            try {
                r.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    c.a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.f48228a;
        c.a(closeable, null);
        return Unit.f48228a;
    }
}
