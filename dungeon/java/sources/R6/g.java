package R6;

import If.AbstractC1101c;
import If.InterfaceC1107i;
import If.Y;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import p339sf.D;
import p339sf.x;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f10880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f10881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f10882d;

    public static final class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10883a;

        a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void a() {
            long j10 = this.f10883a;
            long jA = g.this.a();
            g.this.f10881c.a(j10, jA, j10 == jA);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            super.write(i10);
            this.f10883a++;
            a();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            super.write(data, i10, i11);
            this.f10883a += (long) i11;
            a();
        }
    }

    public g(D requestBody, f progressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f10880b = requestBody;
        this.f10881c = progressListener;
    }

    private final Y h(InterfaceC1107i interfaceC1107i) {
        return AbstractC1101c.a().d(new a(interfaceC1107i.X()));
    }

    @Override // p339sf.D
    public long a() {
        if (this.f10882d == 0) {
            this.f10882d = this.f10880b.a();
        }
        return this.f10882d;
    }

    @Override // p339sf.D
    public x b() {
        return this.f10880b.b();
    }

    @Override // p339sf.D
    public void f(InterfaceC1107i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InterfaceC1107i interfaceC1107iA = AbstractC1101c.a().a(h(sink));
        a();
        this.f10880b.f(interfaceC1107iA);
        interfaceC1107iA.flush();
    }
}
