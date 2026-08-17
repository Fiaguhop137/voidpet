package Lc;

import Ad.q;
import Ad.r;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function2;
import p088ef.AbstractC3289i;
import p088ef.C3282e0;
import p088ef.K;
import p088ef.O;
import p088ef.c1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f6605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6606b;

        a(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6605a = obj;
            this.f6606b |= Integer.MIN_VALUE;
            return c.a(null, 0L, 0L, this);
        }
    }

    static final class b extends m implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Uri f6608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f6610d;

        static final class a extends m implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f6611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f6612b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f6613c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f6614d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Uri uri, long j10, long j11, Ed.b bVar) {
                super(2, bVar);
                this.f6612b = uri;
                this.f6613c = j10;
                this.f6614d = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Ed.b create(Object obj, Ed.b bVar) {
                return new a(this.f6612b, this.f6613c, this.f6614d, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Ed.b bVar) {
                return ((a) create(o10, bVar)).invokeSuspend(Unit.f48228a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws IOException {
                Fd.b.e();
                if (this.f6611a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                URLConnection uRLConnectionOpenConnection = new URL(this.f6612b.toString()).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout((int) this.f6613c);
                uRLConnectionOpenConnection.setReadTimeout((int) this.f6614d);
                return BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Uri uri, long j10, long j11, Ed.b bVar) {
            super(2, bVar);
            this.f6608b = uri;
            this.f6609c = j10;
            this.f6610d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Ed.b create(Object obj, Ed.b bVar) {
            return new b(this.f6608b, this.f6609c, this.f6610d, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Ed.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f48228a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = Fd.b.e();
            int i10 = this.f6607a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            K kB = C3282e0.b();
            a aVar = new a(this.f6608b, this.f6609c, this.f6610d, null);
            this.f6607a = 1;
            Object objG = AbstractC3289i.g(kB, aVar, this);
            return objG == objE ? objE : objG;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(Uri uri, long j10, long j11, Ed.b bVar) {
        a aVar;
        Object objB;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f6606b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f6606b = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objC = aVar.f6605a;
        Object objE = Fd.b.e();
        int i11 = aVar.f6606b;
        try {
            if (i11 == 0) {
                r.b(objC);
                q.a aVar2 = q.f327b;
                b bVar2 = new b(uri, j10, j11, null);
                aVar.f6606b = 1;
                objC = c1.c(j10 + j11, bVar2, aVar);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objC);
            }
            objB = q.b((Bitmap) objC);
        } catch (Throwable th) {
            q.a aVar3 = q.f327b;
            objB = q.b(r.a(th));
        }
        if (q.f(objB)) {
            return null;
        }
        return objB;
    }

    public static /* synthetic */ Object b(Uri uri, long j10, long j11, Ed.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 8000;
        }
        if ((i10 & 4) != 0) {
            j11 = 8000;
        }
        return a(uri, j10, j11, bVar);
    }
}
